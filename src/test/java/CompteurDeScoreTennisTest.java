import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompteurDeScoreTennisTest {

	private CompteurDeScoreTennis compteur = new CompteurDeScoreTennis();


	@Test
	public void createScoreDepartEqualO_ReturnOk() {
		//When
		Score generatedScore = this.compteur.scoreDepart();
		//Then
		assertNotNull(generatedScore);
		assertInstanceOf(Score.class, generatedScore);
		assertEquals(0, generatedScore.getPointJoueur1());
		assertEquals(0, generatedScore.getJeuJoueur1());
		assertEquals(0, generatedScore.getSetJoueur2());
	}

	@Test
	public void createScoreDepartEqualO_FailWhenNon0() {
		//When
		Score generatedScore = this.compteur.scoreDepart();
		//Then
		assertNotNull(generatedScore);
		assertNotEquals(30, generatedScore.getPointJoueur1());
		assertNotEquals(4, generatedScore.getSetJoueur2());
	}
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

	@Test
	public void addJeuAJoueur1_ReturnOk () {
		//Given
		Partie partie = this.compteur.createPartie();
		partie.score.setJeuJoueur1(3);
		//When
		this.compteur.setJeuJouer1(partie);
		//Then
		assertEquals(4, partie.score.getJeuJoueur1());
	}

	@Test
	public void addJeuAJoueur1_ReturnFailIf5 () {
		//Given
		Partie partie = this.compteur.createPartie();
		partie.score.setJeuJoueur1(5);
		//Then
		assertThrows(UnsupportedOperationException.class, ()-> this.compteur.setJeuJouer1(partie));
	}



}