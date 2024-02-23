package Model;

public class ThongTinSuDung {
    private String CCCD;
    private String Username;  
    private String Phone;
    private String ID_E_Meter;
    private String Type_living;
    private String DiaChi;  
    private String CCCD_NhanVien;
    private String Username_NhanVien;
    private String Phone_NhanVien;

    public ThongTinSuDung(String CCCD, String Username, String Phone, String ID_E_Meter, String Type_living, String DiaChi, String CCCD_NhanVien, String Username_NhanVien, String Phone_NhanVien) {
        this.CCCD = CCCD;
        this.Username = Username;
        this.Phone = Phone;
        this.ID_E_Meter = ID_E_Meter;
        this.Type_living = Type_living;
        this.DiaChi = DiaChi;
        this.CCCD_NhanVien = CCCD_NhanVien;
        this.Username_NhanVien = Username_NhanVien;
        this.Phone_NhanVien = Phone_NhanVien;
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

    public String getCCCD_NhanVien() {
        return CCCD_NhanVien;
    }

    public void setCCCD_NhanVien(String CCCD_NhanVien) {
        this.CCCD_NhanVien = CCCD_NhanVien;
    }

    public String getUsername_NhanVien() {
        return Username_NhanVien;
    }

    public void setUsername_NhanVien(String Username_NhanVien) {
        this.Username_NhanVien = Username_NhanVien;
    }

    public String getPhone_NhanVien() {
        return Phone_NhanVien;
    }

    public void setPhone_NhanVien(String Phone_NhanVien) {
        this.Phone_NhanVien = Phone_NhanVien;
    }

    

    public ThongTinSuDung() {};
    
}
