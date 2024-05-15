package personnel;

import java.time.LocalDate;

public class HeritageSSIIPersonnelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Developper dev = new Developper("Liliam Thuriam", 1970, 1800, 4, 7);
		System.out.println(annualSalaryMembre(dev.getName(), dev.getSalary(), dev.getHiringYear()));

		Commercial comm = new Commercial("Yves Le Drian", 1985, 1500, 5, 80000);
		System.out.println(annualSalaryCommercial(comm.getName(), comm.getSalary(), comm.getSalesAverage()));
		
	}
	
	static String annualSalaryMembre(String name ,double salary, int hiringYear){
			return name+ " (Dévéloppeur) a gagné " + salary*12 +" euros et a " + (LocalDate.now().getYear()-hiringYear) + " ans d'ancienneté.";
	}
	
	static String annualSalaryCommercial(String name ,double salary, double salesAverage){	
			return name + " (Commercial) a gagné " + (salary*12 + 0.10 * salesAverage)+ "euros et a "+ salesAverage+ " de chiffre d'affaire."; 
	}

}
