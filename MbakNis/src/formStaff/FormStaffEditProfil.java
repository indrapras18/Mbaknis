/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formStaff;

import transisi.TransisiForm;
//import intface.olah_staff;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.AbstractBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import pesanDialog.BerhasilSimpan;

/**
 *
 * @author KRISNA
 */
public class FormStaffEditProfil extends TransisiForm {

    private final AbstractBorder circleBorder = new CircleBorder();
    static boolean maximized = true;
    int xMouse;
    int yMouse;

    File f = null;
    String path = null;
    private ImageIcon format = null;
    String fname = null;
    int s = 0;
    byte[] pimage = null;

    Connection conn;
    ResultSet rs = null;
    PreparedStatement pst = null;
    BufferedImage bufferedImage = null;
    byte[] person_image;
    private BufferedImage image;

    /**
     * Creates new form formStaffDashboard
     */
    public FormStaffEditProfil() {
        initComponents();
        initComponents();
        this.person_image = null;
        imgX.setBorder(circleBorder);
        imgX.setForeground(new Color(0, 0, 0, 0));
        imgX.setBackground(new Color(0, 0, 0, 0));
    }
    public void LoadImage() {
        try {
            byte[] imagedata = rs.getBytes("Image");
            format = new ImageIcon(imagedata);
            Image mm = format.getImage();
            Image img2 = mm.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            ImageIcon image = new ImageIcon(img2);

            imgX.setIcon(image);
        } catch (SQLException ex) {
            Logger.getLogger(FormStaffEditProfil.class.getName()).log(Level.SEVERE, null, ex);
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

        btn_upload = new swing.Button();
        btn_ubah = new swing.Button();
        btn_reset = new swing.Button();
        txt_ID = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        txt_no_hp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_alamat = new javax.swing.JTextArea();
        txt_location = new javax.swing.JTextField();
        imgX = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_upload.setBackground(new java.awt.Color(255, 202, 73));
        btn_upload.setForeground(new java.awt.Color(82, 82, 82));
        btn_upload.setText("Unggah Gambar");
        btn_upload.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uploadActionPerformed(evt);
            }
        });
        add(btn_upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 190, 40));

        btn_ubah.setBackground(new java.awt.Color(73, 255, 90));
        btn_ubah.setForeground(new java.awt.Color(255, 255, 255));
        btn_ubah.setText("Ubah");
        btn_ubah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });
        add(btn_ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 120, 40));

        btn_reset.setBackground(new java.awt.Color(255, 61, 61));
        btn_reset.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset.setText("Reset");
        btn_reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 120, 40));

        txt_ID.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txt_ID.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                txt_IDComponentRemoved(evt);
            }
        });
        txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IDActionPerformed(evt);
            }
        });
        txt_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_IDKeyReleased(evt);
            }
        });
        add(txt_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 250, 30));

        txt_nama.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 250, 30));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - laki", "perempuan" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 250, 30));

        txt_no_hp.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        add(txt_no_hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 250, 30));

        txt_alamat.setColumns(20);
        txt_alamat.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txt_alamat.setRows(5);
        jScrollPane1.setViewportView(txt_alamat);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 250, 80));

        txt_location.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        txt_location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_locationActionPerformed(evt);
            }
        });
        add(txt_location, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 190, 30));

        imgX.setBackground(new java.awt.Color(255, 255, 255));
        imgX.setForeground(new java.awt.Color(255, 255, 255));
        imgX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgX.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(imgX, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 190, 190));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageForm/StaffEditProfil.png"))); // NOI18N
        jLabel1.setText("EDIT PROFIL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_IDComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txt_IDComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDComponentRemoved

    private void txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_IDActionPerformed

    private void txt_IDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_IDKeyReleased
        //        // TODO add your handling code here:

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mbaknis", "root", "");
            java.sql.Statement state = conn.createStatement();
            String sql = "select nama_staff,jk ,no_hp, alamat ,Image_path ,Image from staff where kode_staff = " + txt_ID.getText();

            rs = state.executeQuery(sql);
            if (sql != txt_ID.getText()) {
                txt_nama.setText(null);
                txt_no_hp.setText(null);
                txt_alamat.setText(null);

                txt_location.setText(null);
                imgX.setIcon(null);
            }

            while (rs.next()) {
                txt_nama.setText(rs.getString(1));
                jComboBox1.setSelectedItem(rs.getString(2));
                txt_no_hp.setText(rs.getString(3));
                txt_alamat.setText(rs.getString(4));

                txt_location.setText(rs.getString(5));

            }

        } catch (Exception e) {
            //            JOptionPane.showMessageDialog(imgX, "dek dek");
        }
        //test
        String imgID = txt_ID.getText();
        try {
            pst = conn.prepareStatement("SELECT Image FROM staff WHERE kode_staff=?");
            pst.setString(1, imgID);
            rs = pst.executeQuery();

            if (rs.next()) {
                LoadImage();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormStaffEditProfil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_IDKeyReleased

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void txt_locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_locationActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        System.out.print("Image Path - = " + path);
        //        System.out.print("Image Name - = "+f.getName());
        try {

            InputStream is = new FileInputStream(f);
            pst = conn.prepareStatement(" UPDATE staff SET nama_staff =? ,jk =? , alamat =?, no_hp =? ,Image_Path=? , Image=?  WHERE kode_staff = " + txt_ID.getText());
            pst.setString(1, txt_nama.getText());
            pst.setString(2, (String) jComboBox1.getSelectedItem());
            pst.setString(3, txt_alamat.getText());
            pst.setString(4, txt_no_hp.getText());
            pst.setString(5, path);
            pst.setBlob(6, is);

            int inserted = pst.executeUpdate();
            if (inserted > 0) {
//                BerhasilSimpan bs = new BerhasilSimpan();
//                bs.setVisible(true);
                JOptionPane.showMessageDialog(null, "Data Successfully Inserted");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FormStaffEditProfil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormStaffEditProfil.class.getName()).log(Level.SEVERE, null, ex);
        }
        //        Table();
        //        addTableHeader();
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        imgX.setIcon(null);
        txt_ID.setText(null);
        txt_nama.setText(null);
        txt_alamat.setText(null);
        txt_no_hp.setText(null);
        txt_location.setText(null);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uploadActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        chooser.addChoosableFileFilter(fnef);
        int load = chooser.showOpenDialog(null);

        if (load == chooser.APPROVE_OPTION) {
            f = chooser.getSelectedFile();

            path = f.getAbsolutePath();
            txt_location.setText(path);
            ImageIcon ii = new ImageIcon(path);
            Image img = ii.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            imgX.setIcon(new ImageIcon(img));
        }
    }//GEN-LAST:event_btn_uploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btn_reset;
    private swing.Button btn_ubah;
    private swing.Button btn_upload;
    private javax.swing.JLabel imgX;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextArea txt_alamat;
    private javax.swing.JTextField txt_location;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_no_hp;
    // End of variables declaration//GEN-END:variables
}
