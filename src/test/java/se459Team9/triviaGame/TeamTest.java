package se459Team9.triviaGame;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import se459Team9.triviaGame.Team;

public class TeamTest {	
	private static Team team1;
	private static Team team2;
	private static Team team3;
	
	@BeforeClass
	public static  void setUp() {
		team1 = new Team("Blue");
		team1.addMember("Fred");
		team1.addMember("Jill");
		team1.setPoint(1);
		team2 = new Team("Green");
		team2.addMember("Diane");
		team2.addMember("Erika");
		team3 = new Team("Blue");
		team3.setPoint(1);
		team3.setPoint(1 +1);
	}
	
	@Rule public MockitoRule mockitoRule = MockitoJUnit.rule();
	
	@Test
	public void testTeamEquality() throws Exception {
		assertEquals(team1, team3);
	}
	
	@Test
	public void testTeamNotEqual() throws Exception {
		assertNotEquals(team1, team2);
	}

	@Test
	public void testGetName() throws Exception {
		assertEquals(team1.getName(), "Blue");
	}

	@Test
	public void testGetMembers() throws Exception {
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("Fred");
		testList.add("Jill");
		assertEquals(team1.getMembers(), testList);	
	}

	@Test
	public void testAddMember() throws Exception {
		Team newTeam = new Team("Blue");
		ArrayList<String> data = new ArrayList<String>();
		assertEquals(newTeam.getMembers(), data);		
	}
	
	@Test
	public void testPoints() throws Exception {
		assertEquals(team3.getPoint(), 2);
		assertEquals(team1.getPoint(), 1);
	}

}
