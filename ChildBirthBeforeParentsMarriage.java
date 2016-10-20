package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChildBirthBeforeParentsMarriage {
	 public static boolean compareMarriage (String childBirthStr, String marriageDateString, String id, String name, String fid) throws ParseException {
	        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

	        Date childBirthDate = format.parse(childBirthStr);
	        Date marriageDate = format.parse(marriageDateString);

	        if (marriageDate.compareTo(childBirthDate) == 1) {
	            System.out.println("Anamoly US08: Birth date of "+name +" (" +id +")"+" occurs before the marriage date of his/her parents in Family "+fid);
	            return true;
	        } else {
	            return false;
	        }

	    }
	 public static boolean compareDivorce (String childBirthStr, String divorceDateString, String id, String name, String fid ) throws ParseException {
	        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

	        Date childBirthDate = format.parse(childBirthStr);
	        Date divorceDate = format.parse(divorceDateString);

	        if (divorceDate.compareTo(childBirthDate) != 1) {
	            System.out.println("Anamoly US08: Birth date of "+name +" (" +id +")"+" occurs after the divorce date of his/her parents in Family "+fid);

	            return true;
	        } else {
	            return false;
	        }

	    }
}
