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

	public Partie addPoints() {
		Partie partieEnCours = createPartie();
		int score1 = partieEnCours.score.getPointJoueur1();
		int score2 = partieEnCours.score.getPointJoueur2();
		while(partieEnCours.score.getJeuJoueur1() != 1 && partieEnCours.score.getJeuJoueur2() != 1) {
			int quiGagne = generer1ou0();
			if (quiGagne == 0) {
				switch(score1) {
					case 0:
						score1 += 15;
						break;
					case 15:
						score1 += 15;
						break;
					case 30:
						score1 += 10;
						break;
					case 40:
						switch (score2) {
							case 40: 
								score1 = 50;
								break;
							case 50:
								score2 = 40;
								break;
							default:
								
								break;
						}
					case 50 :
						partieEnCours.score.setJeuJoueur1(1);
						System.out.println("1 a gagné");
						score1 = 0;
						score2 = 0;
						break;
					default:
						break;
				}
				
				
			} else {
				switch(score2) {
					case 0:
						score2 += 15;
						break;
					case 15:
						score2 += 15;
						break;
					case 30:
						score2 += 10;
						break;
					case 40:
						switch (score1) {
						case 40: 
							score2 = 50;
							break;
						case 50:
							score1 = 40;
							break;
						default:
						
							break;
					}
					case 50 :

						partieEnCours.score.setJeuJoueur2(1);
						System.out.println("2 a gagné");
						score2 = 0;
						score1 = 0;
						break;
					default:
						break;
				}
				
			}
			System.out.println("Score de 1: " + score1);
			System.out.println("Score de 2: " + score2);
			System.out.println("Jeu de 1: " + partieEnCours.score.getJeuJoueur1());
			System.out.println("Jeu de 2: " + partieEnCours.score.getJeuJoueur2());
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
