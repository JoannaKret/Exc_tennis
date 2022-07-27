import java.util.Random;

public class CompteurDeScoreTennis {
	
	public static void main(String[] args) {
		
	}
	
	public static void hello() {
		System.out.println( "Hello World");
	}
	
	public static Score scoreDepart() {
		Score scoreA0 = new Score(0,0,0,0,0,0);
		return scoreA0;
	}
	
	public Partie createPartie() {
		Joueur joueur1 = new Joueur("Jojo");
		Joueur joueur2 = new Joueur("Stephane");
		Score score = scoreDepart();
		Partie nouvellePartie = new Partie(joueur1, joueur2, score);
		return nouvellePartie;
	}

	public Partie addPoints(Partie partieEnCours) {
		int quiGagne = generer1ou0();
		if (quiGagne == 0) {
			partieEnCours.score.setPointJoueur1(15);
		}
		else {
			partieEnCours.score.setPointJoueur2(15);
		}
		return partieEnCours;
	}

	//Fonction trouvée sur internet
	public int generer1ou0() {
		Random rand = new Random(); //instance of random class
		int upperbound = 2;
		return rand.nextInt(upperbound);
	}
	
	public Partie play(Partie partie) {
		partie.score.setPointJoueur1(15);
		
		return partie;
	}
}
