package se459Team9.triviaGame;


import java.util.LinkedList;
import java.util.Random;

public class CardPile {

	public LinkedList<Card> cardPileForPlay = new LinkedList<Card>();	   // before each game, shuffled cards moved into this object
	public LinkedList<Card> cardPileForCount = new LinkedList<Card>();  // each displayed card will be  moved into this object
	
	public CardPile() {
		this.cardPileForPlay = new LinkedList<Card>();
		this.cardPileForCount = new LinkedList<Card>();
	}
	
	public void cardLoad(Card aCard) {  // hard code words, now here are three words
		this.cardPileForPlay.add(aCard);
	}
		
	public Card drawCard() { // each draw randomly take a card away from CardPileForPlay list
		
		Card card;
		Random r = new Random();
		
		if (cardPileForPlay.size() <= 0) {
			card = new Card("None", "None");
		} else {
			int max = cardPileForPlay.size();
			int min = 0;
			int s = r.nextInt(max)%(max-min+1) + min;		
			card = this.cardPileForPlay.get(s);
			this.cardPileForCount.add(this.cardPileForPlay.remove(s));			
		}
		return card;
	}
	
}