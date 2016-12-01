package Test;

import Model.Individual;

public class ListLivingSingle 
{
    public static void list(Individual ind) 
    {
    	if (ind.getDeathDate() == null && ind.getSpouse() == null && ind.getAge() > 30.0) 
        {
			System.out.println("Individual Id: " + ind.getId() + " | Name: " + ind.getGivenName()+ " " +ind.getSurName() + " | Age: "+ind.getAge());
        }
    }
}
