package programme2;

import java.util.Scanner;

public class DeuxiemeProgramme {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez un entier: ");
		int nombre = scanner.nextInt();
		System.out.println("L'entier saisi est: "+ nombre);
		
		System.out.println("Entrez un double: ");
		double valeur = scanner.nextDouble();
		System.out.println("Le double saisi est: "+ valeur);
		
		// pas obligatoire, mais il est utilisé pour liberer la saisie clavier
		scanner.close();
	}

}

