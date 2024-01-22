package LayMotSoUIdepTaiDay;

import Component.TableHeader;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


public class BangDanhSach extends javax.swing.JPanel {

    public JTable getTable() {
        return Table;
    }

    public void setTable(JTable Table) {
        this.Table = Table;
    }

    public BangDanhSach() {
        initComponents();
        Table.setShowHorizontalLines(true);
        Table.setGridColor(new Color(230, 230, 230));
        Table.setRowHeight(40);
        Table.getTableHeader().setReorderingAllowed(false);
        Table.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                if (i1 == 4) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
    }

    public void suaCot(JTable table, int columnIndex, Class<?> columnClass, String columnName) {
        DefaultTableModel currentModel = (DefaultTableModel) table.getModel();

        // Lấy số lượng cột hiện tại
        int columnCount = currentModel.getColumnCount();

        // Tạo một mô hình mới với kiểu dữ liệu mới cho cột cụ thể
        Object[][] data = new Object[currentModel.getRowCount()][columnCount];
        String[] columnNames = new String[columnCount];

        // Sao chép dữ liệu từ mô hình hiện tại
        for (int row = 0; row < currentModel.getRowCount(); row++) {
            for (int col = 0; col < columnCount; col++) {
                data[row][col] = currentModel.getValueAt(row, col);
            }
        }

        // Sao chép tên cột từ mô hình hiện tại
        for (int col = 0; col < columnCount; col++) {
            columnNames[col] = currentModel.getColumnName(col);
        }

        // Thiết lập kiểu dữ liệu mới cho cột cụ thể
        columnNames[columnIndex] = columnName;
        currentModel = new DefaultTableModel(data, columnNames) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                // Thiết lập kiểu dữ liệu mới cho cột cụ thể
                if (columnIndex == columnIndex) {
                    return columnClass;
                }
                return super.getColumnClass(columnIndex);
            }
        };

        // Gán mô hình mới cho JTable
        table.setModel(currentModel);
        table.getTableHeader().repaint(); // Cập nhật hiển thị header
    }

    public void themCot(JTable table, Class<?> columnClass, String columnName) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addColumn(columnName);
        int columnIndex = model.getColumnCount() - 1;
        table.getColumnModel().getColumn(columnIndex).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                // Kiểm tra kiểu dữ liệu của ô và áp dụng kiểu dữ liệu mới
                if (o != null && !columnClass.isInstance(o)) {
                    o = null;
                }
                return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setForeground(new java.awt.Color(255, 255, 255));

        Table.setBackground(new java.awt.Color(255, 255, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
