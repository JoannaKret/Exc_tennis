import java.util.Random;

public class CompteurDeScoreTennis {
	
	boolean tieBreak = false;
	
	public Score scoreDepart() {
		return new Score(0,0,0,0,0,0);
	}
	
	public Partie createPartie() {
		Joueur joueur1 = new Joueur("Jojo");
		Joueur joueur2 = new Joueur("Stephane");
		Score score = scoreDepart();
		return new Partie(joueur1, joueur2, score);
	}

	public Partie addPoints() {
		Partie partieEnCours = createPartie();
		
			while(partieEnCours.score.getSetJoueur1() != 2 && partieEnCours.score.getSetJoueur2() != 2) {
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
				System.out.println("Set de 1: " + partieEnCours.score.getSetJoueur1());
				System.out.println("Set de 2: " + partieEnCours.score.getSetJoueur2());
			}
		
			

		partieEnCours.score.setPointJoueur1(partieEnCours.score.getPointJoueur1());
		partieEnCours.score.setPointJoueur2(partieEnCours.score.getPointJoueur2());
		
		if (partieEnCours.score.getSetJoueur1() == 2 ) {
			System.out.println("joueur 1 gagne le match");
		} else if (partieEnCours.score.getSetJoueur2() == 2) {
			System.out.println("joueur 2 gagne le match");
		}
		return partieEnCours;
	}

	public void comptePointTieBreak(Partie partieEnCours) {
		int pointTieBreakJoueur1 = 0;
		int pointTieBreakJoueur2 = 0;
		while(pointTieBreakJoueur1 != 7) {
			switch (pointTieBreakJoueur1) {
				case 0:
					pointTieBreakJoueur1 = 1;
					break;
				case 1:
					pointTieBreakJoueur1 = 2;
					break;
				case 2:
					pointTieBreakJoueur1 = 3;
					break;
				case 3:
					pointTieBreakJoueur1 = 4;
					break;
				case 4:
					pointTieBreakJoueur1 = 5;
					break;
				case 5:
					pointTieBreakJoueur1 = 6;
					break;
				case 6:
					partieEnCours.score.setSetJoueur1(partieEnCours.score.getSetJoueur1() + 1);
					tieBreak = false;
					break;
			}
		}
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

			switch  (partieEnCours.score.getJeuJoueur1()) {
				case 0:
					partieEnCours.score.setJeuJoueur1(1);
					break;
				case 1:
					partieEnCours.score.setJeuJoueur1(2);
					break;
				case 2:
					partieEnCours.score.setJeuJoueur1(3);
					break;
				case 3:
					partieEnCours.score.setJeuJoueur1(4);
					break;
				case 4:
					partieEnCours.score.setJeuJoueur1(5);
					break;
				case 5:
					partieEnCours.score.setJeuJoueur1(6);
					if (partieEnCours.score.getJeuJoueur2() != 5 || partieEnCours.score.getJeuJoueur2() != 6 ) {
						partieEnCours.score.setSetJoueur1(partieEnCours.score.getSetJoueur1() + 1);
						partieEnCours.score.setJeuJoueur1(0);
						partieEnCours.score.setJeuJoueur2(0);						
					} else {
						tieBreak = true;
						System.out.println("C'est le tie-break");
						comptePointTieBreak(partieEnCours);
					}
					break;
				default:
					break;
				
			}

			setJeuJouer1(partieEnCours);
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
			switch  (partieEnCours.score.getJeuJoueur2()) {
				case 0:
					partieEnCours.score.setJeuJoueur2(1);
					break;
				case 1:
					partieEnCours.score.setJeuJoueur2(2);
					break;
				case 2:
					partieEnCours.score.setJeuJoueur2(3);
					break;
				case 3:
					partieEnCours.score.setJeuJoueur2(4);
					break;
				case 4:
					partieEnCours.score.setJeuJoueur2(5);
					break;
				case 5:
					switch (partieEnCours.score.getJeuJoueur1()) {
					case 6:
						break;
					default:
						if ( partieEnCours.score.getSetJoueur2() != 2) {
							partieEnCours.score.setSetJoueur2(partieEnCours.score.getSetJoueur2() + 1);
							partieEnCours.score.setJeuJoueur2(0);
							partieEnCours.score.setJeuJoueur1(0);
						} else {
							System.out.println("partie gagn�e par joueur 2");
						}
						break;
						
					} 
					partieEnCours.score.setJeuJoueur1(5);
					break;
				default:
					break;
			
		}

			setJeuJouer2(partieEnCours);
			
			System.out.println("2 a gagné");
			partieEnCours.score.setPointJoueur1(0);
			partieEnCours.score.setPointJoueur2(0);
		}
	}

	public void setJeuJouer1(Partie partieEnCours) {

	}

	public void setJeuJouer2(Partie partieEnCours) {
	}

	//Fonction trouvée sur internet
	public int generer1ou0() {
		Random rand = new Random(); //instance of random class
		int upperbound = 2;
		return rand.nextInt(upperbound);
	}
	

}
