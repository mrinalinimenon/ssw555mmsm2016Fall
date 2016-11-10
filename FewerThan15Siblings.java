package Test;

import Model.Family;

public class FewerThan15Siblings 
{
    public static boolean compare (Family fam)
    {
        if (fam.getChildList().size() >= 15) 
        {
            System.out.println("Error US15: Family " + fam.getId() + " has more than 15 siblings");
            return false;
        }
        return true;
    }
}
