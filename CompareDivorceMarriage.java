package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDivorceMarriage {
    public static boolean compare (String marriageDateString, String divorceDateString) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

        Date marriageDate = format.parse(marriageDateString);
        Date divorceDate = format.parse(divorceDateString);

        if (marriageDate.compareTo(divorceDate) == 1) {
            System.out.println("Error: Marriage date is after the divorce date.");
           return true;
        } else {
            return false;
        }

    }
}
