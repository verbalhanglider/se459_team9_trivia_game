package se459Team9;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import static org.junit.Assert.*;

import se459Team9.triviaGame.Card;

public class CardTest {
	
	@Mock
	Card myCard;
	
	@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	@Test
	public void testsetCardName() {
		Card card = new Card("Test", "Test is...");
		assertEquals(card.getCardName(), "Test");
	}
	
	@Test
	public void testsetCardDescription() {
		Card card = new Card("Test", "Test is...");
		assertEquals(card.getCardDescription(), "Test is...");
	}
}
