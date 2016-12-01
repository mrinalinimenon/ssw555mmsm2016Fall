package Test;
import Processor.ParseData;
import Model.Individual;

public class ListDeceased {
	public static void listDeceasedIndividuals(ParseData p){
		System.out.println("\n=== US29 List of Deceased Individuals ===");
		for (int i = 0; i < p.individuals.size(); i++) {
			Individual ind = p.individuals.get(i);
			if (ind.getDeathDate() != null ) {
				System.out.println("Individual Id: " + ind.getId() + " | Name: " + ind.getGivenName()+ " " +ind.getSurName() + " | Death Date: "+ind.getDeathDate());
			}
		}
	}
	

}
