/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formStaff;

import transisi.TransisiForm;

/**
 *
 * @author KRISNA
 */
public class FormStaffLogout extends TransisiForm {

    /**
     * Creates new form formStaffDashboard
     */
    public FormStaffLogout() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button4 = new swing.Button();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button4.setBackground(new java.awt.Color(73, 255, 90));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("YA");
        button4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 230, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageForm/LogOut.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_button4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
