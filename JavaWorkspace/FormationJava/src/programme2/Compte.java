package programme2;

public class Compte {
    // Attributs
    private int code;
    protected float solde;

    // Constructeur
    public Compte(int code, float solde) {
        this.code = code;
        this.solde = solde;
    }

    // Méthode pour verser un montant
    public void verser(float montant) {
        solde += montant;
    }

    // Méthode pour retirer un montant
    public void retirer(float montant) {
        solde -= montant;
    }

    // Une méthode qui retourne l'état
    public String etat() {
        return "Code: " + code + ", Solde: " + solde;
    }
}


