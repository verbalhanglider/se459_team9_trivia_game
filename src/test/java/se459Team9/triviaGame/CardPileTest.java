package se459Team9.triviaGame;

import org.junit.Rule;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import se459Team9.triviaGame.Card;
import se459Team9.triviaGame.CardPile;
import static org.junit.Assert.*;

import org.junit.BeforeClass;


public class CardPileTest {

	private static CardPile mockedCardPile;
	private static Card card1;
	
	@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();	
	
	@BeforeClass
	public static  void setUp() {
		mockedCardPile = mock(CardPile.class);
		card1 = new Card("Scrum", "Scrum is..");
		when(mockedCardPile.drawCard()).thenReturn(card1);		
	}
	
	@Test
	public void testDrawCard() { // each draw randomly take a card away from CardPileForPlay list
		String name = "Scrum";
		Card aCard = mockedCardPile.drawCard();
		assertNotNull(aCard);
		assertEquals(name, aCard.getCardName());		
	}
}
