
package Controller.ChuHoController;

import Model.ChuHo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DSChuHoController {
    private List<ChuHo> dsChuHo;

    public void refresh(){
        this.dsChuHo.clear();
    }
    
    public DSChuHoController() {
//        refresh();
        try {
            this.dsChuHo = new ChuHoDAO().getAll();
        } catch (Exception ex) {
            Logger.getLogger(DSChuHoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<ChuHo> getDsChuHo() {
        return dsChuHo;
    }

    public void setDsChuHo(List<ChuHo> dsChuHo) {
        this.dsChuHo = dsChuHo;
    }
    
    public void TimKiemChuHo (String keyword, JTable table) {
        //Cast table về dạng DefaultTableModel, sau đó dùng một số hàm built-in có sẵn từ DefaultTableModel
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        boolean found = false;

        //Xử lý tìm kiếm
        try {
            for (int i = 0; i < model.getRowCount(); i++) {
                //Lấy từng phần thử dò theo keyword, getValueAt('lấy phần tử tại dòng i', 'lấy chọn trường dữ liệu cột 0')
                if (model.getValueAt(i, 1) != null) {
                    String ten = model.getValueAt(i, 1).toString(); // Chuyển đổi thành chuỗi
                    if (ten.equalsIgnoreCase(keyword)) {
                        // Tìm thấy từ khóa, chọn dòng đó trong bảng
                        table.setRowSelectionInterval(i, i);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                // Hiển thị thông báo nếu không tìm thấy
                JOptionPane.showMessageDialog(null, "Không tìm thấy người dùng có tên: " + keyword);
            }
        } catch (Exception ex) {
            // Bắt và xử lý ngoại lệ
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra khi tìm kiếm người dùng.");
        }
    }
    
    public void ThemChuHo (String keyword, JTable table){
        
    }
    
    public int SoluongChuho(){
        return dsChuHo.size();
    }
}
