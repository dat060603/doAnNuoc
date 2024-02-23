package View.DanhSachChuHo.DSChuHoForm;

import Component.CheckTruongDuLieu;
import Controller.ChuHoController.DSChuHoController;
import Controller.PersonalInFoController.DSPersonalInfoController;
import Model.ChuHo;
import View.DanhSachChuHo.DSChuHoView;
import View.MainNhanVienView;
import javax.swing.JOptionPane;


public class CapNhatThongTinCH extends javax.swing.JDialog {
    private MainNhanVienView mainNhanVienView;
    private DSChuHoView dSChuHoView;
    public CapNhatThongTinCH(MainNhanVienView Frame, DSChuHoView FrameChuHoView, boolean modal) {
        initComponents();
        this.mainNhanVienView = Frame;
        this.dSChuHoView = FrameChuHoView;
        this.setResizable(false);
        this.setTitle("Cập nhật thông tin chủ hộ");
        this.setModalityType(DEFAULT_MODALITY_TYPE.APPLICATION_MODAL);
        this.setLocationRelativeTo(null);
        
        CccdTF.setText(dSChuHoView.getChuHo().getCCCD());
        HoTenTF.setText(dSChuHoView.getChuHo().getUsername());
        DobDC.setDate(dSChuHoView.getChuHo().getDOB());
        DiaChiTF.setText(dSChuHoView.getChuHo().getAddress());
        SdtTF.setText(dSChuHoView.getChuHo().getPhone());
        
        CccdTF.setEnabled(false);
        CccdTF.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SdtTF = new javax.swing.JTextField();
        OkBT = new javax.swing.JButton();
        HuyBT = new javax.swing.JButton();
        HoTenTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cccdLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DiaChiTF = new javax.swing.JTextField();
        CccdTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DobDC = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        OkBT.setText("OK");
        OkBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkBTActionPerformed(evt);
            }
        });

        HuyBT.setText("Hủy");
        HuyBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyBTActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Họ tên:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Ngày sinh:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        cccdLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cccdLbl.setText("CCCD:");
        cccdLbl.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Địa chỉ:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Số điên thoại:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        DobDC.setDateFormatString("yyyy / MM / dd");
        DobDC.setMinSelectableDate(new java.util.Date(-62135791121000L));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cccdLbl)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OkBT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(HuyBT, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(DiaChiTF, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                        .addComponent(HoTenTF, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                        .addComponent(SdtTF, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                        .addComponent(CccdTF, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                        .addComponent(DobDC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cccdLbl)
                    .addComponent(CccdTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HoTenTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(DobDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DiaChiTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(SdtTF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OkBT)
                    .addComponent(HuyBT))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OkBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkBTActionPerformed
        // Kiểm tra Text field có bị trống không
        if(CccdTF.getText().equals("") || SdtTF.getText().equals("") || HoTenTF.getText().equals("")
            || DiaChiTF.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!");
        }
        else if(!(CheckTruongDuLieu.KtraCCCD(CccdTF.getText()) && CheckTruongDuLieu.KtraSDT(SdtTF.getText()) && CheckTruongDuLieu.KtraDate(DobDC))){
            JOptionPane.showMessageDialog(this, "Vui lòng xem lại và nhập thông tin hợp lệ!");
        }else {  
            int confirm = JOptionPane.showConfirmDialog(
                this,
                "Bạn có chắc muốn cập nhật chủ hộ có CCCD: " + CccdTF.getText() + " không?",
            "Xác nhận cập nhật",
            JOptionPane.YES_NO_OPTION
            );

            if (confirm == JOptionPane.YES_OPTION) {
                ChuHo chuHo;
                chuHo = new ChuHo(CccdTF.getText(), HoTenTF.getText(), DiaChiTF.getText(), SdtTF.getText(), new java.sql.Date(DobDC.getDate().getTime()));

                JOptionPane.showMessageDialog(this, "Đã cập nhật thông tin của chủ hộ có CCCD: " + CccdTF.getText());
                
                new DSChuHoController().CapNhatThongTinChuHo(chuHo);
                
                mainNhanVienView.setForm(new DSChuHoView(mainNhanVienView));
                
                this.dispose();          
            }
            this.dispose();   
        }
    }//GEN-LAST:event_OkBTActionPerformed

    private void HuyBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyBTActionPerformed
        this.dispose();
    }//GEN-LAST:event_HuyBTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CccdTF;
    private javax.swing.JTextField DiaChiTF;
    private com.toedter.calendar.JDateChooser DobDC;
    private javax.swing.JTextField HoTenTF;
    private javax.swing.JButton HuyBT;
    private javax.swing.JButton OkBT;
    private javax.swing.JTextField SdtTF;
    private javax.swing.JLabel cccdLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
