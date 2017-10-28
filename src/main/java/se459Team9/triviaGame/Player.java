package se459Team9.triviaGame;


import java.util.Arrays;
import java.util.ArrayList;

 public class Player {
	 /*
	  * A Player has a name, a current role and a last role and a list of optional roles that the player is allowed to perform.
	  * New instance is instantiated with the name passed in construction, currentRole and lastRole as "not defined" and 
	  * optionalRoles that contain "clue-giver" and "guesser"
	  * 
	  * To get current role use method getCurrentrole(). To get player's name use method getName().
	  * To change player's currentRole use setCurrentRole.
	  */
	 private String playerName; // the player name
	 private String lastRole;
	 private String currentRole;
	 private ArrayList<String> optionalRoles;

	//Constructor
 	public Player(String name) {
 		/*
 		 * Create new instance by passing a String that is the name of the player
 		 */
 		this.setName(name);
 		this.playerName = name;
 		this.currentRole = "not defined";
 		this.lastRole = "not defined";
 		this.optionalRoles = new ArrayList<String>(Arrays.asList("clue-giver", "guesser"));	

 	}

 	private void setName(String name) {
 		this.playerName = name;
 	}

 	public String getName() {
 		/* Returns the string that is the player's name
 		 */
 		return playerName;
 	}
 	
 	public String getCurrentRole() {
 		/*
 		 * Returns a string that is the player's current role
 		 */
 		return this.currentRole;
 	}
 	
 	public String getLastRole( ) {
 		/*
 		 * Returns a string that is the player's role played in the last round
 		 */
 		return this.lastRole;
 	}
 	
 	private void setLastRole(String roleName) {
 		this.lastRole = roleName;
 	}
 	
 	public void setCurrentRole(String roleName) {
 		/*
 		 * Sets the player's current role to value of parameter roleName if palyer's currentRole and lastRole are both "not defined".
 		 * If the player's lastRole is "not defined" and the palyer's currentRole is either clue-giver or guesser, sets lastRole to current
 		 * value of currentRole and currentRole to value in optionalRoles that is not currentRole.
 		 * if neither lastRole nor currentRole are "not defined" sets the lastRole to current value currentRole and currentRole
 		 * to current value of lastRole.
 		 */
 		if (this.getCurrentRole() == "not defined" && this.getLastRole() == "not defined") {
 			boolean isItValid = false;
 			for (int i=0; i < this.optionalRoles.size(); i++) {
 				if (this.optionalRoles.get(i) == roleName) {
 					isItValid = true;
 				}
 			}
 			if (isItValid) {
 				this.currentRole = roleName;
 			}
 			else {
 				throw new IllegalArgumentException("only valid roles are either clue-giver or guesser");
 			}
 			
 		} else if (this.lastRole == "not defined") {
 			ArrayList<String> check = new ArrayList<String>();
 			for (int i=0; i < this.optionalRoles.size(); i++) {
 				if (!(this.optionalRoles.get(i) == this.getCurrentRole())) {
 					check.add(this.optionalRoles.get(i));
 					break;
 				}
 			}
 			String copiedCurrentRole = this.getCurrentRole();
 			this.setLastRole(copiedCurrentRole);
 			this.currentRole = check.get(0);
 		} else if (!(this.getLastRole() == "not defined") && !(this.getCurrentRole() == "not defined")) {
 			String copiedCurrentRole = this.getCurrentRole();
 			String newCurrentRole = "";
 			for (int i=0; i < this.optionalRoles.size(); i++) {
 				if (!(this.optionalRoles.get(i) == copiedCurrentRole)) {
 					newCurrentRole = this.optionalRoles.get(i);
 				}
 			}
 			this.currentRole = newCurrentRole;
 			this.lastRole = copiedCurrentRole;
 		}
 	}
 	
 	public boolean equals(Object comparisonObject) {
 		/*
 		 * returns true if both player's have the same name; returns false if each player has a different name
 		 */
 		if (comparisonObject instanceof Player && this.getName() == ((Player) comparisonObject).getName()) {
			return true;
		}
		return false;
 	}
 }