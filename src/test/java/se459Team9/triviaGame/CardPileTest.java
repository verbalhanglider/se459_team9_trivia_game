package se459Team9.triviaGame;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import se459Team9.triviaGame.Card;
import se459Team9.triviaGame.CardPile;
import static org.junit.Assert.*;


public class CardPileTest {

	@Mock
	CardPile myCardPile;
	
	@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();	
	
	@Test
	public void testDrawCard() { // each draw randomly take a card away from CardPileForPlay list
		Card aCard = new Card("Scrum", "Scrum is..");
		CardPile cardPile = new CardPile();
		cardPile.cardLoad(aCard);
		Card drawnCard = cardPile.drawCard();
		assertEquals(aCard.getCardName(), drawnCard.getCardName());		
	}
}
