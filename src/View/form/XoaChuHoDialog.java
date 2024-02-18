package View.form;

import javax.swing.JOptionPane;

public class XoaChuHoDialog extends javax.swing.JDialog {

    public XoaChuHoDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setSize(400, 175);
        this.setResizable(false);
        this.setTitle("Xóa chủ hộ");
        this.setModalityType(DEFAULT_MODALITY_TYPE.APPLICATION_MODAL);
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cccdTf = new javax.swing.JTextField();
        cccdLbl = new javax.swing.JLabel();
        manvLbl = new javax.swing.JLabel();
        manvTf = new javax.swing.JTextField();
        okBtn = new javax.swing.JButton();
        hủyBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(376, 166));

        cccdLbl.setText("CCCD:");

        manvLbl.setText("Mã nhân viên:");

        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        hủyBtn.setText("Hủy");
        hủyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hủyBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(okBtn)
                        .addGap(39, 39, 39)
                        .addComponent(hủyBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cccdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cccdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(manvLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(manvTf, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cccdLbl)
                    .addComponent(cccdTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manvLbl)
                    .addComponent(manvTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBtn)
                    .addComponent(hủyBtn))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        //Kiểm tra Text field có bị trống không
        if(cccdTf.getText().equals("") || manvTf.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Thiếu thông tin!");
        }else{
            //Không thì lưu data và về lại DS chủ hộ view
            this.dispose();
        }
    }//GEN-LAST:event_okBtnActionPerformed

    private void hủyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hủyBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_hủyBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cccdLbl;
    private javax.swing.JTextField cccdTf;
    private javax.swing.JButton hủyBtn;
    private javax.swing.JLabel manvLbl;
    private javax.swing.JTextField manvTf;
    private javax.swing.JButton okBtn;
    // End of variables declaration//GEN-END:variables
}
