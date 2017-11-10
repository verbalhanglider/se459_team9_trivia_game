package se459Team9.triviaGame;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import se459Team9.triviaGame.Card;
import se459Team9.triviaGame.CardPile;
import static org.junit.Assert.*;

import org.junit.BeforeClass;


public class CardPileTest {

	@Mock
	CardPile myCardPile;
	
	@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();	
	
	private static CardPile cardPile;
	private static Card card;
	
	@BeforeClass
	public static  void setUp() {
		cardPile = new CardPile();
		card = new Card("Scrum", "Scrum is..");
		cardPile.cardLoad(card);
	}
	
	@Test
	public void testDrawCard() { // each draw randomly take a card away from CardPileForPlay list
		Card aCard = cardPile.drawCard();
		assertEquals(aCard.getCardName(), "Scrum");		
	}
}
