package card;

public class Card {
	public String name;
	public String description;
	public String team; // this field records which card drew by which team.
	public int answer; // this field records the score, 0 for wrong and 1 for correct
	
	
	
	public Card () {
		name = "New Card Name";
		description = "Description";
	}
	
	public void setCardName(String name) {
		this.name = name;
		
	}
	
	public void setCardDescription(String description) {
		this.description = description;
	}
	
	public String getCardName() {
		return name;
	}
	
	public String getCardDescription() {
		return description;
	}
	
}
