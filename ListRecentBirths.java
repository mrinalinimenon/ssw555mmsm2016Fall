package Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ListRecentBirths 
{
	public static void compare(String birthDateString, String indId, String Gname, String Sname) {

        try 
        {
            SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

            Date birthDate = format.parse(birthDateString);
            Date currentDate = new Date();

            long diff = currentDate.getTime() - birthDate.getTime();
            long diffHours = diff / (60 * 60 * 1000);
            long diffDays = diffHours / 24; // 48
            
            if (birthDate.compareTo(currentDate) < 0 && diffDays < 30) 
            {
    			System.out.println("Individual Id: " + indId + " | Name: " + Gname+ " " +Sname + " | Birth Date: "+birthDateString);

            }
        } catch (Exception ex) {

        }
    }
}
