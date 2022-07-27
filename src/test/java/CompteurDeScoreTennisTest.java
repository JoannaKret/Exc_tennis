import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class CompteurDeScoreTennisTest {
	
	private CompteurDeScoreTennis compteur = new CompteurDeScoreTennis();
	
	@Test
	public void createPartieCreateJoueur_returnOk() {
		
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
	public void createPartieScore_return0() {
		
		//Given
		
		//When
		Integer joueur1Point = CompteurDeScoreTennis.scoreDepart().getPointJoueur1();
		Integer joueur2Point = CompteurDeScoreTennis.scoreDepart().getPointJoueur2();
		Integer joueur1Jeu = CompteurDeScoreTennis.scoreDepart().getJeuJoueur1();
		Integer joueur2Jeu = CompteurDeScoreTennis.scoreDepart().getJeuJoueur2();
		Integer joueur1Set = CompteurDeScoreTennis.scoreDepart().getSetJoueur1();
		Integer joueur2Set = CompteurDeScoreTennis.scoreDepart().getSetJoueur2();
		//Then
		assertEquals(0, joueur1Point);
		assertEquals(0, joueur2Point);
		assertEquals(0, joueur1Jeu);
		assertEquals(0, joueur2Jeu);
		assertEquals(0, joueur1Set);
		assertEquals(0, joueur2Set);
		

		
		
	}
	
}
