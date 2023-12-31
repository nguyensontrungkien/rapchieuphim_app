/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.form;

import com.demo.DAO.HoaDonDao;
import com.demo.model.HoaDon;
import com.raven.DAO.ConnectDB;
import com.raven.DAO.GheDao;
import com.raven.DAO.NgayChieuDao;
import com.raven.DAO.PhimDao;
import com.raven.DAO.PhongDao;
import com.raven.DAO.VeDao;
import com.raven.main.DangNhap;
import com.raven.main.Main;
import com.raven.model.ThanhToan;
import com.raven.model.Topping;
import com.raven.model.Ve;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;
import java.util.Hashtable;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author Daokh
 */
public class Form_ThanhToan extends javax.swing.JPanel {

    /**
     * Creates new form Form_ThanhToan
     */
    NgayChieuDao daoNC;
    PhimDao daoPhim;
    PhongDao daoPhong;
    GheDao daoGhe;
    HoaDonDao daoHD;
    VeDao daoVe;

    public Form_ThanhToan() {
        initComponents();
        fillThanhToan();
        daoNC = new NgayChieuDao();
        daoPhim = new PhimDao();
        daoPhong = new PhongDao();
        daoGhe = new GheDao();
        daoHD = new HoaDonDao();
        daoVe = new VeDao();
        FillTenPhong();
        GetTime();
        FillTenPhim();
        FillTenPhim();
        FillGhe();
        FillGia();
        fillTopping();
//        FillTopping();
    }

    public void FillTenPhong() {
//        System.out.println(tt.getMaPhim()+","+tt.getNgayChieu()+","+tt.getSTT());
//        String tenphong = daoPhong.SelectPhong(tt.getMaPhim(), tt.getSTT()).getTenPhong();
//        lblTenPhong.setText(tenphong);
    }

    public void GetTime() {
        Date d = new Date();
        lblTime.setText(d.toGMTString());

    }

    public void FillTenPhim() {
        String tenphim = daoPhim.SelectById(tt.getMaPhim()).getTenPhim();
        lblTenPhim.setText(tenphim);
    }

    public void FillGia() {
        lblGia.setText(tt.getGiaGhe() * 1.05 + temp + "");
    }

    public void FillGhe() {
        String tenghe = daoGhe.SelectById(tt.getMaCTGhe()).getTenGhe();
        lblTenGhe.setText(tenghe);
    }

    public static Object readObj(String path) throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        if (ois == null) {
            return null;
        }
        return ois.readObject();
    }
    ThanhToan tt;
    double temp = 0;

    public void fillTopping() {
        try {
            List<Topping> tpList = tt.getListTopping();
            String topping = "";
            for (Topping tp : tpList) {

                topping += (tp.getTenTopping() + " :" + tp.getSoLuongMua() + " x" + tp.getGia() + " = " + tp.getGia() * tp.getSoLuongMua() + "\n");

            }
            lbTopping.setText(topping);
            System.out.println(topping);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillThanhToan() {
        try {
            VeDao daoVe = new VeDao();
            tt = (ThanhToan) readObj("temp.txt");
//            if (tt.getListTopping() != null) {
//                for (Topping s : tt.getListTopping()) {
//                    temp += s.getGia() * s.getSoLuongMua();
//                }
//                daoVe.Insert(new Ve(tt.getGiaGhe() * 1.05 + temp, 0.05, tt.getMaCTGhe(), ""));
//                System.out.println();
//                tt.getListTopping().forEach(s -> {
//                    new ToppingDao().InsertCT(new ChiTietTopping(daoVe.findMaxId(), s.getMaTopping(), s.getSoLuongMua()));
//
//                });
//            } else {
            daoVe.Insert(new Ve(tt.getGiaGhe() * 1.05 + temp, 0.05, tt.getMaCTGhe(), tt.getStt_xc()));
//            }
        } catch (IOException ex) {
            Logger.getLogger(Form_ThanhToan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Form_ThanhToan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public void FillTopping() {
////        System.out.println();
//        tt.getListTopping().forEach(s -> {
//            System.out.println(s.getMaTopping());
//            jPanel1.add(new Model_ChonTopping1(new Topping(s.getMaTopping(), s.getTenTopping(), s.getSoLuongMua())));
//        });
//        jPanel1.removeAll();
//        jPanel1.repaint();
//        jPanel1.revalidate();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblTenPhim = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTenGhe = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTenPhong = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblTenPhim1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lbTopping = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông tin thanh toán");

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTime.setText("15-02-2022  9:00AM");

        lblTenPhim.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTenPhim.setText("Chung cư ma");

        lblGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblGia.setText("100.000đ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ghế");

        lblTenGhe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTenGhe.setText("G12");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Công ty TNHH T1 Cinema");

        lblTenPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTenPhong.setText("BCC");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel10.setText("Đã bao gồm VAT");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("http://localhost:3000/");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblTenPhim1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTenPhim1.setText("Topping");

        lbTopping.setEditable(false);
        lbTopping.setColumns(20);
        lbTopping.setRows(5);
        jScrollPane4.setViewportView(lbTopping);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTenPhong)
                                    .addComponent(lblTime)
                                    .addComponent(lblTenPhim)
                                    .addComponent(lblGia)
                                    .addComponent(jLabel10))
                                .addGap(0, 103, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTenGhe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTenPhim1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTenPhong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTenPhim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTenPhim1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTenGhe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String a = UUID.randomUUID().toString();
        System.out.println(a);
        daoHD.Insert(new HoaDon(a, daoVe.findMaxId(), java.time.LocalDate.now() + "", tt.getGiaGhe() * 1.05 + temp));
        Hashtable map = new Hashtable();
        map.put("maHD", a);
        ConnectDB.inHoaDon(map);

        Main.mainF.removeAll();
        Main.mainF.add(new Form_Home());
        Main.mainF.repaint();
        Main.mainF.revalidate();
        try {
            ThanhToan tt = (ThanhToan) Main.readObj("temp.txt");
            tt.setListTopping(null);
            DangNhap.writeObj("temp.txt", tt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

//    private void CreateAndOpenPDFFile() {
//        try {
//            Document document = new Document();
//            PdfWriter.getInstance(document, new FileOutputStream("hoadon.pdf"));
//            document.open();
//            document.add(new Paragraph("Hello World"));
//
//            File file = new File("C:\\Users\\Ngoc Han\\Desktop\\RapChieuPhim_App\\hoadon.pdf");
//            if(file.exists()){
//                if(Desktop.isDesktopSupported()){
//                    Desktop.getDesktop().open(file);
//                }
//            }else{
//                JOptionPane.showMessageDialog(null, "File khong ton tai");
//            }
//            
//            document.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea lbTopping;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblTenGhe;
    private javax.swing.JLabel lblTenPhim;
    private javax.swing.JLabel lblTenPhim1;
    private javax.swing.JLabel lblTenPhong;
    private javax.swing.JLabel lblTime;
    // End of variables declaration//GEN-END:variables
}
