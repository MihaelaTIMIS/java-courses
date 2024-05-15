package heritage;

public class Homme extends Personne {
	
	private String genre;
	
	public Homme(String nom, String prenom, int age, String genre) {
		super(nom, prenom, age);
		this.genre = genre; 
	}

	public String getGenre() {
		return genre;
	}

	public void getGenre(String genre) {
		this.genre = genre;
	}
}
