package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MarriageBeforeDivorce {
    public static boolean compare (String marriageDateString, String divorceDateString, String fid, String Hname, String hid, String Wname, String wid) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

        Date marriageDate = format.parse(marriageDateString);
        Date divorceDate = format.parse(divorceDateString);

        if (marriageDate.compareTo(divorceDate) == 1) {
            System.out.println("Error US04: Marriage date of "+ Hname+" (" +hid +")" +" and "+ Wname+" (" +wid +")" +" occurs after their divorce date in Family "+fid);
            return true;
        } else {
            return false;
        }

    }
}
