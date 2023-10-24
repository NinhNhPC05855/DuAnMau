    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.dao;

import com.edusys.entity.HocVien;
import com.edusys.utils.JdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class HocVienDAO extends EduSysDAO<HocVien, Integer> {
    

    String INSERT_SQL = "INSERT INTO HocVien(MAKH, MaNH, Diem)VALUES (?,?,?)";
    String UPDATE_SQL = "UPDATE HocVien SET Diem = ?  where MaHV = ? ";
   String DELETE_SQL = "DELETE FROM HocVien WHERE MaHV=?";
    String SELECT_ALL_SQL = "SELECT * FROM HocVien";
    String SELECT_BY_ID_SQL = "SELECT * FROM HocVien WHERE MaHV=?";
    String SELECT_ALL_HV = "Select * from NguoiHoc A join HocVien B ON A.MaNH = B.MaNH Where B.MAKH =?";

    @Override
    public void insert(HocVien entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getMaKH(), entity.getMaNH(), entity.getDiem());

    }

    @Override
    public void update(HocVien entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getDiem(),entity.getMaHV());

    }

     @Override
    public void delete(Integer key) {
        JdbcHelper.update(DELETE_SQL, key);

    }

    @Override
    public List<HocVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    protected List<HocVien> selectBySql(String sql, Object... args) {
        List<HocVien> list = new ArrayList<HocVien>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                HocVien entity = new HocVien();
                entity.setMaHV(rs.getInt("MaHV"));
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaNH(rs.getString("MaNH"));
                entity.setTen(rs.getString("HoTen"));
                entity.setDiem(rs.getDouble("Diem"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }
  public List<HocVien> selectByKhoaHoc(int makh) {
        String SQL = "SELECT * FROM HocVien WHERE MaKH = ?";
        return this.selectBySql(SQL, makh);
  }   

    @Override
    public HocVien selectById(Integer key) {
       List<HocVien> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;

        }
        return list.get(0); 
    }
    public List<HocVien> selectHV(int maKH) {
        return this.selectBySql(SELECT_ALL_HV, maKH);
//        return this.selectBysql(SELECT_ALL_SQL);
    }

}
