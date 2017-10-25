package teams;

import java.util.ArrayList;

public class Team {
	/**
	 * A team has a name, and a list of members. The members list can have a set maximum members number.
	 * To use this class instantiate an instance of the class and add team members using the addMember method.
	 * If you want to change the team name, use the setName method with a String passed as  the parameter.
	 */
	private String name;
	private ArrayList<Player> members;
	private int size;
	private int maximumMembers;
	
	public Team(String teamName) {
		/*
		 * Constructor class instantiates the instance with a default name "A New Team", an empty members property,
		 * a size of 0 and maxmiumMembers set to 2
		 */
		name = teamName;
		members = new ArrayList<Player>();
		this.setSize(0);
		this.setMaximumMembers(2);
	}
	
	public String getCurrentClueGiver() {
		for (int i=0; i < this.members.size(); i++) {
			Player cur = this.members.get(i);
			String curRole = cur.getCurrentRole();
			if (curRole == "clue-giver") {
				return cur.getName();
			}
		}
		return "null";
	}

	public String getCurrentGuesser() {
		for (int i=0; i < this.members.size(); i++) {
			Player cur = this.members.get(i);
			String curRole = cur.getCurrentRole();
			if (curRole == "guesser") {
				return cur.getName();
			}
		}
		return "null";
		
	}
	public String setNewRoles(String lastClueGiver, String lastGuesser) {
		Player firstPlayer = this.members.get(0);
		Player secondPlayer = this.members.get(1);
		if (lastClueGiver == "null" && lastGuesser == "null") {
			firstPlayer.setCurrentRole("clue-giver");;
			secondPlayer.setCurrentRole("guesser");;
		}
		else {
			firstPlayer.setCurrentRole("clue-giver");;
			secondPlayer.setCurrentRole("guesser");
			
		}
		String output_pt1 = firstPlayer.getName() + " will be " + firstPlayer.getCurrentRole();
		String output_pt2 = secondPlayer.getName() + " will be " + secondPlayer.getCurrentRole();
		return output_pt1 + " and " + output_pt2;
	}
	
	public void setPlayerRole(String playerName) {
		Player cur;
		for (int i=0; i < this.members.size(); i++) {
			cur = this.members.get(i);
			if (cur.getName() == playerName) {
				String theRole = cur.getCurrentRole();
				cur.setCurrentRole(theRole);
			}
		}
	}
	private void setMaximumMembers(int max) {
		/* 
		 * a private method to set the maximumMembers property
		 */
		this.maximumMembers = max;
	}
	
	private int getMaximumMembers() {
		/*
		 * a private method to get the maximumMembers property
		 */
		return this.maximumMembers;
	}
	
	private void setSize(int aNumber) {
		/*
		 * a private method to set the size property of the instance
		 */
		this.size = aNumber;
	}
	
	private int getSize() {
		/*
		 * a private method to get the size property of the instance
		 */
		return this.size;
	}
	
	public void setName(String aName) {
		/*
		 * Use this method to set a new name to the team. Pass a string that is
		 * what you want the team to be named
		 */
		this.name = aName;
	}
	
	public String getName() {
		/*
		 * Will return the string value of the name property.
		 */
		return this.name;
	}
	
	public ArrayList<String> getMembers() {
		/*
		 * Returns a list of strings of the player names who are members of this team.
		 */
		ArrayList<String> output = new ArrayList<String>();
		for (int i=0; i < this.members.size(); i++) {
			output.add(this.members.get(i).getName());
		}
		return output;
	}
	
	public void addMember(String memberName) {
		/* 
		 * Pass a String and so long as the current size of members is less than 
		 * the maximum Members property  the String will be added to the members property.
		 * If the current size is equal to the maximum allowed members an 
		 * IllegalArgumentException will be raised.
		 * 
		 */
		if (this.getSize() < this.getMaximumMembers()) {
			members.add(new Player(memberName));
			this.setSize(this.getSize() + 1);
		}
		else {
			throw new IllegalArgumentException("A team can only have two members");
		}
	}
	
	public boolean equals(Object objectTwo) {		
		if (objectTwo instanceof Team && this.getName() == ((Team) objectTwo).getName()) {
			return true;
		}
		return false;
		
	}
}
