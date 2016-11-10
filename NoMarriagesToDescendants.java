package Test;

import Model.*;

import java.util.List;

public class NoMarriagesToDescendants {
    public static boolean compare (Family fam, List<Family> families) {
    	String hus_id= fam.getHusbandId();
    	String wife_id= fam.getWifeId();  
    	String fam_id = fam.getId();
    	for (int i =0; i< families.size(); i++){
        	   		
    		if (families.get(i) != null && !fam_id.equalsIgnoreCase(families.get(i).getId()) && hus_id.equalsIgnoreCase(families.get(i).getHusbandId())){
    			List<String> childList =families.get(i).getChildIdList();
    			for (String child : childList){
    				if (child.equalsIgnoreCase(wife_id)){
    					System.out.println("Anomaly US17: Family member "+fam.getHusband().getGivenName()+" (" +hus_id +")" +" has married to descendent " +fam.getWife().getGivenName()+"(" +wife_id +")" +" in Famliy " + fam.getId());       		
    				}
    			}
    			
    		}
    		if (families.get(i) != null && !fam_id.equalsIgnoreCase(families.get(i).getId()) && wife_id.equalsIgnoreCase(families.get(i).getWifeId())){
    			List<String> childList =families.get(i).getChildIdList();
    			for (String child : childList){
    				if (child.equalsIgnoreCase(hus_id)){
    					System.out.println("Anomaly US17: Family member "+fam.getHusband().getGivenName()+" (" +hus_id +")" +" has married to descendent " +fam.getWife().getGivenName()+"(" +wife_id +")" +" in Famliy " + fam.getId());       		
    				}
    			}
    			
    		}
    		
        }
        return true;
    }
}

