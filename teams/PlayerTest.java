package teams;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testPlayer() {
		Player playerOne = new Player("Jill");
		Player playerTwo = new Player("Jill");
		assertEquals(playerOne, playerTwo);
	}

	@Test
	public void testGetName() {
		Player newPlayer = new Player("Jill");
		assertEquals(newPlayer.getName(), "Jill");
	}

	@Test
	public void testGetCurrentRole() {
		Player newPlayer = new Player("Jill");
		assertEquals(newPlayer.getCurrentRole(), "not defined");	
	}

	@Test
	public void testGetLastRole() {
		Player newPlayer = new Player("Jill");
		assertEquals(newPlayer.getLastRole(), "not defined");
	}

	@Test
	public void testSetCurrentRole() {
		Player newPlayer = new Player("Jill");
		newPlayer.setCurrentRole("clue-giver");
		assertEquals(newPlayer.getCurrentRole(), "clue-giver");
		newPlayer.setCurrentRole("clue-giver");
		assertEquals(newPlayer.getCurrentRole(), "guesser");
		newPlayer.setCurrentRole("clue-giver");
		assertEquals(newPlayer.getCurrentRole(), "clue-giver");
	}

}
