package Controller.ThongTinSDController;

import Model.ThongTinSuDung;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DSThongTinSDController {
     private List<ThongTinSuDung> lstThongTinSuDungs;

    public DSThongTinSDController() {
         try {
             this.lstThongTinSuDungs = new ThongTinSDDAO().getAll();
         } catch (Exception ex) {
             Logger.getLogger(DSThongTinSDController.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    public List<ThongTinSuDung> getLstThongTinSuDungs() {
        return lstThongTinSuDungs;
    }

    public void setLstThongTinSuDungs(List<ThongTinSuDung> lstThongTinSuDungs) {
        this.lstThongTinSuDungs = lstThongTinSuDungs;
    }
}
