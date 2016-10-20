package Test;

import Model.Individual;
import java.util.List;

public class UniqueID {
    public static boolean checkUniqueId(Individual ind, List<Individual> individuals) {
        String indId = ind.getId();
        for (int i = 0; i < individuals.size(); i++) {
            String id = individuals.get(i).getId();
            if (!individuals.get(i).equals(ind) && id.equals(indId)) {
                System.out.println("Error US22: Individual "+ ind.getGivenName() + " " + ind.getSurName() +" (" +id +") " +"has duplicate ID");

                return false;
            }
        }
        return true;
    }
}
