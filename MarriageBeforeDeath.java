package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MarriageBeforeDeath{
    public static boolean compare (String marriageDateString, String deathDateString, String fid, String pid, String name) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

        Date marriageDate = format.parse(marriageDateString);
        Date divorceDate = format.parse(deathDateString);

        if (marriageDate.compareTo(divorceDate) == 1) {
            System.out.println("Error US05: Marriage date of "+ name+" (" +pid +")" +" occurs after his/her death date in Family "+fid);

            return true;
        } else {
            return false;
        }

    }
}