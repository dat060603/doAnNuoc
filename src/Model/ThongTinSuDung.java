package Model;

public class ThongTinSuDung {
    private String CCCD;
    private String Username;  
    private String Phone;
    private String ID_E_Meter;
    private String Type_living;
    private String DiaChi;  
    private String CCCD_Admin;
    private String Username_Admin;
    private String Phone_Admin;

    public ThongTinSuDung(String CCCD, String Username, String Phone, String ID_E_Meter, String Type_living, String DiaChi, String CCCD_Admin, String Username_Admin, String Phone_Admin) {
        this.CCCD = CCCD;
        this.Username = Username;
        this.Phone = Phone;
        this.ID_E_Meter = ID_E_Meter;
        this.Type_living = Type_living;
        this.DiaChi = DiaChi;
        this.CCCD_Admin = CCCD_Admin;
        this.Username_Admin = Username_Admin;
        this.Phone_Admin = Phone_Admin;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getID_E_Meter() {
        return ID_E_Meter;
    }

    public void setID_E_Meter(String ID_E_Meter) {
        this.ID_E_Meter = ID_E_Meter;
    }

    public String getType_living() {
        return Type_living;
    }

    public void setType_living(String Type_living) {
        this.Type_living = Type_living;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getCCCD_Admin() {
        return CCCD_Admin;
    }

    public void setCCCD_Admin(String CCCD_Admin) {
        this.CCCD_Admin = CCCD_Admin;
    }

    public String getUsername_Admin() {
        return Username_Admin;
    }

    public void setUsername_Admin(String Username_Admin) {
        this.Username_Admin = Username_Admin;
    }

    public String getPhone_Admin() {
        return Phone_Admin;
    }

    public void setPhone_Admin(String Phone_Admin) {
        this.Phone_Admin = Phone_Admin;
    }

    public ThongTinSuDung() {};
    
}
