package Test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DivorceBeforeDeath {
    public static boolean compare (String deathDateString, String divorceDateString, String famId, String name) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

        Date divorceDate = format.parse(divorceDateString);
        Date deathDate = format.parse(deathDateString);

        if (divorceDate.compareTo(deathDate) == 1) {
            System.out.println("Error US06: Divorce date of " +name+" occurs after his/her Death date in Family " +famId);
            return true;
        } else {
            return false;
        }

    }
}
