
package Controller.ChuHoController;

import Model.Staff;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StaffController {
    private List<Staff> dsStaffs;
    
    public void refresh(){
        this.dsStaffs.clear();
    }

    public StaffController() {
//        refresh();
          try {
            this.dsStaffs = new StaffsDAO().getAll();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int soluongStaff(){
        return this.dsStaffs.size();
    }  
}
