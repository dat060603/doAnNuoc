package View;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JPanel;


public final class MainForm extends javax.swing.JFrame {
    
    public MainForm(){
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
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
        menu1 = new LayMotSoUIdepTaiDay.Menu();
        button1 = new LayMotSoUIdepTaiDay.ButtonMenu();
        button2 = new LayMotSoUIdepTaiDay.ButtonMenu();
        button3 = new LayMotSoUIdepTaiDay.ButtonMenu();
        LogoApp = new javax.swing.JLabel();
        button4 = new LayMotSoUIdepTaiDay.ButtonMenu();
        MainPanel = new javax.swing.JPanel();
        panelTrangThai1 = new LayMotSoUIdepTaiDay.PanelTrangThai();
        panelTrangThai2 = new LayMotSoUIdepTaiDay.PanelTrangThai();
        panelTrangThai3 = new LayMotSoUIdepTaiDay.PanelTrangThai();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MainBorder.setBackground(new java.awt.Color(232, 232, 232));

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/8.png"))); // NOI18N
        button1.setText("Danh sách người dùng");
        button1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/6.png"))); // NOI18N
        button2.setText("Thông tin sử dụng điện");
        button2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
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

        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/2.png"))); // NOI18N
        button4.setText("button4");
        button4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addComponent(LogoApp)
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LogoApp)
                .addGap(62, 62, 62)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 841, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        panelTrangThai2.setColor1(new java.awt.Color(51, 153, 255));
        panelTrangThai2.setColor2(new java.awt.Color(0, 153, 255));
        panelTrangThai2.setIcon(null);

        panelTrangThai3.setColor1(new java.awt.Color(255, 204, 51));
        panelTrangThai3.setColor2(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout MainBorderLayout = new javax.swing.GroupLayout(MainBorder);
        MainBorder.setLayout(MainBorderLayout);
        MainBorderLayout.setHorizontalGroup(
            MainBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainBorderLayout.createSequentialGroup()
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(MainBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainBorderLayout.createSequentialGroup()
                        .addComponent(panelTrangThai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelTrangThai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelTrangThai3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 85, Short.MAX_VALUE))
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MainBorderLayout.setVerticalGroup(
            MainBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MainBorderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(MainBorderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTrangThai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTrangThai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTrangThai3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainBorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
            button1.Nhan();
            button2.Reset();
            button3.Reset();
            button4.Reset();
            this.setForm(new DSNguoiDung());
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
            button1.Reset();
            button2.Nhan();
            button3.Reset();
            button4.Reset();
            this.setForm(new ThongTinSD());
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
            button1.Reset();
            button2.Reset();
            button3.Nhan();
            button4.Reset();
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
            button1.Reset();
            button2.Reset();
            button3.Reset();
            button4.Nhan();
    }//GEN-LAST:event_button4ActionPerformed
    
    
    public void setForm(JComponent com){
        MainPanel.removeAll();
        MainPanel.add(com);
        MainPanel.repaint();
        MainPanel.revalidate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LogoApp;
    private LayMotSoUIdepTaiDay.PanelBorder MainBorder;
    private javax.swing.JPanel MainPanel;
    private LayMotSoUIdepTaiDay.ButtonMenu button1;
    private LayMotSoUIdepTaiDay.ButtonMenu button2;
    private LayMotSoUIdepTaiDay.ButtonMenu button3;
    private LayMotSoUIdepTaiDay.ButtonMenu button4;
    private LayMotSoUIdepTaiDay.Menu menu1;
    private LayMotSoUIdepTaiDay.PanelTrangThai panelTrangThai1;
    private LayMotSoUIdepTaiDay.PanelTrangThai panelTrangThai2;
    private LayMotSoUIdepTaiDay.PanelTrangThai panelTrangThai3;
    // End of variables declaration//GEN-END:variables
}
