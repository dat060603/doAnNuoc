package View;
import javax.swing.table.DefaultTableModel;
public class DSNguoiDung extends javax.swing.JPanel {

    public DSNguoiDung() {
        initComponents();
        this.setSize(new MainForm().getMainPanel().getSize());
        
        bangDanhSach1.themCot(bangDanhSach1.getTable(), String.class, "Hai");
        bangDanhSach1.suaCot(bangDanhSach1.getTable(), 0, String.class, "Một");
        
        DefaultTableModel model = (DefaultTableModel) bangDanhSach1.getTable().getModel();
        Object[] rowData = {"Messi", "Ronaldo"};
        model.insertRow(0, rowData);
        model.fireTableDataChanged();

        
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bangDanhSach1 = new LayMotSoUIdepTaiDay.BangDanhSach();
        jTextField1 = new javax.swing.JTextField();
        buttonThuong1 = new LayMotSoUIdepTaiDay.ButtonThuong();

        setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setBackground(new java.awt.Color(231, 231, 231));
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        buttonThuong1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N
        buttonThuong1.setText("Tìm kiếm");
        buttonThuong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThuong1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bangDanhSach1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonThuong1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(buttonThuong1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(bangDanhSach1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonThuong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThuong1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonThuong1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LayMotSoUIdepTaiDay.BangDanhSach bangDanhSach1;
    private LayMotSoUIdepTaiDay.ButtonThuong buttonThuong1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
