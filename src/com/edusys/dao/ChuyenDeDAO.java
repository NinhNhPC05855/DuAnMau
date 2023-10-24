/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.dao;

import com.edusys.entity.ChuyenDe;
import com.edusys.utils.JdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class ChuyenDeDAO extends EduSysDAO<ChuyenDe, String> {
    
    String INSERT_SQL = "INSERT INTO ChuyenDe(MaCD, TenCD, HocPhi, ThoiLuong, Hinh)VALUES (?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE ChuyenDe SET TenCD =?, HocPhi =?, ThoiLuong =?, Hinh =?, MoTa =? where MACD = ?";
    String DELETE_SQL = "DELETE FROM ChuyenDe where MaCD=?";
    String SELECT_ALL_SQL = "SELECT *FROM ChuyenDe";
    String SELECT_BY_ID_SQL = "SELECT *FROM ChuyenDe WHERE MaCD =?";
    
    @Override
    public void insert(ChuyenDe entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getMaCD(),
                entity.getTenCD(),
                entity.getHocPhi(),
                entity.getThoiLuong(),
                entity.getHinh());
        
    }
    
    @Override
    public void update(ChuyenDe entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getTenCD(),
                entity.getHocPhi(),
                entity.getThoiLuong(),
                entity.getHinh(),
                 entity.getMoTa(),
                entity.getMaCD());
        
    }
    
    @Override
    public void delete(String key) {
        JdbcHelper.update(DELETE_SQL, key);
    }
    
    @Override
    public List<ChuyenDe> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }
    
    @Override
    public ChuyenDe selectById(String key) {
        List<ChuyenDe> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
            
        }
        return list.get(0);
    }
    
    @Override
    protected List<ChuyenDe> selectBySql(String sql, Object... args) {
        List<ChuyenDe> list = new ArrayList<ChuyenDe>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                ChuyenDe entity = new ChuyenDe();
                entity.setMaCD(rs.getString("MaCD"));
                entity.setTenCD(rs.getString("TenCD"));
                entity.setHocPhi(rs.getDouble("HocPhi"));
                entity.setThoiLuong(rs.getInt("ThoiLuong"));
                entity.setHinh(rs.getString("Hinh"));
                entity.setMoTa(rs.getString("MoTa"));
                
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }
    
}
