package se459Team9.triviaGame;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class PlayingPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<Team> teamList;
	private JTextField CountDownClock;
	Card card = new Card();
	CardPile cardPile = new CardPile();
	/* created property of class Team to hold currentTeamGuessing. 
	* this will change every time a new turn starts by 
	* clicking on "Start Turn"
	*/
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
	public void addTeams(ArrayList<Team> teams) {
		this.teamList = teams;
	}
	
	public static <V> boolean isEmpty(ArrayList<V> sourceList) {  
        return (sourceList == null || sourceList.size() == 0);  
    }  
	
	
	
	public PlayingPage(ArrayList<Team> teams) {

		
		final ArrayList<ScoreInfo> scoreInfoList = new ArrayList<ScoreInfo>();
		final JLabel Word = new JLabel("Card");
		final JTextArea WordDescription = new JTextArea(" ");
		WordDescription.setLineWrap(true);
		WordDescription.setColumns(5);
		WordDescription.setRows(20);
		teamList = teams;
		int lastDim1 = 0;
		
		cardPile.cardLoad();
		card = cardPile.DrawCard();
				
		
		ArrayList<Team> randomList = new ArrayList<Team>();
		
		if(!isEmpty(teams)) {
			do {
				int randomIndex = Math.abs(new Random().nextInt(teams.size()));
				randomList.add(teams.remove(randomIndex));
			}while(teams.size() > 0);
		}
		
		for(int i = 0; i< randomList.size(); i++) {
			teams.add(randomList.get(i));
		}
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 459);
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
			
			newScoreBox.setText("0");
			ScoreInfo score = new ScoreInfo ();
			score.setJTextField(newScoreBox);
			score.setTeamName(teamList.get(i).getName());
			score.setLabel(newLabel);
			
			String teamColorString = teamList.get(i).getName();
			int teamColor;
			if (teamColorString == "Purple") {
				teamColor = 1;
			} else if (teamColorString == "Green") {
				teamColor = 2;
			} else if (teamColorString == "Yellow") {
				teamColor = 3;
			} else if (teamColorString == "Blue") {
				teamColor = 4;
			} else {
				teamColor = 0;
			}
			switch(teamColor) {
			case 2 :
				newLabel.setForeground(new Color(0, 255, 0));
				if(currentTeamGuessing.getName() == teamColorString) 
				{
					newLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
				Word.setForeground(new Color(0, 255, 0));
				WordDescription.setForeground(new Color(0, 255, 0));
				}
				break;
				
			case 4 :
				newLabel.setForeground(new Color(0, 0, 255));
				if(currentTeamGuessing.getName() == teamColorString) 
				{
					newLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
					Word.setForeground(new Color(0, 0, 255));
					WordDescription.setForeground(new Color(0, 0, 255));
				}
				break;
				
			case 1 :
				newLabel.setForeground(new Color(128, 0, 128));
				if(currentTeamGuessing.getName() == teamColorString)
				{
					newLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
					Word.setForeground(new Color(128, 0, 128));
					WordDescription.setForeground(new Color(128, 0, 128));
				}
				break;
				
			case 3 :
				newLabel.setForeground(new Color(210, 105, 30));
				if(currentTeamGuessing.getName() == teamColorString)
				{
					newLabel.setFont(new Font("Lucida Grande", Font.BOLD, 13));
					Word.setForeground(new Color(210, 105, 30));
					WordDescription.setForeground(new Color(210, 105, 30));
				}
				break;
				
			default :
				break;
			}
			
			scoreInfoList.add(score);	
		}
		
		
		JButton btnSkip = new JButton("SKIP");
		btnSkip.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		btnSkip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				card = cardPile.DrawCard();	
				WordDescription.setText(card.getCardDescription());
				Word.setText(card.getCardName());
			}
		});
		btnSkip.setBounds(147, 350, 146, 60);
		contentPane.add(btnSkip);
		
		
		WordDescription.setBounds(69, 124, 299, 205);
		contentPane.add(WordDescription);
		WordDescription.setColumns(10);
		
		WordDescription.setText(card.getCardDescription());
		
		JButton btnCorrect = new JButton("Correct");
		btnCorrect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				for(int i = 0; i < teamList.size(); i++) {
					if(currentTeamGuessing.getName() == scoreInfoList.get(i).getTeamName())
					{
						teamList.get(i).setPoint(teamList.get(i).getPoint() + 1);
						int pointPlusOne = teamList.get(i).getPoint();
						String point = String.valueOf(pointPlusOne);
						scoreInfoList.get(i).getJTextField().setText(point);
						
					}
				}
								
				card = cardPile.DrawCard();	
				WordDescription.setText(card.getCardDescription());
				Word.setText(card.getCardName());				
			}
		});
		btnCorrect.setBounds(69, 350, 66, 60);
		contentPane.add(btnCorrect);
		
		JButton btnWrong = new JButton("Wrong");
		btnWrong.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				card = cardPile.DrawCard();	
				WordDescription.setText(card.getCardDescription());
				Word.setText(card.getCardName());
			}
		});
		btnWrong.setBounds(302, 350, 66, 60);
		contentPane.add(btnWrong);
		
		JButton btnStartTurn = new JButton("Next");
		btnStartTurn.setBounds(69, 11, 89, 23);
		contentPane.add(btnStartTurn);
		
		CountDownClock = new JTextField();
		CountDownClock.setBounds(10, 12, 55, 20);
		contentPane.add(CountDownClock);
		CountDownClock.setColumns(10);
		
		
		Word.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		Word.setHorizontalAlignment(SwingConstants.CENTER);
		Word.setBounds(160, 83, 108, 39);
		contentPane.add(Word);
		
		Word.setText(card.getCardName());
		
		
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
				JOptionPane optionPane = new JOptionPane(message,JOptionPane.WARNING_MESSAGE);
				JDialog dialog = optionPane.createDialog("Alert!");
				dialog.setAlwaysOnTop(true); // to show top of all other application
				//dialog.setLocation(frame.getX() + frame.getWidth()/2 - dialog.getWidth()/2, frame.getY() + frame.getHeight()/2 - dialog.getHeight()/2);
				dialog.setVisible(true); // to visible the dialog	


			}
			
		});
	}
}
