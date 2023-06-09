/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formAdmin;

import koneksi.koneksi;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pesanDialog.BerhasilHapus;
import pesanDialog.BerhasilUbah;
import pesanDialog.GagalHapus;
import pesanDialog.GagalSimpan;
import pesanDialog.GagalUbah;
import pesanDialog.simpan;
import transisi.TransisiForm;

/**
 *
 * @author KRISNA
 */
public class FormAdminStaffManagement extends TransisiForm {

    Connection conn;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form Form
     */
    public FormAdminStaffManagement() {
        initComponents();
        Nama();
        table();
        table.fixTable(jScrollPane1);
        DefaultTableModel mode = (DefaultTableModel) table.getModel();
    }

    public void Nama() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mbaknis", "root", "");
            String sql = "SELECT username FROM login WHERE role = 'Staff' ORDER BY id_login DESC LIMIT 1";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                nama_staff.setText(rs.getString(1));
            }
        } catch (SQLException e) {
        }

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mbaknis", "root", "");
            String sql = "SELECT id_login FROM login where role = 'Staff' ORDER BY id_login DESC LIMIT 1";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                id_login.setText(rs.getString(1));
            }
        } catch (SQLException e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_hapus = new swing.Button();
        btn_ubah = new swing.Button();
        btn_simpan = new swing.Button();
        jComboBox1 = new javax.swing.JComboBox<>();
        no_hp_staff = new javax.swing.JTextField();
        alamat_staff = new javax.swing.JTextField();
        nama_staff = new javax.swing.JTextField();
        id_staff = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new customtable.CustomTable();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_hapus.setBackground(new java.awt.Color(255, 61, 61));
        btn_hapus.setForeground(new java.awt.Color(255, 255, 255));
        btn_hapus.setText("Hapus");
        btn_hapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });
        add(btn_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 100, 40));

        btn_ubah.setBackground(new java.awt.Color(73, 255, 90));
        btn_ubah.setForeground(new java.awt.Color(255, 255, 255));
        btn_ubah.setText("Ubah");
        btn_ubah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });
        add(btn_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 100, 40));

        btn_simpan.setBackground(new java.awt.Color(105, 152, 171));
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setText("Simpan");
        btn_simpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        add(btn_simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 100, 40));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - Laki", "Perempuan" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 200, 30));

        no_hp_staff.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        add(no_hp_staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 200, 30));

        alamat_staff.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        add(alamat_staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 200, 30));

        nama_staff.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        add(nama_staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 200, 30));

        id_staff.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        id_staff.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                id_staffKeyReleased(evt);
            }
        });
        add(id_staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 200, 30));

        id_login.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        id_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_loginActionPerformed(evt);
            }
        });
        add(id_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 200, 30));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 550, 280));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageForm/AdminManajemenStaff.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void id_staffKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_staffKeyReleased
        // TODO add your handling code here:
//        try {
//            int id = Integer.parseInt(id_staff.getText());
//        } catch (NumberFormatException ex) {
//            id_staff.setText(null);
//        }
    }//GEN-LAST:event_id_staffKeyReleased

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        try {
            String sql = "insert into staff (kode_staff,nama_staff,alamat,no_hp,jk,id_login) values ('" + id_staff.getText() + "','" + nama_staff.getText() + "','" + alamat_staff.getText() + "','" + no_hp_staff.getText() + "','" + jComboBox1.getSelectedItem() + "','" + id_login.getText() + "')";
            conn = (Connection) koneksi.configDB();
            pst = conn.prepareStatement(sql);
            pst.execute();
            //notif berhasil
            simpan sp = new simpan();
            sp.setVisible(true);
        } catch (Exception e) {
            //notif gagal
            GagalSimpan gs = new GagalSimpan();
            gs.setVisible(true);
        }
        table();
        id_staff.setText("");
        nama_staff.setText("");
        alamat_staff.setText("");
        no_hp_staff.setText("");
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        try {
            String sql = "UPDATE staff SET kode_staff = '" + id_staff.getText() + "', nama_staff = '" + nama_staff.getText() + "',alamat = '" + alamat_staff.getText() + "',no_hp = '" + no_hp_staff.getText() + "',jk = '" + jComboBox1.getSelectedItem() + "' WHERE kode_staff = " + id_staff.getText() + "";
            conn = (Connection) koneksi.configDB();
            pst = conn.prepareStatement(sql);
            pst.execute();
            //notif Berhasil atau pemanggilan object (instansiasi dari pesan dialog)
            BerhasilUbah ub = new BerhasilUbah();
            ub.setVisible(true);
            table();
        } catch (Exception e) {
            //notif gagal
            GagalUbah gu = new GagalUbah();
            gu.setVisible(true);
        }
        id_staff.setText("");
        nama_staff.setText("");
        alamat_staff.setText("");
        no_hp_staff.setText("");
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        try {
            String sql1 = "DELETE FROM staff WHERE kode_staff = " + id_staff.getText() + "";
            String sql2 = "DELETE FROM login WHERE id_login = " + id_login.getText() + "";
            conn = (Connection) koneksi.configDB();
            java.sql.PreparedStatement pst1 = conn.prepareStatement(sql1);
            java.sql.PreparedStatement pst2 = conn.prepareStatement(sql2);
            pst1.execute();
            pst2.execute();
            table();
            //notif berhasil
            BerhasilHapus bh = new BerhasilHapus();
            bh.setVisible(true);
        } catch (Exception e) {
            //notif gagal
            GagalHapus gh = new GagalHapus();
            gh.setVisible(true);
        }
        id_staff.setText("");
        nama_staff.setText("");
        alamat_staff.setText("");
        no_hp_staff.setText("");
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void id_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_loginActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int baris = table.getSelectedRow();
        if (baris != 1);
        {
            String no = table.getValueAt(baris, 0).toString();
            id_staff.setText(no);
            String nolog = table.getValueAt(baris, 5).toString();
            id_login.setText(nolog);
            String nama = table.getValueAt(baris, 1).toString();
            nama_staff.setText(nama);
            String alamat = table.getValueAt(baris, 2).toString();
            alamat_staff.setText(alamat);
            String hp = table.getValueAt(baris, 3).toString();
            no_hp_staff.setText(hp);
        }
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat_staff;
    private swing.Button btn_hapus;
    private swing.Button btn_simpan;
    private swing.Button btn_ubah;
    public static final javax.swing.JTextField id_login = new javax.swing.JTextField();
    private javax.swing.JTextField id_staff;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama_staff;
    private javax.swing.JTextField no_hp_staff;
    private customtable.CustomTable table;
    // End of variables declaration//GEN-END:variables

    private void table() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Kode Staff");
        model.addColumn("Nama");
        model.addColumn("Alamat");
        model.addColumn("Kontak");
        model.addColumn("JK");
        model.addColumn("ID Login");

        try {
            String sql = "SELECT * FROM staff";
            java.sql.Connection konek = (Connection) koneksi.configDB();
            pst = konek.prepareStatement(sql);
            rs = pst.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1),
                    rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(7), rs.getString(8)
                });
                table.setModel(model);
            }
        } catch (SQLException e) {
        }
    }
}
