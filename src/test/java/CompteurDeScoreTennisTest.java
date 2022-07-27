import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CompteurDeScoreTennisTest {
	
	@Test
	public void createPartieCreateJoueur_returnOk() {
		
		//Given
		Joueur joueur1 = new Joueur();
		Joueur joueur2 = new Joueur();
		joueur1.setNom("joanna");
		joueur2.setNom("Stéphane");
		//When
		String result = CompteurDeScoreTennis.createPartie(joueur1,joueur2);
		//Then
		assertEquals("partie créée", result);
		
		
	}
	
	@Test
	public void createPartieScore_return0() {
		
		//Given
		Score score = new Score();
		score.setPointJoueur1(0);
		score.setPointJoueur2(0);
		score.setJeuJoueur1(0);
		score.setJeuJoueur2(0);
		score.setSetJoueur1(0);
		score.setSetJoueur2(0);
		//When
		Integer result = CompteurDeScoreTennis.scoreDepart();
		//Then
		assertEquals(12, result);
		
		
	}
	
}
