import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompteurDeScoreTennisTest {

	private CompteurDeScoreTennis compteur = new CompteurDeScoreTennis();
	private Partie partie = this.compteur.createPartie();

	@Test
	public void createPartieCreateJoueurInitialiseScore_returnOk() {

		//Given

		//When
		Partie partie = this.compteur.createPartie();
		//Then
		assertNotNull(partie);
		assertInstanceOf(Partie.class, partie);
		assertEquals("Jojo", partie.getJoueur1().getNom());
		assertEquals("Stephane", partie.getJoueur2().getNom());
		assertEquals(0, partie.score.getPointJoueur1());
	}

	@Test
	public void switchCase40J1_returnOkIfJ2has50() {
		//Given
		Partie partie = this.compteur.createPartie();
		partie.score.setPointJoueur1(40);
		partie.score.setPointJoueur2(50);
		//When
		this.compteur.switchCase40_J1(partie);
		//Then
		assertEquals(40, partie.score.getPointJoueur2());
	}

	@Test
	public void switchCase40J1_returnOkIfJ2has40() {
		//Given
		Partie partie = this.compteur.createPartie();
		partie.score.setPointJoueur1(40);
		partie.score.setPointJoueur2(40);
		//When
		this.compteur.switchCase40_J1(partie);
		//Then
		assertEquals(50, partie.score.getPointJoueur1());
	}

	@Test
	public void switchCase50J1_returnOkIfBoth40() {
		//Given
		Partie partie = this.compteur.createPartie();
		partie.score.setPointJoueur1(50);
		partie.score.setPointJoueur2(50);
		//When
		this.compteur.switchCase50_J1(partie);
		//Then
		assertEquals(40, partie.score.getPointJoueur1());
		assertEquals(40, partie.score.getPointJoueur2());
	}



}