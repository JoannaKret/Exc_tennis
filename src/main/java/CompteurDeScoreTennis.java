import java.util.Random;

public class CompteurDeScoreTennis {
	
	public Score scoreDepart() {
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
		int score1 = partieEnCours.score.getPointJoueur1();
		int score2 = partieEnCours.score.getPointJoueur2();
		while(partieEnCours.score.getJeuJoueur1() < 1 || partieEnCours.score.getJeuJoueur2() < 1) {
			int quiGagne = generer1ou0();
			if (quiGagne == 0) {
				switch(score1) {
					case 0:
						score1 += 15;
					case 15:
						score1 += 15;
					case 30:
						score1 += 10;
					case 40:

				}
				if (score1 < 50) {
					calculerPoints(score1);
				}
				else {
					annulerAvantage(score1, score2);
					else {
						score1 = 0;
						partieEnCours.score.setJeuJoueur1(1);
						System.out.println("1 a gagné");
						break;
					}
				}
			} else {
				if (score2 < 50) {
					calculerPoints(score2);
				}
				else {
					score2 = 0;
					partieEnCours.score.setJeuJoueur2(1);
					System.out.println("2 a gagné");
					break;
				}
			}
			System.out.println("Score de 1: " + score1);
			System.out.println("Score de 2: " + score2);
		}
		partieEnCours.score.setPointJoueur1(score1);
		partieEnCours.score.setPointJoueur2(score2);
		return partieEnCours;
	}

	public int annulerAvantage(int pointsInf, int pointsSup) {
		if (pointsInf == 40 && pointsSup == 50) {
			pointsSup = 40;
		}
		return pointsSup;
	}

	public int calculerPoints(int points) {
		if(points < 30) {
			points += 15;
			}
		else if (points < 50) {
			points += 10;
		}
		return points;
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
