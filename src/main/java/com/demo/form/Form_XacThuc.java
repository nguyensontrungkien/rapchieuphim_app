/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.form;

import com.raven.main.Main;
import com.raven.sendEmail.EmailMain;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author TRA
 */
public class Form_XacThuc extends javax.swing.JPanel {

    /**
     * Creates new form Form_XacThuc
     */
    String maXacThuc;
    public Form_XacThuc() {
        initComponents();
        EmailMain.GuiEmail("");
        this.mainJPanel = Main.mainF;
    }
    JPanel mainJPanel;

    public Form_XacThuc(JPanel mainpJPanel) {
        initComponents();
        EmailMain.GuiEmail("");
        this.mainJPanel = mainpJPanel;
    }

    public static void DoiMatKhau() {
//        com.raven.sendEmail.EmailMain.GuiEmail("phamthitra1507@gmail.com");
       
//        String maXacThuc = JOptionPane.showInputDialog(null, "Nhập mã xác thực email");
//
//        if (maXacThuc.equals("")) {
//            JOptionPane.showMessageDialog(null, "Chưa nhập mã xác thực");
//        } else {
//            if (maXacThuc.equals(com.raven.sendEmail.EmailMain.maxt)) {
//                JOptionPane.showMessageDialog(null, "Đã nhập chính xác!");
//                Form_DoiMatKhau doimk = new Form_DoiMatKhau();
//                doimk.setVisible(true);
//            } else {
//                JOptionPane.showMessageDialog(null, "Nhập không chính xác!");
//            }
//        }

    }
//    public void checkVailidate() {
//        
//             if(String.valueOf(txtMaXacThuc).length()==0){
//                 txtMaXacThuc.setBackground(Color.yellow);
//                 lblMXT.setText("Chưa nhập mã xác thực");
//                 
//             }else{
//                 txtMaXacThuc.setBackground(Color.white);
//                 lblMaXacThuc.setText("");
//             }
//
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMaXacThuc = new javax.swing.JLabel();
        txtMaXacThuc = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        lblMXT = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setOpaque(false);

        lblMaXacThuc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMaXacThuc.setText("Nhập mã xác thực");

        btnOk.setBackground(new java.awt.Color(255, 0, 0));
        btnOk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOk.setForeground(new java.awt.Color(255, 255, 255));
        btnOk.setText("OK");
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOkMouseClicked(evt);
            }
        });
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaXacThuc)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMaXacThuc)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblMXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(btnOk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblMaXacThuc)
                .addGap(18, 18, 18)
                .addComponent(txtMaXacThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMXT, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOk)
                    .addComponent(btnCancel))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        mainJPanel.removeAll();
        mainJPanel.add(new Form_DoiMatKhau());
        mainJPanel.repaint();
        mainJPanel.revalidate();
//        com.raven.sendEmail.EmailMain.GuiEmail(maXacThuc);
//        DoiMatKhau();
    }//GEN-LAST:event_btnOkActionPerformed

    private void btnOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnOkMouseClicked

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMXT;
    private javax.swing.JLabel lblMaXacThuc;
    private javax.swing.JTextField txtMaXacThuc;
    // End of variables declaration//GEN-END:variables

}
