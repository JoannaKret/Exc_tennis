import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CompteurDeScoreTennisTest {
	
	@Test
	public void createPartie_returnOk() {
		
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
	
}
