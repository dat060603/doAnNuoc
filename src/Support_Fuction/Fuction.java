
package Support_Fuction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Fuction {
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
