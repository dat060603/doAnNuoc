package MainRunCode;

import Controller.ChuHoController.DSChuHoController;
import Model.ChuHo;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    public static Date convertStringToDate(String dateString) throws ParseException {
        // Định dạng của ngày tháng trong chuỗi
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        // Chuyển đổi chuỗi thành kiểu Date
        java.util.Date parsedDate = dateFormat.parse(dateString);
        
        // Tạo đối tượng Date từ parsedDate
        Date sqlDate = new Date(parsedDate.getTime());
        
        return sqlDate;
    }
    public static void main(String[] args) throws ParseException {
        ChuHo chuHo = new ChuHo("123456789015", "User3", "xzc 123", "1234567893", convertStringToDate("2000-01-01"));
        System.out.println(chuHo.toString());
        new DSChuHoController().ThemChuHo(chuHo, "User3", "123", "123456789012");
    }
}
