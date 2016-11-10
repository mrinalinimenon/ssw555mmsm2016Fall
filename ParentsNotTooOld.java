package Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParentsNotTooOld 
{
    public static void compare(String child, String father, String mother, String cid, String mid, String fid, String Fname, String Mname, String Cname, String famid) 
    {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

            Date childBirthDate = format.parse(child);
            Date fatherBirthDate = format.parse(father);
            Date motherBirthDate = format.parse(mother);

            long diffChildAndFather = childBirthDate.getTime() - fatherBirthDate.getTime();
            long diffChildAndMother= childBirthDate.getTime() - motherBirthDate.getTime();
            
            long diffYearChildAndFather = diffChildAndFather / (60 * 60 * 1000 * 24 * 365);
            long diffYearChildAndMother = diffChildAndMother / (60 * 60 * 1000 * 24 * 365);
            
            if (diffYearChildAndFather > 80)
                System.out.println("Error US12: " +Fname +" (" +fid +")" +" is more than 80 years old than his child "+Cname+" (" +cid +")" +" in Family "+famid);
            if (diffYearChildAndMother > 60)
                System.out.println("Error US12: " +Mname +" (" +mid +")" +" is more than 60 years old than her child "+Cname+" (" +cid +")" +" in Family "+famid);
        } catch (Exception ex) {

        }
    }
}
