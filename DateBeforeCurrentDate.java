package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateBeforeCurrentDate {
    public static boolean compare(String datesString, String id, String event, String name) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

        Date dates = format.parse(datesString);

        Date currentDate = new Date();
        
        if (dates.compareTo(currentDate) == 1) {
            System.out.println("Error US01: " +event+ " date for "+name+" (" +id +") " +"occurs after the current date");

            return false;
        } else {
            return true;
        }
    }
}
