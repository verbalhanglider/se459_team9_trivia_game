package se459Team9.triviaGame;

import static org.junit.Assert.*;
import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.junit.Test;

import se459Team9.triviaGame.Card;
import se459Team9.triviaGame.Player;

public class PlayerTest {

	@Mock
	Card myPlayer;
	
	@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();
	
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
