/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import FormLoginRegister.LoginMain;
import formAdmin.FormAdminStaffManagement;
import formAdmin.FormAdminAttendance;
import formAdmin.FormAdminDashboard;
import formAdmin.FormAdminLogout;
import formAdmin.FormAdminReport;
import formAdmin.FormAdminSetting;
import formAdmin.FormAdminStockAvailable;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import swing.EventNavigasiBar;
import swing.NavigasiBackgroundColor;

/**
 *
 * @author KRISNA
 */
public class MainAdmin extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public MainAdmin() {
        initComponents();

        getContentPane().setBackground(new Color(240, 240, 240));

        navigasiBar1.addItem(new ImageIcon(getClass().getResource("/image/4staff management.png")));
        navigasiBar1.addItem(new ImageIcon(getClass().getResource("/image/3present.png")));
        navigasiBar1.addItem(new ImageIcon(getClass().getResource("/image/5stock available.png")));
        navigasiBar1.addItem(new ImageIcon(getClass().getResource("/image/1squaredmenu.png")));
        navigasiBar1.addItem(new ImageIcon(getClass().getResource("/image/6piechart.png")));
        navigasiBar1.addItem(new ImageIcon(getClass().getResource("/image/7setting.png")));
        navigasiBar1.addItem(new ImageIcon(getClass().getResource("/image/8logout.png")));

        navigasiBar1.addEvent(new EventNavigasiBar() {
            @Override
            public void beforeSelected(int index) {
                if (index == 0) {
                    panelTransisi1.display(new FormAdminStaffManagement(), navigasiBar1.getAnimator());

                } else if (index == 1) {
                    panelTransisi1.display(new FormAdminAttendance(), navigasiBar1.getAnimator());

                } else if (index == 2) {
                    panelTransisi1.display(new FormAdminStockAvailable(), navigasiBar1.getAnimator());

                } else if (index == 3) {

                    try {
                        panelTransisi1.display(new FormAdminDashboard(), navigasiBar1.getAnimator());
                    } catch (SQLException ex) {
                        Logger.getLogger(MainAdmin.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else if (index == 4) {
                    try {
                        panelTransisi1.display(new FormAdminReport(), navigasiBar1.getAnimator());
                    } catch (SQLException ex) {
                        Logger.getLogger(MainAdmin.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else if (index == 5) {
                    panelTransisi1.display(new FormAdminSetting(), navigasiBar1.getAnimator());

                } else if (index == 6) {
                    panelTransisi1.display(new FormAdminLogout(), navigasiBar1.getAnimator());

                }
            }

            @Override
            public void afterSelected(int index) {

            }
        });

        NavigasiBackgroundColor nb = new NavigasiBackgroundColor();
        nb.apply(getContentPane());
        nb.addColor(0, new Color(82, 82, 82));
        nb.addColor(1, new Color(82, 82, 82));
        nb.addColor(2, new Color(82, 82, 82));
        nb.addColor(3, new Color(82, 82, 82));
        nb.addColor(4, new Color(82, 82, 82));
        nb.addColor(5, new Color(82, 82, 82));
        nb.addColor(6, new Color(82, 82, 82));
        navigasiBar1.setnavigasiBackgroundColor(nb);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        panelTransisi1 = new transisi.PanelTransisi();
        navigasiBar1 = new swing.NavigasiBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 30, 20));

        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 10, 30, 20));
        getContentPane().add(panelTransisi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 560));

        javax.swing.GroupLayout navigasiBar1Layout = new javax.swing.GroupLayout(navigasiBar1);
        navigasiBar1.setLayout(navigasiBar1Layout);
        navigasiBar1Layout.setHorizontalGroup(
            navigasiBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        navigasiBar1Layout.setVerticalGroup(
            navigasiBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(navigasiBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 1050, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        navigasiBar1.initSelectedIndex(3);
    }//GEN-LAST:event_formWindowOpened

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(MainAdmin.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

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
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel minimize;
    private swing.NavigasiBar navigasiBar1;
    private transisi.PanelTransisi panelTransisi1;
    // End of variables declaration//GEN-END:variables
}
