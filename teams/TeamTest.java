package teams;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TeamTest {

	@Test
	public void testTeam() {
<<<<<<< HEAD:src/teams/TeamTest.java
		Team teamOne = new Team("Blue");
=======
		Team teamOne = new Team("Green");
>>>>>>> 64e9cb5edc114dc87554b9ab7f42579d97bda3e5:teams/TeamTest.java
		Team teamTwo = new Team("Green");
		assertEquals(teamOne, teamTwo);
		assertNotEquals(teamOne, null);
		assertNotEquals(teamTwo, null);

	}

	@Test
	public void testSetName() {
		Team teamOne = new Team("Blue");
		teamOne.setName("Zippity Zebras");
		assertEquals(teamOne.getName(), "Zippity Zebras");
		

	}

	@Test
	public void testGetName() {
		Team newTeam = new Team("A New Team");
		assertEquals(newTeam.getName(), "A New Team");
	}

	@Test
	public void testGetMembers() {
		ArrayList<String> emptyList = new ArrayList<String>();
<<<<<<< HEAD:src/teams/TeamTest.java
		Team newTeam = new Team("Green");
=======
		Team newTeam = new Team("Blue");
>>>>>>> 64e9cb5edc114dc87554b9ab7f42579d97bda3e5:teams/TeamTest.java
		
		assertEquals(newTeam.getMembers(), emptyList);
		
	}

	@Test
	public void testAddMember() {
		Team newTeam = new Team("Blue");
		ArrayList<String> data = new ArrayList<String>();
		assertEquals(newTeam.getMembers(), data);
		
	}

}
