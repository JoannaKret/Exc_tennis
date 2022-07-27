import java.util.Random;

public class CompteurDeScoreTennis {
	
	public static void main(String[] args) {
		Partie partieEnCours = createPartie();
		addPoints(partieEnCours);

	}
	
	public static void hello() {
		System.out.println( "Hello World");
	}
	
	public static Score scoreDepart() {
		Score scoreA0 = new Score(0,0,0,0,0,0);
		return scoreA0;
	}
	
	public static Partie createPartie() {
		Joueur joueur1 = new Joueur("Jojo");
		Joueur joueur2 = new Joueur("Stephane");
		Score score = scoreDepart();
		Partie nouvellePartie = new Partie(joueur1, joueur2, score);
		return nouvellePartie;
	}

	public static Partie addPoints(Partie partieEnCours) {
		int score1 = partieEnCours.score.getPointJoueur1();
		int score2 = partieEnCours.score.getPointJoueur2();
		while(partieEnCours.score.getJeuJoueur1() < 1 || partieEnCours.score.getJeuJoueur2() < 1) {
			int quiGagne = generer1ou0();
			if (quiGagne == 0) {
				if (score1 < 30) {
					score1 += 15;
				} else if (score1 < 50) {
					score1 += 10;
				} else {
					score1 = 0;
					partieEnCours.score.setJeuJoueur1(1);
					System.out.println("1 a gagné");
				}
			} else {
				if (score2 < 30) {
					score2 += 15;
				} else if (score2 < 50) {
					score2 += 10;
				} else {
					score2 = 0;
					partieEnCours.score.setJeuJoueur2(1);
					System.out.println("2 a gagné");
				}
			}
			System.out.println(score1);
			System.out.println(score2);
		}
		partieEnCours.score.setPointJoueur1(score1);
		partieEnCours.score.setPointJoueur2(score2);
		return partieEnCours;
	}

	//Fonction trouvée sur internet
	public static int generer1ou0() {
		Random rand = new Random(); //instance of random class
		int upperbound = 2;
		return rand.nextInt(upperbound);
	}
	
	public Partie play(Partie partie) {
		partie.score.setPointJoueur1(15);
		
		return partie;
	}
}
