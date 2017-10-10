package teams;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TeamTest {

	@Test
	public void testTeam() {
		Team teamOne = new Team();
		Team teamTwo = new Team();
		assertEquals(teamOne, teamTwo);
		assertNotEquals(teamOne, null);
		assertNotEquals(teamTwo, null);

	}

	@Test
	public void testSetName() {
		Team teamOne = new Team();
		teamOne.setName("Zippity Zebras");
		assertEquals(teamOne.getName(), "Zippity Zebras");
		

	}

	@Test
	public void testGetName() {
		Team newTeam = new Team();
		assertEquals(newTeam.getName(), "A New Team");
	}

	@Test
	public void testGetMembers() {
		ArrayList<String> emptyList = new ArrayList<String>();
		Team newTeam = new Team();
		
		assertEquals(newTeam.getMembers(), emptyList);
		
	}

	@Test
	public void testAddMember() {
		Team newTeam = new Team();
		ArrayList<String> data = new ArrayList<String>();
		assertEquals(newTeam.getMembers(), data);
		
	}

}
