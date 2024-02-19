
package Support_Fuction;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Fuction {
    public static Date convertStringToDate(String dateString) throws ParseException {
        // Định dạng của ngày tháng trong chuỗi
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        // Chuyển đổi chuỗi thành kiểu Date
        java.util.Date parsedDate = dateFormat.parse(dateString);
        
        // Tạo đối tượng Date từ parsedDate
        Date sqlDate = new Date(parsedDate.getTime());
        
        return sqlDate;
    }
    public class DateValidator {
          
        public boolean isValidDateFormat(String dateString) {
        // Define the date format
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            // Parse the input date string
            LocalDate.parse(dateString, dateFormatter);
            return true; // If parsing succeeds, the date format is valid
        } catch (DateTimeParseException e) {
            return false; // If parsing fails, the date format is invalid
        }
       }
    }
}
