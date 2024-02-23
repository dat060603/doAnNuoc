package View.ThongTinSuDungDien;

import Controller.ChuHoController.DSChuHoController;
import Controller.ThongTinSDController.DSThongTinSDController;
import Model.ChuHo;
import Model.ThongTinSuDung;
import View.MainNhanVienView;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ThongTinSDDienView extends javax.swing.JPanel {
    private MainNhanVienView mainNhanVienView;
    public ThongTinSDDienView(MainNhanVienView mnv) {
        initComponents();
        this.mainNhanVienView = mnv;
        this.setSize(new MainNhanVienView().getMainPanel().getSize());
        this.setSize(mainNhanVienView.getMainPanel().getSize());
        this.setVisible(true);
        ShowThongTinTuDBS();
    }

    public void ShowThongTinTuDBS(){
        List<ThongTinSuDung> lstThongTinSuDungs = new DSThongTinSDController().getLstThongTinSuDungs();
        DefaultTableModel model = (DefaultTableModel) BangDSThongTinSD.getModel();
        int i = 0;
        for(ThongTinSuDung ttsd : lstThongTinSuDungs){
            Object[] rowData = {ttsd.getCCCD(),ttsd.getUsername(), ttsd.getPhone(), ttsd.getID_E_Meter(), 
                                ttsd.getDiaChi(), ttsd.getType_living(), ttsd.getCCCD_NhanVien(), ttsd.getUsername_NhanVien(), ttsd.getPhone_NhanVien()};
            model.insertRow(i++,rowData);   
        }
        model.fireTableDataChanged();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPane = new javax.swing.JScrollPane();
        BangDSThongTinSD = new LayMotSoUIdepTaiDay.BangDanhSach();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(757, 557));

        BangDSThongTinSD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CCCD ", "Tên", "SĐT", "Mã số công tơ điện", "Vị trí", "Hình thức ở", "CCCD nhân viên", "Tên nhân viên", "SĐT nhân viên"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BangDSThongTinSD.setPreferredSize(new java.awt.Dimension(525, 160));
        BangDSThongTinSD.getTableHeader().setReorderingAllowed(false);
        ScrollPane.setViewportView(BangDSThongTinSD);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 119, Short.MAX_VALUE)
                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LayMotSoUIdepTaiDay.BangDanhSach BangDSThongTinSD;
    private javax.swing.JScrollPane ScrollPane;
    // End of variables declaration//GEN-END:variables
}
