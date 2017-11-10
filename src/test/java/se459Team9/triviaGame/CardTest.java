package se459Team9.triviaGame;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import static org.junit.Assert.*;

import org.junit.BeforeClass;

import se459Team9.triviaGame.Card;

public class CardTest {

	private static Card card;
	
	@BeforeClass
	public static  void setUp() {
		card = new Card("Scrum", "Scrum is...");
	}
	

	@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	@Test
	public void testgetCardName() {
		assertEquals(card.getCardName(), "Scrum");
	}
	
	@Test
	public void testgetCardDescription() {
		assertEquals(card.getCardDescription(), "Scrum is...");
	}
}
