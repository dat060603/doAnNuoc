package View;

import View.form.ThemChuHoForm;
import View.form.XoaChuHoForm;
import javax.swing.table.DefaultTableModel;
public class DSChuHoView extends javax.swing.JPanel {

    public DSChuHoView() {
        initComponents();
        this.setSize(new MainNhanVienView().getMainPanel().getSize());
        
        DefaultTableModel model = (DefaultTableModel) BangDSChuHo.getModel();
        Object[] rowData1 = {"Messi", "1/1/2000", "1/1 đường Nguyễn Văn A", "1234567890"};
        Object[] rowData2 = {"Ronaldo", "1/1/2002", "1/1 Trần Văn B", "1234567800"};
        model.insertRow(0, rowData1);
        model.insertRow(1, rowData2);
        
        model.fireTableDataChanged();
        
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TimKiemTF = new javax.swing.JTextField();
        TimKiemBT = new LayMotSoUIdepTaiDay.ButtonThuong();
        ScrollPane = new javax.swing.JScrollPane();
        BangDSChuHo = new LayMotSoUIdepTaiDay.BangDanhSach();
        ThemBT = new LayMotSoUIdepTaiDay.ButtonThuong();
        XoaBT = new LayMotSoUIdepTaiDay.ButtonThuong();
        SuaBT = new LayMotSoUIdepTaiDay.ButtonThuong();

        setBackground(new java.awt.Color(255, 255, 255));

        TimKiemTF.setBackground(new java.awt.Color(231, 231, 231));
        TimKiemTF.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        TimKiemBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N
        TimKiemBT.setText("Tìm kiếm");
        TimKiemBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemBTActionPerformed(evt);
            }
        });

        BangDSChuHo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Họ và tên", "Ngày sinh", "Địa chỉ", "SĐT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPane.setViewportView(BangDSChuHo);

        ThemBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Isert_icon.png"))); // NOI18N
        ThemBT.setText("Thêm\n");
        ThemBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemBTActionPerformed(evt);
            }
        });

        XoaBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete_icon.png"))); // NOI18N
        XoaBT.setText("Xóa");
        XoaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaBTActionPerformed(evt);
            }
        });

        SuaBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/6.png"))); // NOI18N
        SuaBT.setText("Sửa");
        SuaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TimKiemTF, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimKiemBT, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(ThemBT, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(XoaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SuaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimKiemTF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThemBT, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(XoaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(SuaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(TimKiemBT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TimKiemBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemBTActionPerformed
        String key = TimKiemTF.getText();
        new Controller.DSChuHoController().TimKiemChuHo(key, BangDSChuHo);
    }//GEN-LAST:event_TimKiemBTActionPerformed

    private void XoaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaBTActionPerformed
        new XoaChuHoForm().setVisible(true);
    }//GEN-LAST:event_XoaBTActionPerformed

    private void SuaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaBTActionPerformed
        
    }//GEN-LAST:event_SuaBTActionPerformed

    private void ThemBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemBTActionPerformed
        new ThemChuHoForm().setVisible(true);
    }//GEN-LAST:event_ThemBTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LayMotSoUIdepTaiDay.BangDanhSach BangDSChuHo;
    private javax.swing.JScrollPane ScrollPane;
    private LayMotSoUIdepTaiDay.ButtonThuong SuaBT;
    private LayMotSoUIdepTaiDay.ButtonThuong ThemBT;
    private LayMotSoUIdepTaiDay.ButtonThuong TimKiemBT;
    private javax.swing.JTextField TimKiemTF;
    private LayMotSoUIdepTaiDay.ButtonThuong XoaBT;
    // End of variables declaration//GEN-END:variables
}
