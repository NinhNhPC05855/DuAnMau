/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.edusys.ui;

import com.edusys.dao.ChuyenDeDAO;
import com.edusys.dao.HocVienDAO;
import com.edusys.dao.KhoaHocDAO;
import com.edusys.dao.NguoiHocDAO;
import com.edusys.entity.ChuyenDe;
import com.edusys.entity.HocVien;
import com.edusys.entity.KhoaHoc;
import com.edusys.entity.NguoiHoc;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class QuanLyHOCVIENDialog extends javax.swing.JDialog {

    /**
     * Creates new form QuanLyHOCVIEN
     */
    public QuanLyHOCVIENDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboChuyenDe = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cboKhoaHoc = new javax.swing.JComboBox<>();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnXoaHV = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHocVien = new javax.swing.JTable();
        btnSuaDiem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        btnThemHV = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Quản Lý Học Viên");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Chuyên Đề");

        cboChuyenDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChuyenDeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Khóa Học");

        cboKhoaHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java01 (2020-04-02)" }));
        cboKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaHocActionPerformed(evt);
            }
        });

        btnXoaHV.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnXoaHV.setText("Xóa Khỏi Khóa Học");
        btnXoaHV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaHVActionPerformed(evt);
            }
        });

        tblHocVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TT", "Mã HV", "Mã NH", "Họ Tên", "Điểm"
            }
        ));
        tblHocVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHocVienMouseClicked(evt);
            }
        });
        tblHocVien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblHocVienKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblHocVien);

        btnSuaDiem.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnSuaDiem.setText("Cập Nhật Điểm");
        btnSuaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoaHV, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(461, Short.MAX_VALUE)
                    .addComponent(btnSuaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnXoaHV)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(428, Short.MAX_VALUE)
                    .addComponent(btnSuaDiem)
                    .addGap(43, 43, 43)))
        );

        tabs.addTab("Học Viên", jPanel1);

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã NH", "Họ Và Tên", "Giới Tinh", "Ngày Sinh", "Điện Thoại ", "Email"
            }
        ));
        tblNguoiHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNguoiHocMouseClicked(evt);
            }
        });
        tblNguoiHoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblNguoiHocKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblNguoiHoc);
        if (tblNguoiHoc.getColumnModel().getColumnCount() > 0) {
            tblNguoiHoc.getColumnModel().getColumn(5).setHeaderValue("Email");
        }

        btnThemHV.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnThemHV.setText("Thêm Vào Khóa Học ");
        btnThemHV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHVActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });
        jPanel3.add(txtTimKiem);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 465, Short.MAX_VALUE)
                        .addComponent(btnThemHV, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThemHV)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tabs.addTab("Người Học", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChuyenDeActionPerformed
        // TODO add your handling code here:

        // fillCboChuyenDe();
        chonChuyenDE();
    }//GEN-LAST:event_cboChuyenDeActionPerformed

    private void cboKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaHocActionPerformed
        // TODO add your handling code here:
        //fillCboKhoaHoc();
        chonKhoaHoc();
    }//GEN-LAST:event_cboKhoaHocActionPerformed

    private void tblHocVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHocVienMouseClicked
        // TODO add your handling code here:
        fillTableHocVien();
    }//GEN-LAST:event_tblHocVienMouseClicked

    private void tblNguoiHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNguoiHocMouseClicked
        // TODO add your handling code here:
        //fillTableNguoiHoc();
        int index = tblNguoiHoc.getSelectedRow();
        manh = (String) tblNguoiHoc.getValueAt(index, 0);
    }//GEN-LAST:event_tblNguoiHocMouseClicked

    private void btnThemHVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHVActionPerformed
        // TODO add your handling code here:
        addHocVien();
    }//GEN-LAST:event_btnThemHVActionPerformed

    private void btnXoaHVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaHVActionPerformed
        // TODO add your handling code here:
        removeHocVien();
    }//GEN-LAST:event_btnXoaHVActionPerformed

    private void btnSuaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaDiemActionPerformed
        // TODO add your handling code here:
        updateDiem();
    }//GEN-LAST:event_btnSuaDiemActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
        // fillTableNguoiHoc();
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        //   fillTableNguoiHoc();
        tim();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void tblNguoiHocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblNguoiHocKeyReleased
        // TODO add your handling code here:
