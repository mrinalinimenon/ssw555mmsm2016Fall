import Model.Family;
import Model.Individual;
import Processor.ParseData;
import java.lang.Exception;



public class readfile {
	public static void main(String[] args) {
		String filename = "My-Family-21-May-2016.ged";
		ParseData p = new ParseData();
		try {
			p.readFile(filename);
			for (int i = 0; i < p.individuals.size(); i++) {
				Individual ind = p.individuals.get(i);
				System.out.println("ID: " + ind.getId());
				System.out.println("Given Name: " + ind.getGivenName());
				System.out.println("Family Name: " + ind.getSurName());
				System.out.println("Sex: " + ind.getSex());
				System.out.println("Birth Date: " + ind.getBirthDate());
				if (ind.getDeathDate() != null) {
					System.out.println("Death Date: " + ind.getDeathDate());
				}
				
				if (ind.getDeathDate() != null) {
					Test.BirthBeforeDeath.compare(ind.getBirthDate(), ind.getDeathDate());
				}
				
				System.out.println();
			}
			
			System.out.println("=== Families Information ===");
			for (int i = 0; i < p.families.size(); i++) {
				System.out.println("");
				Family fam = p.families.get(i);
				System.out.println("Family ID: " + fam.getId());
				System.out.println("Family HUSBAND: " + fam.getHusband().getName());
				System.out.println("Family Wife: " + fam.getWife().getName());
				System.out.println("Family Wedding Date: " + fam.getWeddingDate());

				if (fam.getHusband() != null && fam.getWeddingDate() != null)
					Test.BirthBeforeMarriage.compare(fam.getHusband().getBirthDate(), fam.getWeddingDate());

				if (fam.getWife() != null && fam.getWeddingDate() != null)
					Test.BirthBeforeMarriage.compare(fam.getWife().getBirthDate(), fam.getWeddingDate());

			}
			System.out.println();
			
		} catch (Exception e) {
		}
	}
}