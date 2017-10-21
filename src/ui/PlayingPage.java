package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import teams.Team;

public class PlayingPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField words;
	private ArrayList<Team> teamList;
	private JTextField CountDownClock;
	
	// created property of class Team to hold currentTeamGuessing. 
	// this will change every time a new turn starts by 
	// clicking on "Start Turn"
	private Team currentTeamGuessing;

	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayingPage frame = new PlayingPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	
	public PlayingPage(ArrayList<Team> teams) {

		teamList = teams;
		int lastDim1 = 0;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		currentTeamGuessing = teams.get(0);
		for (int i=0; i < teamList.size(); i++) {
			Team aTeam = teamList.get(i);
			String name = aTeam.getName();
			JLabel newLabel = new JLabel(name);
			int dim1;
			if (lastDim1 == 0) {
				dim1 = 192;
				lastDim1 = 192;
			} else {
				dim1 = lastDim1 + 45;
				lastDim1 = dim1;
			}
			System.out.println(dim1);
			lastDim1 = dim1;
			newLabel.setHorizontalAlignment(SwingConstants.CENTER);
			newLabel.setBounds(dim1, 6, 51, 38);
			contentPane.add(newLabel);
			
			JTextField newScoreBox = new JTextField();
			newScoreBox.setColumns(10);
			newScoreBox.setBounds(dim1, 42, 40, 20);
			contentPane.add(newScoreBox);
		}

		
		JButton btnSkip = new JButton("SKIP");
		btnSkip.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		btnSkip.setBounds(147, 301, 146, 60);
		contentPane.add(btnSkip);
		
		words = new JTextField();
		words.setBounds(69, 71, 299, 205);
		contentPane.add(words);
		words.setColumns(10);
		
		JButton btnCorrect = new JButton("Correct");
		btnCorrect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCorrect.setBounds(69, 301, 66, 60);
		contentPane.add(btnCorrect);
		
		JButton btnWrong = new JButton("Wrong");
		btnWrong.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println(teamList);
			}
		});
		btnWrong.setBounds(302, 301, 66, 60);
		contentPane.add(btnWrong);
		
		JButton btnStartTurn = new JButton("Start Turn");
		btnStartTurn.setBounds(69, 11, 89, 23);
		contentPane.add(btnStartTurn);
		
		CountDownClock = new JTextField();
		CountDownClock.setBounds(10, 12, 55, 20);
		contentPane.add(CountDownClock);
		CountDownClock.setColumns(10);
		
		btnStartTurn.addActionListener(new ActionListener() {
			
			/*
			 * Every time a new turn should start the player should click on Start Turn button;
			 * this will check for the currentTeamGuessing property and find the next team in the list of teams playing 
			 * to find the next team
			 * 
			 * Next team gets role assigned for each player in the team and a string gets printed to the console 
			 * which player in that team is guesser and which player in that team is clue giver now.
			 * 
			 */
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String curTeamName = currentTeamGuessing.getName();
				int curTeamPos = 0;
				for (int i=0; i < teamList.size(); i++) {
					Team cur = teamList.get(i);
					if (cur.getName() == curTeamName) {
						curTeamPos = i;
						break;
					}
				}
				int nextTeamUp = curTeamPos + 1;
				Team nextTeam;
				try {
					nextTeam = teamList.get(nextTeamUp);
				} catch (IndexOutOfBoundsException e1) {
					nextTeam = teamList.get(0);
				}
				currentTeamGuessing = nextTeam;
				String lastClueGiver = currentTeamGuessing.getCurrentClueGiver();
				String lastGuesser = currentTeamGuessing.getCurrentGuesser();

				String message = currentTeamGuessing.setNewRoles(lastClueGiver, lastGuesser);
				System.out.println(message);

			}
			
		});
	}
}
