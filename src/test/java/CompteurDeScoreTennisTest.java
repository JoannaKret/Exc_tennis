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
	public void ajoutePoint_returnOk() {
		//Given
		//When
		compteur.addPoints(partie);
		//Then
		int sumOfPoints = partie.score.getPointJoueur1() + partie.score.getPointJoueur2();
		assertNotEquals(0, sumOfPoints);
	}


}