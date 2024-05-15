package formation;

import tp.Bibliotheque;
import tp.Livre;

public class Main {

	public static void main(String[] args) {

		Bibliotheque bibliotheque = new Bibliotheque();
		Livre roman = new Livre("Batman", "Bruce waye", 2021);
		bibliotheque.addLivre(roman);
		bibliotheque.afficher();

		// System.out.println("Coucou Miha");
		// Point point = new Point(2,3);
		// System.out.println("x: "+ point.x());
		// System.out.println("y: "+ point.y());
	}

}
