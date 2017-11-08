package se459Team9;

import static org.junit.Assert.*;

import se459Team9.triviaGame.Card;

public class CardTest {
	Card card = new Card();
	public String name = "Test";
	public String description = "This is a description";

	public void testsetCardName() {
		card.setCardName(name);
		assertEquals("Test", name);
	}
	
	public void testsetCardDescription() {
		card.setCardDescription(description);
		assertEquals("This is a description", description);
	}
	
	
	public void testgetCardName() {
		card.setCardName(name);
		assertEquals("Test", card.getCardName());
	}
	
	public void testgetCardDescription() {
		card.setCardDescription(description);
		assertEquals("This is a description", card.getCardDescription());
	}

}
