package se459Team9;

import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JOptionPane;
import se459Team9.triviaGame.Card;

public class CardPile {

	@Mock
	CardPile myCardPile;
	
	@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	public LinkedList<Card> cardPileForPlay = new LinkedList<Card>();	   // before each game, shuffled cards moved into this object
	public LinkedList<Card> cardPileForCount = new LinkedList<Card>();  // each displayed card will be  moved into this object

	Card card1 = new Card();
	Card card2 = new Card();
	Card card3 = new Card();
	
	
	public void cardLoad() {  // hard code words, now here are three words
		
		card1.setCardName("Scrum");
		card1.setCardDescription("Scrum is ....");
		cardPileForPlay.add(card1);
		card2.setCardName("Sprint");
		card2.setCardDescription("Sprint is ....");
		cardPileForPlay.add(card2);
		card3.setCardName("Backlog");
		card3.setCardDescription("Backlog is ....");
		cardPileForPlay.add(card2);
	
	}
	
	public Card DrawCard() { // each draw randomly take a card away from CardPileForPlay list
		
		Card card = new Card();
		Random r = new Random();
		
		if (cardPileForPlay.size() <= 0) {
			JOptionPane.showMessageDialog(null, "Game Over", "Trivia ", JOptionPane.INFORMATION_MESSAGE);
		}
		int max = cardPileForPlay.size();
		int min = 0;
		int s = r.nextInt(max)%(max-min+1) + min;		
		card = cardPileForPlay.get(s);
		
		cardPileForPlay.remove(s);
		return card;
	}
	
}
