

public class CompteurDeScoreTennis {
	
	public static void main(String[] args) {
		hello();
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
	
	
	public static void play() {
		
	}
}
