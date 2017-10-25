package card;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CardTest {
	Card card = new Card();
	public String name = "Test";
	public String description = "This is a description";

	@Test
	public void testsetCardName() {
		card.setCardName(name);
		assertEquals("Test", name);
	}
	
	@Test
	public void testsetCardDescription() {
		card.setCardDescription(description);
		assertEquals("This is a description", description);
	}
	
	@Test
	public void testgetCardName() {
		card.setCardName(name);
		assertEquals("Test", card.getCardName());
	}
	
	@Test
	public void testgetCardDescription() {
		card.setCardDescription(description);
		assertEquals("This is a description", card.getCardDescription());
	}

}
