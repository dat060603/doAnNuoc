package View;

//import View.NhanVienView.ThongTinSDDienView;
import Controller.ChuHoController.DSChuHoController;
import Controller.ChuHoController.InvoiceController;
import Controller.ChuHoController.StaffController;
import LayMotSoUIdepTaiDay.ButtonMenu;
import View.DSChuHoView;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JPanel;


public final class MainNhanVienView extends javax.swing.JFrame {
    
    public MainNhanVienView(){
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        simpleTitleBar1.init(this);
        TrangThaiChuHo.setLabel("Số chủ hộ: "+new DSChuHoController().SoluongChuho());
        TrangThaiNhanVien.setLabel("Số nhân viên: "+new StaffController().soluongStaff());
        TrangThaiTien.setLabel("Tổng doanh thu: " +new InvoiceController().getTotalprice());
        ImageIcon imageNguoi = new ImageIcon("src/Icon/profile.png");
        ImageIcon imageTien = new ImageIcon("src/Icon/profit.png");
        TrangThaiChuHo.setIcon(imageNguoi);
        TrangThaiNhanVien.setIcon(imageNguoi);
        TrangThaiTien.setIcon(imageTien);
        
    }

    public JPanel getMainPanel() {
        return MainPanel;
    }

    public void setMainPanel(JPanel MainPanel) {
        this.MainPanel = MainPanel;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainBorder = new LayMotSoUIdepTaiDay.PanelBorder();
        Menu = new LayMotSoUIdepTaiDay.Menu();
        DSChuHo = new LayMotSoUIdepTaiDay.ButtonMenu();
        ThongTinSDDien = new LayMotSoUIdepTaiDay.ButtonMenu();
        button3 = new LayMotSoUIdepTaiDay.ButtonMenu();
        LogoApp = new javax.swing.JLabel();
        HoaDonBT = new LayMotSoUIdepTaiDay.ButtonMenu();
        MainPanel = new javax.swing.JPanel();
        TrangThaiChuHo = new LayMotSoUIdepTaiDay.PanelTrangThai();
        TrangThaiNhanVien = new LayMotSoUIdepTaiDay.PanelTrangThai();
        TrangThaiTien = new LayMotSoUIdepTaiDay.PanelTrangThai();
        simpleTitleBar1 = new LayMotSoUIdepTaiDay.SimpleTitleBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NHÂN VIÊN ");
        setUndecorated(true);

        MainBorder.setBackground(new java.awt.Color(232, 232, 232));

        DSChuHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/8.png"))); // NOI18N
        DSChuHo.setText("Danh sách chủ hộ");
        DSChuHo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DSChuHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSChuHoActionPerformed(evt);
            }
        });

        ThongTinSDDien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/6.png"))); // NOI18N
        ThongTinSDDien.setText("Thông tin sử dụng điện");
        ThongTinSDDien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ThongTinSDDien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThongTinSDDienActionPerformed(evt);
            }
        });

        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/9.png"))); // NOI18N
        button3.setText("button3");
        button3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        LogoApp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LogoApp.setForeground(new java.awt.Color(255, 255, 255));
        LogoApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logo.png"))); // NOI18N
        LogoApp.setText("Application");

        HoaDonBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/2.png"))); // NOI18N
        HoaDonBT.setText("Hóa đơn điện");
        HoaDonBT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HoaDonBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoaDonBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ThongTinSDDien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(LogoApp)
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addComponent(DSChuHo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HoaDonBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoApp)
                .addGap(62, 62, 62)
                .addComponent(DSChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ThongTinSDDien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HoaDonBT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 841, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TrangThaiNhanVien.setColor1(new java.awt.Color(51, 153, 255));
        TrangThaiNhanVien.setColor2(new java.awt.Color(0, 153, 255));

        TrangThaiTien.setColor1(new java.awt.Color(255, 204, 51));
        TrangThaiTien.setColor2(new java.awt.Color(255, 204, 0));

        simpleTitleBar1.setBackground(new java.awt.Color(0, 153, 204));
        simpleTitleBar1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout MainBorderLayout = new javax.swing.GroupLayout(MainBorder);
        MainBorder.setLayout(MainBorderLayout);
        MainBorderLayout.setHorizontalGroup(
            MainBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainBorderLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(MainBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainBorderLayout.createSequentialGroup()
                        .addComponent(TrangThaiChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TrangThaiNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TrangThaiTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(simpleTitleBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainBorderLayout.setVerticalGroup(
            MainBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainBorderLayout.createSequentialGroup()
                .addComponent(simpleTitleBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainBorderLayout.createSequentialGroup()
                        .addGroup(MainBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TrangThaiChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TrangThaiNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TrangThaiTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainBorder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void DSChuHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSChuHoActionPerformed
            DSChuHo.Nhan();
            ThongTinSDDien.Reset();
            button3.Reset();
            HoaDonBT.Reset();
            this.setForm(new DSChuHoView());
    }//GEN-LAST:event_DSChuHoActionPerformed

    private void ThongTinSDDienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThongTinSDDienActionPerformed
            DSChuHo.Reset();
            ThongTinSDDien.Nhan();
            button3.Reset();
            HoaDonBT.Reset();
            this.setForm(new ThongTinSDDienView());
    }//GEN-LAST:event_ThongTinSDDienActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
            DSChuHo.Reset();
            ThongTinSDDien.Reset();
            button3.Nhan();
            HoaDonBT.Reset();
    }//GEN-LAST:event_button3ActionPerformed

    private void HoaDonBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoaDonBTActionPerformed
            DSChuHo.Reset();
            ThongTinSDDien.Reset();
            button3.Reset();
            HoaDonBT.Nhan();
            this.setForm(new DSHoaDonView());
    }//GEN-LAST:event_HoaDonBTActionPerformed
    
    
    public void setForm(JComponent com){
        MainPanel.removeAll();
        MainPanel.setLayout(new BorderLayout());
        MainPanel.add(com, BorderLayout.CENTER);
        MainPanel.repaint();
        MainPanel.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LayMotSoUIdepTaiDay.ButtonMenu DSChuHo;
    private LayMotSoUIdepTaiDay.ButtonMenu HoaDonBT;
    private javax.swing.JLabel LogoApp;
    private LayMotSoUIdepTaiDay.PanelBorder MainBorder;
    private javax.swing.JPanel MainPanel;
    private LayMotSoUIdepTaiDay.Menu Menu;
    private LayMotSoUIdepTaiDay.ButtonMenu ThongTinSDDien;
    private LayMotSoUIdepTaiDay.PanelTrangThai TrangThaiChuHo;
    private LayMotSoUIdepTaiDay.PanelTrangThai TrangThaiNhanVien;
    private LayMotSoUIdepTaiDay.PanelTrangThai TrangThaiTien;
    private LayMotSoUIdepTaiDay.ButtonMenu button3;
    private LayMotSoUIdepTaiDay.SimpleTitleBar simpleTitleBar1;
    // End of variables declaration//GEN-END:variables

    public ButtonMenu getThongTinSDDien() {
        return ThongTinSDDien;
    }

}
