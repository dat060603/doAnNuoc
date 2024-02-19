package Model;

import java.sql.Date;

public class Personalinfo {
    private String CCCD;
    private String Username;    
    private String Address;
    private String Phone;
    private Date DOB;

    public Personalinfo() {}

    public Personalinfo(String CCCD, String Username, String Address, String Phone, Date DOB) {
        this.CCCD = CCCD;
        this.Username = Username;
        this.Address = Address;
        this.Phone = Phone;
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Personalinfo{" + "CCCD=" + CCCD + ", Username=" + Username + ", Address=" + Address + ", Phone=" + Phone + ", DOB=" + DOB + '}';
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }
}
