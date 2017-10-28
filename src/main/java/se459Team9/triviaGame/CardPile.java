package se459Team9.triviaGame;


import java.util.LinkedList;
import java.util.Random;

import javax.swing.JOptionPane;


public class CardPile {

	public LinkedList<Card> cardPileForPlay = new LinkedList<Card>();	   // before each game, shuffled cards moved into this object
	public LinkedList<Card> cardPileForCount = new LinkedList<Card>();  // each displayed card will be  moved into this object

	Card card1 = new Card();
	Card card2 = new Card();
	Card card3 = new Card();
	Card card4 = new Card();
	Card card5 = new Card();
	Card card6 = new Card();
	Card card7 = new Card();
	Card card8 = new Card();
	Card card9 = new Card();
	Card card10 = new Card();	
	
	public void cardLoad() {  // hard code words, now here are three words
		
		
		card1.setCardName("Scrum");
		card1.setCardDescription("Scrum is an agile framework characterized by self-organizing teams and high degree of democracy in determining scope and self-volunteering task assignment");
		cardPileForPlay.add(card1);
		card2.setCardName("Sprint");
		card2.setCardDescription("Sprint is a short period of development that has a goal of a shippable product at the end. A Sprint is usually 2-4 weeks.");
		cardPileForPlay.add(card2);
		card3.setCardName("Product Backlog");
		card3.setCardDescription("Product Backlog is the stories describing new features to your product that the product owner wants to have.");
		card4.setCardName("Scrum master");
		card4.setCardDescription("Scrum master is the team leader of the developers and is in charge of making sure that nobody on the team is over-worked, that goals are realistic for each sprint, and that everybody on the team is feeling heard and a part of the team.");
		card4.setCardName("Product owner");
		card4.setCardDescription("Product owner is the representative for the business that is sponsoring the development of the product and is in charge of ensuring that the team is working towards what is most valuable for the business.");
		card5.setCardName("Estimate");
		card5.setCardDescription("Estimate is a collectively determined amount of difficulty or time or complexity that may be required for a particular story or individually determined by assigned developer for a particular task.");
		card6.setCardName("Task");
		card6.setCardDescription("Task is a single thing that must be accomplished and can be estimated in time required that is less than a single workday.");
		card7.setCardName("Job");
		card7.setCardDescription("A job is something that the business is trying to accomplish that has value to the business.");
		card8.setCardName("Sprint Retrospective");
		card8.setCardDescription("Retrospective is a ceremony that occurs at the end of every sprint where the development team reviews how well they worked or did not work and comes to an agreement about what they can do in the next sprint to work better.");
		card9.setCardName("Daily Stand-up");
		card9.setCardDescription("Stand-up is a regular 15-20 minute meeting with all members of the development team when the team can discuss what they accomplished in the last day, what they are blocked on, and the scrum master can figure out how to help blocked team members become un-blocked.");
		card10.setCardName("Sprint planning");
		card10.setCardDescription("Sprint planning is a ceremony that occurs at the beginning of every sprint where the development team meets to decide on the goal for the coming sprint and to asssign stories and break down assigned stories into tasks.");
		cardPileForPlay.add(card3);
	
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
		
		cardPileForCount.add(cardPileForPlay.remove(s));
		return card;
	}
	
}