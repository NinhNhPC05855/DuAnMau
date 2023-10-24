/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.edusys.dao;

import com.edusys.entity.NguoiHoc;
import com.edusys.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class NguoiHocDAO extends EduSysDAO<NguoiHoc, String> {

//    String INSERT_SQL = "INSERT INTO NguoiHoc (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV, NgayDK)\n"
//            + "VALUES (?,?,?,?,?,?,?,?,?)";
//    String UPDATE_SQL = "UPDATE NguoiHoc SET HoTen =?, NgaySinh =?, GioiTinh =?, "
//            + "DienThoai =?, Email =?, GhiChu =?, MaNV =?, NgayDK =?\n"
//            + "where MaNH = ?";
//    String DELETE_SQL = "DELETE FROM NguoiHoc WHERE MaNH =?";
//    String SELECT_ALL_SQL = "SELECT *FROM NguoiHoc";
//    String SELECT_BY_ID_SQL = "SELECT *FROM NguoiHoc WHERE MaNH =?";

      String INSERT_SQL = "INSERT INTO NguoiHoc (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE NguoiHoc SET HoTen=?, NgaySinh=?, GioiTinh=?, DienThoai=?, Email=?, GhiChu=?,MaNV=? WHERE MaNH=?";
    String DELETE_SQL = "DELETE FROM NguoiHoc WHERE MaNH=?";
    String SELECT_ALL_SQL = "SELECT * FROM NguoiHoc";
    String SELECT_BY_ID_SQL = "SELECT * FROM NguoiHoc WHERE MaNH=?";
    String SELECT_NH_SQL = "Select * from nguoihoc where maNH not in(select  manh from hocvien)";

    @Override
    public void insert(NguoiHoc entity) {
        JdbcHelper.update(INSERT_SQL,
                entity.getMaNH(), entity.getHoTen(), entity.getNgaySinh(), entity.isGioiTinh(), entity.getDienThoai(), entity.getEmail(), entity.getGhiChu(),
                entity.getMaNV());

    }

    @Override
    public void update(NguoiHoc entity) {
        JdbcHelper.update(UPDATE_SQL,
                entity.getHoTen(), entity.getNgaySinh(), entity.isGioiTinh(), entity.getDienThoai(), entity.getEmail(), entity.getGhiChu(),
                entity.getMaNV(), entity.getNgayDK(), entity.getMaNH());
    }

    @Override
    public void delete(String key) {
        JdbcHelper.update(DELETE_SQL, key);

    }

    @Override
    public List<NguoiHoc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NguoiHoc selectById(String key) {
        List<NguoiHoc> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;

        }
        return list.get(0);
    }

    @Override
    protected List<NguoiHoc> selectBySql(String sql, Object... args) {
        List<NguoiHoc> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                NguoiHoc entity = new NguoiHoc();
                entity.setMaNH(rs.getString("MaNH"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setDienThoai(rs.getString("DienThoai"));
                entity.setEmail(rs.getString("Email"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setMaNV(rs.getString("MaNV"));
                 entity.setNgayDK(rs.getDate("NgayDK"));

                list.add(entity);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
             e.printStackTrace();
            throw new RuntimeException();
           
        }
        return list;
    }
    //tim kiếm
    
    public List<NguoiHoc> selectByKeyword(String keyword){
        String sql = "select * from NguoiHoc where HoTen like ?";
        return this.selectBySql(sql,"%" + keyword + "%");
    }

  public List<NguoiHoc> selectNotInCourse(int makh, String keyword) {
        String sql = "SELECT * FROM NguoiHoc WHERE HoTen LIKE ? AND "
                + "MaNH NOT IN(SELECT MaNH FROM HocVien WHERE MaKH = ?)";
        return this.selectBySql(sql, "%" + keyword + "%", makh);
    }

public List<NguoiHoc> selectAllNH_Not_IN_HV() {
        return this.selectBySql(SELECT_NH_SQL);

    }

}
