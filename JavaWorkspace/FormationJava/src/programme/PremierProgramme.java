package programme;

import java.util.Scanner;

public class PremierProgramme {
	int total;
	char valeur;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Donner un nombre pour calculer son factoriel: ");
		Scanner num = new Scanner(System.in);
		int n_factoriel = num.nextInt();
		
		System.out.println("Le factoriel de "+ n_factoriel +  " est : "+factoriel(n_factoriel));
		
		System.out.println("\n");
		
		System.out.println("Donner un nombre pour tester s'il est prime: ");
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		
		if(premier(n)) System.out.println(n+" est prime");
		else System.out.println(n+" n'est pas prime");
		
		System.out.println("\n");
		
		System.out.println("Ca marche !");
		
		double v1 = 5.5;
		Double v2 = new Double(5.6);
		long a=5;
		Long b = new Long(5);
		Long c = 5L;
		
		System.out.println("a=" +a);
		System.out.println("b=" +b.longValue());
		System.out.println("c=" +c.byteValue());
		System.out.println("v1="+v1);
		System.out.println("v2="+v2.intValue());

		System.out.println("\n");
		
		System.out.println("Donner un nombre pour découvrir le jour de la semaine: ");
		
		Scanner clavier = new Scanner(System.in);
		int nb= clavier.nextInt();
		switch(nb) {
		case 1: System.out.println("Lundi");break;
		case 2: System.out.println("Mardi");break;
		case 3: System.out.println("Mercredi");break;
		case 4: System.out.println("Jeudi");break;
		case 5: System.out.println("Vendredi");break;
		default: System.out.println("Weekend");
		}
		
		System.out.println("\n");
		
		System.out.println("Tester la boucle FOR \n");
		
		for(int i= 2; i< 10; i++) {
			System.out.println("I="+i);
		}
		
		int[] tab = new int[] {4,5,6,7};
		
		System.out.println("\n");
		System.out.println("Tester le break/return in FOR");
		
		for(int i=0; i<tab.length; i++) {
			System.out.println(tab[i]);
			if(tab[i]==5) {
				break;
			
			}
		}
		
		System.out.println("\n");
		System.out.println("Tester while/do while");
		
		int s=0;
		int i=0;
		
		while(i<10) {
			s+=i;
			i++;
		}
		System.out.println("Somme="+s);
		
		int sum=0;
		int counter=0;
		
		do {
			sum+=counter;
			counter++;
		}while(counter<10);
		
		System.out.println("Somme="+sum);
	}

	public static boolean premier(int n) {
		if(n < 2) return false;
		
		for(int i=2; i<= Math.sqrt(n);i++) {
			if(n%i == 0) return false;
		}
		return true;
	}
	
	public static int factoriel(int n) {
		
		System.out.println("check n: "+n);
		int result = n;
		for(int i=2; i<n; i++) {
			result = result * i;
			System.out.println("check result: "+result);
		}
		return result;
	
	}
}
