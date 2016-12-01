package Test;

import Model.*;

public class ListLivingMarried
{
    public static void compare (Family fam){
        if (fam.getWife().getDeathDate() != null) {
        	
			System.out.println("Family Id: " + fam.getId() + " | Name: " + fam.getWife().getGivenName()+ " " +fam.getWife().getSurName() + " | Age: "+fam.getWife().getAge());

        	
        } 
        if (fam.getHusband().getDeathDate() != null) {
        	
			System.out.println("Family Id: " + fam.getId() + " | Name: " + fam.getHusband().getGivenName()+ " " +fam.getHusband().getSurName() + " | Age: "+fam.getHusband().getAge());

     

        }
    }
}
