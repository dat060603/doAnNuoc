package Component;

import com.toedter.calendar.JDateChooser;

public class CheckTruongDuLieu {
    // Kiểm tra CCCD
    public static boolean KtraCCCD(String CCCD) {
        // Kiểm tra độ dài
        if (CCCD.length() != 12) {
            return false;
        }
        
        // Kiểm tra các ký tự có phải là chữ số
        for (int i = 0; i < CCCD.length(); i++) {
            if (!Character.isDigit(CCCD.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }

    // Kiểm tra SĐT
    public static boolean KtraSDT(String SDT) {
        // Kiểm tra độ dài
        if (SDT.length() != 10) {
            return false;
        }
        
        // Kiểm tra các ký tự có phải là chữ số
        for (int i = 0; i < SDT.length(); i++) {
            if (!Character.isDigit(SDT.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }    
     
    // Kiểm tra Date
    public static boolean KtraDate(JDateChooser dateChooser) {
        // Kiểm tra nếu dateChooser trả về null (đồng nghĩa với lỗi)
        if (dateChooser.getDate() == null) {
            return false;
        }
        return true;
    }
}
