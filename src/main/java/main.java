

public class main {
	
	
	CompteurDeScoreTennis compteur = new CompteurDeScoreTennis();
	
	public static void main(String[] args) {
		CompteurDeScoreTennis compteur = new CompteurDeScoreTennis();
		compteur.scoreDepart();
		Partie partieEnCours = compteur.createPartie();
		compteur.addPoints(partieEnCours);
		
	}
}
