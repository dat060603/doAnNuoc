package View;

import Controller.ChuHoController.DSChuHoController;
import LayMotSoUIdepTaiDay.BangDanhSach;
import Model.ChuHo;
import View.form.CapNhatChuHo;
import View.form.ThemChuHoDialog;
import View.form.XoaChuHoDialog;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
public class DSChuHoView extends javax.swing.JPanel {
    private String CCCD_ChuHo;
    private String HoTen;
    private Date NgaySinh;
    private String DiaChi;
    private String Sdt;
    
    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getCCCD_ChuHo() {
        return CCCD_ChuHo;
    }

    public void setCCCD_ChuHo(String CCCD_ChuHo) {
        this.CCCD_ChuHo = CCCD_ChuHo;
    }
    
    private MainNhanVienView mainNhanVienView = new MainNhanVienView();
    public DSChuHoView(MainNhanVienView mnv) {
        initComponents();
        this.mainNhanVienView = mnv;
        this.setSize(mainNhanVienView.getMainPanel().getSize());
        this.setVisible(true);
        ShowThongTin();
        
        //Tạo Action khi nhấp chọn hàng trong Jtable BangDSChuHo
        ListSelectionListener rowListener;
        rowListener = new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    int selectedRow = BangDSChuHo.getSelectedRow();
                    if (selectedRow != -1) { 
                        // Lấy dữ liệu từ hàng đó và xử lý dữ liệu   
                        setCCCD_ChuHo((String) BangDSChuHo.getValueAt(selectedRow, 0));
                        setHoTen((String) BangDSChuHo.getValueAt(selectedRow, 1));
                        setNgaySinh((Date) BangDSChuHo.getValueAt(selectedRow, 2));
                        setDiaChi((String) BangDSChuHo.getValueAt(selectedRow, 3));
                        setSdt((String) BangDSChuHo.getValueAt(selectedRow, 4));
              
                        TimKiemTF.setText(getHoTen());
                    }
                }
            };
        };
        BangDSChuHo.getSelectionModel().addListSelectionListener(rowListener);
    }

    public void ShowThongTin(){
        List<ChuHo> dsChuHO = new DSChuHoController().getDsChuHo();
        DefaultTableModel model = (DefaultTableModel) BangDSChuHo.getModel();
        int i = 0;
        for(ChuHo chuHo : dsChuHO){
            Object[] rowData = {chuHo.getCCCD(),chuHo.getUsername(), chuHo.getDOB(), chuHo.getAddress(), chuHo.getPhone()};
            model.insertRow(i++,rowData);   
        }
        model.fireTableDataChanged();
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
        CapNhatBT = new LayMotSoUIdepTaiDay.ButtonThuong();
        LamMoiBT = new LayMotSoUIdepTaiDay.ButtonThuong();

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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CCCD", "Họ và tên", "Ngày sinh", "Địa chỉ", "SĐT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        CapNhatBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/6.png"))); // NOI18N
        CapNhatBT.setText("Cập nhật");
        CapNhatBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapNhatBTActionPerformed(evt);
            }
        });

        LamMoiBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Refresh.png"))); // NOI18N
        LamMoiBT.setText("Làm mới");
        LamMoiBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamMoiBTActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TimKiemBT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ThemBT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(XoaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LamMoiBT, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(CapNhatBT, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TimKiemTF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThemBT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XoaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimKiemBT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CapNhatBT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LamMoiBT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TimKiemBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemBTActionPerformed
        String key = TimKiemTF.getText();
        if(key.isEmpty()){
            JOptionPane.showMessageDialog(this, "Vui lòng không được bỏ trống!");            
        }else{
            new Controller.ChuHoController.DSChuHoController().TimKiemChuHo(key, BangDSChuHo); 
        }

    }//GEN-LAST:event_TimKiemBTActionPerformed

    private void XoaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaBTActionPerformed
        showXoaChuHoDialog();
    }//GEN-LAST:event_XoaBTActionPerformed

    private void CapNhatBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapNhatBTActionPerformed
        if(!(BangDSChuHo.getSelectionModel().isSelectionEmpty())){
            showCapNhatChuHoDialog();
        }else{
            JOptionPane.showMessageDialog(this, "Vui lòng chọn chủ hộ cần cập nhật trên bảng!!!");
        }
    }//GEN-LAST:event_CapNhatBTActionPerformed

    private void ThemBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemBTActionPerformed
        showThemChuHoDialog();
    }//GEN-LAST:event_ThemBTActionPerformed

    private void LamMoiBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamMoiBTActionPerformed
        mainNhanVienView.setForm(new DSChuHoView(mainNhanVienView));
    }//GEN-LAST:event_LamMoiBTActionPerformed
    
    private void showThemChuHoDialog() {
        ThemChuHoDialog themChuHoDialog = new ThemChuHoDialog(mainNhanVienView, true);
        themChuHoDialog.setVisible(true);
    }

    private void showXoaChuHoDialog() {
        XoaChuHoDialog xoaChuHoDialog = new XoaChuHoDialog(mainNhanVienView, this, true);
        xoaChuHoDialog.setVisible(true);
    }    
    
    private void showCapNhatChuHoDialog() {
        CapNhatChuHo capNhatChuHo = new CapNhatChuHo(mainNhanVienView, this, true);
        capNhatChuHo.setVisible(true);
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LayMotSoUIdepTaiDay.BangDanhSach BangDSChuHo;
    private LayMotSoUIdepTaiDay.ButtonThuong CapNhatBT;
    private LayMotSoUIdepTaiDay.ButtonThuong LamMoiBT;
    private javax.swing.JScrollPane ScrollPane;
    private LayMotSoUIdepTaiDay.ButtonThuong ThemBT;
    private LayMotSoUIdepTaiDay.ButtonThuong TimKiemBT;
    private javax.swing.JTextField TimKiemTF;
    private LayMotSoUIdepTaiDay.ButtonThuong XoaBT;
    // End of variables declaration//GEN-END:variables
}
