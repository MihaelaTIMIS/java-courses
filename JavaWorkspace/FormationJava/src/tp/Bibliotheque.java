package tp;

public class Bibliotheque {
	public Livre livre;
	
	public void addLivre(Livre livre) {
		this.livre = livre;
	}
	
	public void afficher() {
		livre.afficherInfoLivre();
	}
}