//        int ind = tblHocVien.getSelectedRow();
//       diem = (double) tblHocVien.getValueAt(ind, 0);
//        System.out.println(diem);
//JOptionPane.showMessageDialog(this, diem);
    }//GEN-LAST:event_tblNguoiHocKeyReleased

    private void tblHocVienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblHocVienKeyReleased
        int ind = tblHocVien.getSelectedRow();
        diem = Double.parseDouble(tblHocVien.getValueAt(ind, 4).toString());
        System.out.println(diem);
    }//GEN-LAST:event_tblHocVienKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyHOCVIENDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyHOCVIENDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyHOCVIENDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyHOCVIENDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuanLyHOCVIENDialog dialog = new QuanLyHOCVIENDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSuaDiem;
    private javax.swing.JButton btnThemHV;
    private javax.swing.JButton btnXoaHV;
    private javax.swing.JComboBox<String> cboChuyenDe;
    private javax.swing.JComboBox<String> cboKhoaHoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblHocVien;
    private javax.swing.JTable tblNguoiHoc;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
   ChuyenDeDAO cdDAO = new ChuyenDeDAO();
    KhoaHocDAO khDAO = new KhoaHocDAO();
    NguoiHocDAO nhDAO = new NguoiHocDAO();
    HocVienDAO hvDAO = new HocVienDAO();
    String maCD;
    int makh;
    List<KhoaHoc> listKH = new ArrayList<>();
    List<HocVien> listhv = new ArrayList<>();
    List<NguoiHoc> listNH = new ArrayList<>();
    String manh;
    double diem;

    void init() {
        this.fillCboChuyenDe();
        setLocationRelativeTo(null);
        fillTableNguoiHoc();
        // setIconImage(Ximage.getAppIcon().getImage());
    }

    List<ChuyenDe> chuyende = new ArrayList<>();

    void fillCboChuyenDe() {
        // khởi tạo đối tượng gán vào model
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChuyenDe.getModel(); // được gọi để nhận mô hình danh sách 
        model.removeAllElements(); // xóa các phần tử có sẵn trong model
        // List<ChuyenDe> list = cdDAO.selectAll();
        chuyende = cdDAO.selectAll();
        //duyệt qua từng đối tượng ChuyenDe có trong danh sách 
        // sao mỗi lần lặp
        for (ChuyenDe cd : chuyende) {

            //Thêm tên chuyên đề vào combobox
            model.addElement(cd);
        }
        this.fillCboKhoaHoc();

    }

    void chonChuyenDE() {
        try {
            // lấy số mục được chọn cbo và gán vào index

            int index = cboChuyenDe.getSelectedIndex();
            //đối tượng chuyên đề từ danh sách chuyende tại chỉ số index, sau đó gọi phương thức getMaCD() và gán vào biến macd
            maCD = chuyende.get(index).getMaCD();
            fillCboKhoaHoc();

        } catch (Exception e) {

        }
    }

    void chonKhoaHoc() {
        try {
            // lấy chỉ số của comboBox và gán vào indexKH
            int indexKH = cboKhoaHoc.getSelectedIndex();
            listKH = khDAO.selectAll(); // và gán vào biến listKH
            //Dòng này lấy đối tượng khóa học từ danh sách listKH
            //tại chỉ số indexKH, sau đó gọi phương thức getMaKH() để lấy mã khóa học và gán vào biến makh
            makh = listKH.get(indexKH).getMaKH();
            fillTableHocVien();
        } catch (Exception e) {
        }
    }

    void fillCboKhoaHoc() {
        // khởi tạo đối tượng và gán vào model
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboKhoaHoc.getModel();
        model.removeAllElements(); // xóa các phần tử có sẵn trong comboBoc
        // ChuyenDe cd = (ChuyenDe) cboChuyenDe.getSelectedItem();

        List<KhoaHoc> list = khDAO.selectAllKH(maCD); //mã chuyên đề được sử dụng để lấy danh sách khóa học liên quan
        if (list != null) { // kiểm tra DS
            // List<KhoaHoc> list = khDAO.selectByChuyenDe(cd.getMaCD());
            for (KhoaHoc kh : list) { // duyệt qua từng đối tượng trong danh sách list
                model.addElement(kh.getMaCD() + "(" + kh.getNgayKG() + ")"); // thêm các dối tượng vào comboBox
            }
            this.fillTableHocVien();
        }
    }

    void fillTableHocVien() {
        DefaultTableModel model = (DefaultTableModel) tblHocVien.getModel();
        // DefaultTableModel model = new DefaultTableModel();
        model.setRowCount(0); //xóa toàn bộ dữ liệu đã có trong bảng.
        listhv = hvDAO.selectHV(makh); //mã khóa học được sử dụng để lấy danh sách học viên liên quan
        for (int i = 0; i < listhv.size(); i++) { // duyệt qua từng đối tựng của HV
            //  System.out.println(makh);
            model.addRow(new Object[]{i + 1, // thêm 1 hàng vào bảng
                listhv.get(i).getMaHV(),
                listhv.get(i).getMaNH(),
                listhv.get(i).getTen(),
                listhv.get(i).getDiem()});
        }
//           this.fillTableNguoiHoc();
        //  }
    }

    void fillTableNguoiHoc() {
        DefaultTableModel model = (DefaultTableModel) tblNguoiHoc.getModel();
        model.setRowCount(0);
        //KhoaHoc kh = (KhoaHoc) cboKhoaHoc.getSelectedItem();

        //  để lấy danh sách các đối tượng người học từ SQL
        List<NguoiHoc> list = nhDAO.selectAllNH_Not_IN_HV();
        // List<NguoiHoc> list = nhDAO.selectById(ke)
        for (NguoiHoc nh : list) {
            model.addRow(// thêm 1 hàng vào bảng 
                    new Object[]{
                        nh.getMaNH(),
                        nh.getHoTen(),
                        nh.isGioiTinh() ? "Nam" : "Nữ",
                        XDate.toString(nh.getNgaySinh(), "dd-MM-yyyy"),
                        nh.getDienThoai(),
                        nh.getEmail()});
        }

    }

    void tim() {
        DefaultTableModel model = (DefaultTableModel) tblNguoiHoc.getModel();
        model.setRowCount(0);

//Dòng này lấy nội dung từ textbox txtTimKiem và gán vào biến keyword
        String keyword = txtTimKiem.getText();
        List<NguoiHoc> list = nhDAO.selectByKeyword(keyword);
        // List<NguoiHoc> list = nhDAO.selectById(ke)
        for (NguoiHoc nh : list) { // duyệt qua từng đối tượng người học trong danh sách list
            model.addRow(
                    new Object[]{
                        nh.getMaNH(),
                        nh.getHoTen(),
                        nh.isGioiTinh() ? "Nam" : "Nữ",
                        XDate.toString(nh.getNgaySinh(), "dd-MM-yyyy"),
                        nh.getDienThoai(),
                        nh.getEmail()});
        }

    }

    void addHocVien() {
        HocVien hv = new HocVien();//tạo một đối tượng HocVien mới và gán vào biến hv
        hv.setMaKH(makh);
        hv.setMaNH(manh); //đặt giá trị của mã người học (manh) cho thuộc tính maNH của đối tượng hv.
        hv.setDiem(0);
        hvDAO.insert(hv);
        fillTableNguoiHoc();
        System.out.println(manh);
    }

    void updateDiem() {
        try {
            //lấy chỉ số hàng được chọn từ bảng 
            int row = tblHocVien.getSelectedRow();
            // lấy giá trị trong cột thứ 1 của hàng được chọn trong bảng tblHocVien
            int mahv = Integer.parseInt(tblHocVien.getValueAt(row, 1).toString());
            System.out.println(mahv);
            System.out.println(diem);

            HocVien hv = new HocVien();//tạo ra một đối tượng HocVien mới để đại diện cho học viên 
            hv.setDiem(diem);
            hv.setMaHV(mahv);
            hvDAO.update(hv);
            // System.out.println(diem);
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
            e.printStackTrace();
        }
        this.fillTableHocVien();
    }

    void removeHocVien() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không phải là quản lý không thể xóa!");
        } else {
            int[] rows = tblHocVien.getSelectedRows();//Dòng này lấy danh sách các hàng được chọn trong bảng
            //và gán cho mảng rows
            if (rows.length > 0 && MsgBox.confirm(this, "Bạn có muốn xóa học viên không?")) { // kiểm tra số dòng và sát nhận
                for (int row : rows) { //duyệt qua từng chỉ số hàng trong mảng rows.
                    int mahv = (Integer) tblHocVien.getValueAt(row, 1); //lấy giá trị từ ô vị trí (row, 1) trong bảng tblHocVien 

                    hvDAO.delete(mahv);
                    MsgBox.alert(this, "Xóa thành công!");
                }
                this.fillTableHocVien();
                this.fillTableNguoiHoc();
            }
        }
    }
}