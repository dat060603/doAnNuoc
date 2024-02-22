package Controller.PersonalInFoController;

import Model.Personalinfo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DSPersonalInfoController {
    private List<Personalinfo> dsPerson;

    public DSPersonalInfoController() {
        try {
            this.dsPerson = new PersonalInfoDAO().getAll();
        } catch (Exception ex) {
            Logger.getLogger(DSPersonalInfoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Personalinfo> getDsPerson() {
        return dsPerson;
    }

    public void setDsPerson(List<Personalinfo> dsPerson) {
        this.dsPerson = dsPerson;
    }   
}
