
package Controller.StaffsController;

import Model.Staff;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DSStaffsController {
    private List<Staff> dsStaffs;
    
    public void refresh(){
        this.dsStaffs.clear();
    }

    public DSStaffsController() {
//        refresh();
        try {
            this.dsStaffs = new StaffsDAO().getAll();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
      
    public List<Staff> getDsStaffs() {
        return dsStaffs;
    }

    public void setDsStaffs(List<Staff> dsStaffs) {
        this.dsStaffs = dsStaffs;
    }
    
    public int soluongStaff(){
        return this.dsStaffs.size();
    }  
}
