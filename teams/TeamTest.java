package teams;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TeamTest {

	@Test
	public void testTeam() {
		Team teamOne = new Team("Green");
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
		Team newTeam = new Team("Blue");
		
		assertEquals(newTeam.getMembers(), emptyList);
		
	}

	@Test
	public void testAddMember() {
		Team newTeam = new Team("Blue");
		ArrayList<String> data = new ArrayList<String>();
		assertEquals(newTeam.getMembers(), data);
		
	}

}
