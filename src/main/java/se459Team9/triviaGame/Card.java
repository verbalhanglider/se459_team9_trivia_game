package se459Team9.triviaGame;



public class Card {
	public String name;
	public String description;
	
	public Card(String aName, String aDescription) {
		this.name = aName;
		this.description = aDescription;
	}

	public String getCardName() {
		return name;
	}
	
	public String getCardDescription() {
		return description;
	}
}
