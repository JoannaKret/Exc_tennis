

public class CompteurDeScoreTennis {
	
	public static void main(String[] args) {
		hello();
	}
	
	public static void hello() {
		System.out.println( "Hello World");
	}
	
	public static Score scoreDepart() {
		Score score = new Score();
		score.setPointJoueur1(0);
		score.setPointJoueur2(0);
		score.setJeuJoueur1(0);
		score.setJeuJoueur2(0);
		score.setSetJoueur1(0);
		score.setSetJoueur2(0);
		return score;
	}
	
	public Partie createPartie() {
		
		return new Partie();
	}
	
	
	public static void play() {
		
	}
}
