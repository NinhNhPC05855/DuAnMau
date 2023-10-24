/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.utils;
import java.sql.*;
/**
 *
 * @author DELL
 */
public class JdbcHelper {
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String dburl = "jdbc:sqlserver://localhost:1433;database=EDUSYS_ASM;encrypt=false";
    static String user = "sa";
    static String pass = "12345";
   //SQLEXPRESS:1433
    static {
        try {
            Class.forName(driver);
            System.out.println("Kết nối thành công");
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }
    

    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(dburl, user, pass);
        PreparedStatement sttm;
        if (sql.startsWith("{")) {
            sttm = conn.prepareCall(sql);
        } else {
            sttm = conn.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            sttm.setObject(i + 1, args[i]);
        }
        return sttm;
    }   
    public static ResultSet query(String sql, Object... args) throws SQLException{
        PreparedStatement sttm = JdbcHelper.getStmt(sql, args);
        return sttm.executeQuery();
    }
    public static Object value(String sql, Object... args) throws SQLException{
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            if(rs.next()){
                return rs.getObject(1);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static int update(String sql, Object... args){
        try {
            PreparedStatement sttm = JdbcHelper.getStmt(sql, args);
            try {
                return sttm.executeUpdate();
            } finally {
                sttm.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
