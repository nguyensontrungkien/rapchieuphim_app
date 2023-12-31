/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.demo.model;

import com.raven.model.Model_ChonTopping;
import com.raven.model.ThanhToan;
import com.raven.model.Topping;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author TRA
 */
public class Model_CTopping extends javax.swing.JPanel {

    /**
     * Creates new form Model_CTopping
     */
    Topping tp;

    public Model_CTopping() {
        initComponents();
    }

    public Model_CTopping(Topping tp) {
        initComponents();
        this.tp = tp;
        chkTenTopping.setText(tp.getTenTopping());
        lblHinh.setIcon(resizeImage("src/main/resources/topping/" + tp.getHinh()));
        snSoLuong.setEnabled(chkTenTopping.isSelected());
        lblGia.setText(tp.getGia() + "");
        snSoLuong.setValue(0);

 
    }

    public ImageIcon resizeImage(String path) {
        ImageIcon ii = new ImageIcon(path);
        ImageIcon imageIcon = new ImageIcon(ii.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH));
        return imageIcon;
    }

    public static Object readObj(String path) throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        if (ois == null) {
            return null;
        }
        return ois.readObject();
    }

    public static void writeObj(String path, Object data) throws FileNotFoundException, IOException {
        try (
                 FileOutputStream fos = new FileOutputStream(path);  ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(data);
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

        jPanel1 = new javax.swing.JPanel();
        lblHinh = new javax.swing.JLabel();
        chkTenTopping = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        snSoLuong = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        chkTenTopping.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        chkTenTopping.setText("jCheckBox1");
        chkTenTopping.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkTenToppingStateChanged(evt);
            }
        });
        chkTenTopping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTenToppingActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Số lượng :");

        snSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        snSoLuong.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                snSoLuongStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Gía :");

        lblGia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(chkTenTopping)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblGia))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(snSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkTenTopping)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(snSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblGia))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void snSoLuongStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_snSoLuongStateChanged
        // TODO add your handling code here:
        if (snSoLuong.isEnabled()) {
            try {
                ThanhToan tt = (ThanhToan) readObj("temp.txt");
                List<Topping> list = new ArrayList<>();
                int k = 0;
                if (tt.getListTopping() != null) {
                    list = tt.getListTopping();
                    for (int i = 0; i < list.size(); i++) {

                        if (list.get(i).getMaTopping().equalsIgnoreCase(tp.getMaTopping())) {
                            list.set(i, new Topping(tp.getMaTopping(), tp.getTenTopping(), tp.getGia(), (int) snSoLuong.getValue()));
                            k++;
                            break;
                        }
                    }
                    if (k == 0) {
                        list.add(new Topping(tp.getMaTopping(), tp.getTenTopping(), tp.getGia(), (int) snSoLuong.getValue()));
                    }
                    k = 0;

                } else {
                    list = new ArrayList<>();
                    list.add(new Topping(tp.getMaTopping(), tp.getTenTopping(), tp.getGia(), (int) snSoLuong.getValue()));
                }
                System.out.println(list.size());
                System.out.println(snSoLuong.getValue());
                tt.setListTopping(list);

                writeObj("temp.txt", tt);
            } catch (IOException ex) {
                Logger.getLogger(Model_ChonTopping.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Model_ChonTopping.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_snSoLuongStateChanged

    private void chkTenToppingStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkTenToppingStateChanged
        // TODO add your handling code here:
        snSoLuong.setEnabled(chkTenTopping.isSelected());
    }//GEN-LAST:event_chkTenToppingStateChanged

    private void chkTenToppingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkTenToppingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTenToppingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkTenTopping;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JSpinner snSoLuong;
    // End of variables declaration//GEN-END:variables
}
