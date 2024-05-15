package tp;

public class Livre {
	public String titre;
	public String auteur;
	public int anneePublication;
	
	public Livre(String titre,  String auteur, int anneePublication) {
		this.titre = titre;
		this.auteur = auteur;
		this.anneePublication = anneePublication;
	}

	public void afficherInfoLivre() {
		System.out.println("Titre: "+titre+"\nAuteur: "+ auteur+"\nAnnée publication: "+anneePublication );
	}
	
	
	
}
