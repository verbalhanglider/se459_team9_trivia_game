package se459Team9.triviaGame;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.junit.Test;

import se459Team9.triviaGame.Player;

public class PlayerTest {

	private static Player player1;
	private static Player player2;
	private static Player player3;
	
	@BeforeClass
	public static  void setUp() {
		player1 = new Player("Diane");
		player2 = new Player("Jill");
		player3 = new Player("Diane");
	}
	
	@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	@Test
	public void testPlayerEquals() {
		assertEquals(player1, player3);
	}

	@Test
	public void testPlayerNotEquals() {
		assertNotEquals(player1, player2);
	}
	
	@Test
	public void testGetName() {
		assertEquals(player1.getName(), "Diane");
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
		player1.setCurrentRole("clue-giver");
		assertEquals(player1.getCurrentRole(), "clue-giver");
		player1.setCurrentRole("clue-giver");
		assertEquals(player1.getCurrentRole(), "guesser");
	}

}
