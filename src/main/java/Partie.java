

public class Partie {
	Joueur joueur1;	
	Joueur joueur2;	
	Score score;
	
	public Partie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Partie(Joueur joueur1, Joueur joueur2, Score score) {
		super();
		this.joueur1 = joueur1;
		this.joueur2 = joueur2;
		this.score = score;
	}
	public Joueur getJoueur1() {
		return joueur1;
	}
	public void setJoueur1(Joueur joueur1) {
		this.joueur1 = joueur1;
	}
	public Joueur getJoueur2() {
		return joueur2;
	}
	public void setJoueur2(Joueur joueur2) {
		this.joueur2 = joueur2;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	
	
}
