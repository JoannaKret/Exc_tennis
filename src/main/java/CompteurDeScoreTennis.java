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
		while(partieEnCours.score.getJeuJoueur1() != 1 && partieEnCours.score.getJeuJoueur2() != 1) {
			int quiGagne = generer1ou0();
			if (quiGagne == 0) {
				switch(partieEnCours.score.getPointJoueur1()) {
					case 0:
						partieEnCours.score.setPointJoueur1(15);
						break;
					case 15:
						partieEnCours.score.setPointJoueur1(30);
						break;
					case 30:
						partieEnCours.score.setPointJoueur1(40);
						break;
					case 40:
						switchCase40_J1(partieEnCours);
						System.out.println("Score de 1: " + partieEnCours.score.getPointJoueur1());
						System.out.println("Score de 2: " + partieEnCours.score.getPointJoueur2());
					case 50 :
						switchCase50_J1(partieEnCours);
						break;
					default:
						break;
				}
				
				
			} else {
				switch(partieEnCours.score.getPointJoueur2()) {
					case 0:
						partieEnCours.score.setPointJoueur2(15);
						break;
					case 15:
						partieEnCours.score.setPointJoueur2(30);
						break;
					case 30:
						partieEnCours.score.setPointJoueur2(40);
						break;
					case 40:
						switchCase40_J2(partieEnCours);
						System.out.println("Score de 1: " + partieEnCours.score.getPointJoueur1());
						System.out.println("Score de 2: " + partieEnCours.score.getPointJoueur2());
					case 50 :
						switchCase50_J2(partieEnCours);
						break;
					default:
						break;
				}
				
			}
			System.out.println("Score de 1: " + partieEnCours.score.getPointJoueur1());
			System.out.println("Score de 2: " + partieEnCours.score.getPointJoueur2());
			System.out.println("Jeu de 1: " + partieEnCours.score.getJeuJoueur1());
			System.out.println("Jeu de 2: " + partieEnCours.score.getJeuJoueur2());
		}
		partieEnCours.score.setPointJoueur1(partieEnCours.score.getPointJoueur1());
		partieEnCours.score.setPointJoueur2(partieEnCours.score.getPointJoueur2());
		return partieEnCours;
	}

	public void switchCase40_J1(Partie partieEnCours) {
		switch (partieEnCours.score.getPointJoueur2()) {
			case 40:
				partieEnCours.score.setPointJoueur1(50);
				break;
			case 50:
				partieEnCours.score.setPointJoueur2(40);
				break;
			default:
				break;
		}
	}

	public void switchCase40_J2(Partie partieEnCours) {
		switch (partieEnCours.score.getPointJoueur1()) {
			case 40:
				partieEnCours.score.setPointJoueur2(50);
				break;
			case 50:
				partieEnCours.score.setPointJoueur1(40);
				break;
			default:
				break;
		}
	}

	public void switchCase50_J1(Partie partieEnCours) {
		if (partieEnCours.score.getPointJoueur2() == 50) {
			partieEnCours.score.setPointJoueur1(40);
			partieEnCours.score.setPointJoueur2(40);
			System.out.println("Score de 1: " + partieEnCours.score.getPointJoueur1());
			System.out.println("Score de 2: " + partieEnCours.score.getPointJoueur2());
		} else {
			System.out.println("Score de 1 gagne avantage: " + partieEnCours.score.getPointJoueur1());
			System.out.println("Score de 2 gagne avantage: " + partieEnCours.score.getPointJoueur2());
			partieEnCours.score.setJeuJoueur1(1);
			System.out.println("1 a gagné");
			partieEnCours.score.setPointJoueur1(0);
			partieEnCours.score.setPointJoueur2(0);
		}
	}

	public void switchCase50_J2(Partie partieEnCours) {
		if (partieEnCours.score.getPointJoueur1() == 50) {
			partieEnCours.score.setPointJoueur1(40);
			partieEnCours.score.setPointJoueur2(40);
			System.out.println("Score de 1: " + partieEnCours.score.getPointJoueur1());
			System.out.println("Score de 2: " + partieEnCours.score.getPointJoueur2());
		} else {
			System.out.println("Score de 1 gagne avantage: " + partieEnCours.score.getPointJoueur1());
			System.out.println("Score de 2 gagne avantage: " + partieEnCours.score.getPointJoueur2());
			partieEnCours.score.setJeuJoueur2(1);
			System.out.println("2 a gagné");
			partieEnCours.score.setPointJoueur1(0);
			partieEnCours.score.setPointJoueur2(0);
		}
	}

	//Fonction trouvée sur internet
	public int generer1ou0() {
		Random rand = new Random(); //instance of random class
		int upperbound = 2;
		return rand.nextInt(upperbound);
	}
	

}
