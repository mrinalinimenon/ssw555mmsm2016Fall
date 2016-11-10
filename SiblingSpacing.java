package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import Model.Family;
import Model.Individual;

public class SiblingSpacing {
	public static boolean compare (Family fam ) throws ParseException {

		List<Individual> childList = fam.getChildList();

		SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");


		for (int j = 0; j < fam.getChildList().size(); j++) {
			Date birthDate_j= null;
			if (childList.get(j).getBirthDate()!=null){
				String birthStr_j = childList.get(j).getBirthDate();
				birthDate_j = format.parse(birthStr_j);
			}
			for (int k = 0; k < fam.getChildList().size(); k++){
				if (j!=k){
					Date birthDate_k = null;
					if (childList.get(k).getBirthDate()!=null){
						String birthStr_k = childList.get(k).getBirthDate();
						birthDate_k = format.parse(birthStr_k);
						if (birthDate_j != null && birthDate_k !=null){
							int diff =(int) getDateDiff(birthDate_j,birthDate_k,TimeUnit.DAYS);
							if (diff > 2 && diff <243){
					            System.out.println("Error US13: Birth dates of siblings "+ childList.get(j).getGivenName() + " " + childList.get(j).getSurName() +" (" +childList.get(j).getId()+")" +" and "+ childList.get(k).getGivenName() + " " + childList.get(k).getSurName() + " (" +childList.get(j).getId()+")" +" should be more than 8 months or less than 2 days apart in Family "+fam.getId());

							}
						}
					}
				}	
			}
		}

		return true;
	}

	public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
		long diffInMillies = date2.getTime() - date1.getTime();
		return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
	}


}
