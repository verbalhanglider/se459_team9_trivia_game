
public class Card {
	public String name;
	public String description;
	
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
