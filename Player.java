import java.util.Scanner;
 public class Player {

 private int playerNumber; // the player number
 private String playerName; 
 private int points; // the points of the player



 //Constructor
 public Player(int playerNum) {

 playerNumber = playerNum;

 points = 0;

 }
 public Player(String name) {
     playerName = name;
 }

 public void setName(String name) {
     playerName = name;
 }


 public String getName() {
     return playerName;
 }

 public void enterName() {
 

 Scanner input = new Scanner(System.in); // scanner object for player input

 System.out.print("Please enter your name:"); //Asks user for a name

 String playerName = input.nextLine();
 Player player1 = new Player(playerName);
 
 playerName = input.nextLine();
 Player player2 = new Player(playerName);

 playerName = input.nextLine();
 Player player3 = new Player(playerName);

 playerName = input.nextLine();
 Player player4 = new Player(playerName);

 }

 public void addPoints() {

 points++; //add the points

 }

 public int getPoints() {

 return points; //return the points

 }
 } 