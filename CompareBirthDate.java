package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareBirthDate {
    public static boolean compare(String birthDateString, String deathDateString) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

        Date birthDate = format.parse(birthDateString);
        Date deathDate = format.parse(deathDateString);

        if (birthDate.compareTo(deathDate) == 1) {
            System.out.println("Error: Birth date is after the death date.");
            return false;
        } else {
            return true;
        }

    }
}