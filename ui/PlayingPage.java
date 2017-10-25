package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import card.Card;
import card.CardPile;

import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;

import teams.Team;
import javax.swing.JTextArea;
import java.awt.Component;
import java.awt.Color;

public class PlayingPage extends JFrame {

	private JPanel contentPane;
	private ArrayList<Team> teamList;
	private JTextField words;	
	Card card = new Card();
	CardPile cardPile = new CardPile();
	ArrayList<Team> temp;
	
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
	
	public PlayingPage(ArrayList<Team> teamList) {
		
		cardPile.cardLoad();
		card = cardPile.DrawCard();
		currentTeamGuessing = teamList.get(0);

		ArrayList<Team> teams = teamList;
/*		ArrayList<Team> randomList = null;
		if(!isEmpty(teams)) {
			do {
				int randomIndex = Math.abs(new Random().nextInt(teams.size()));
				randomList.add(teams.remove(randomIndex));
			}while(teams.size() > 0);
		}
		
		for(int i = 0; i< randomList.size(); i++) {
			teams.add(randomList.remove(i));
		}

*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		int lastDim1 = 0;

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
			if (name == "Purple") {
				newLabel.setForeground(new Color(128, 0, 128));
			} else if (name == "Green") {
				newLabel.setForeground(new Color(0, 128, 0));
				
			} else if (name == "Blue") {
				newLabel.setForeground(new Color(0, 0, 255));
				
			} else {
				newLabel.setForeground(new Color(255, 215, 0));

			}
			
			newLabel.setBounds(dim1, 6, 51, 38);
			contentPane.add(newLabel);
			
			JTextField newScoreBox = new JTextField();
			newScoreBox.setColumns(10);
			newScoreBox.setBounds(dim1, 42, 40, 20);
			contentPane.add(newScoreBox);
		}
		

		
		JTextArea description = new JTextArea();
		description.setBorder(null);
		description.setBounds(69, 103, 299, 153);
		description.setText(card.getCardDescription());
		contentPane.add(description);
		
		JButton btnSkip = new JButton("SKIP");
		btnSkip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				cardPile.cardPileForCount.add(card);
				card = cardPile.DrawCard();	
				words.setText(card.getCardName());
				description.setText(card.getCardDescription());
			}
		});
		btnSkip.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		btnSkip.setBounds(147, 301, 146, 60);
		contentPane.add(btnSkip);
		
		
		/*JLabel lblPurple = new JLabel("Purple");
		lblPurple.setForeground(new Color(128, 0, 128));
		lblPurple.setHorizontalAlignment(SwingConstants.CENTER);
		lblPurple.setBounds(192, 6, 51, 38);
		contentPane.add(lblPurple);
		
		JLabel lblGreen = new JLabel("Green");
		lblGreen.setForeground(new Color(0, 128, 0));
		lblGreen.setHorizontalAlignment(SwingConstants.CENTER);
		lblGreen.setBounds(242, 6, 51, 38);
		contentPane.add(lblGreen);
		
		JLabel lblBlue = new JLabel("Blue");
		lblBlue.setForeground(new Color(0, 0, 255));
		lblBlue.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlue.setBounds(294, 6, 51, 38);
		contentPane.add(lblBlue);
		
		JLabel lblYellow = new JLabel("Yellow");
		lblYellow.setForeground(new Color(255, 215, 0));
		lblYellow.setHorizontalAlignment(SwingConstants.CENTER);
		lblYellow.setBounds(345, 6, 51, 38);
		contentPane.add(lblYellow);*/
		
		JButton btnCorrect = new JButton("Correct");
		btnCorrect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				cardPile.cardPileForCount.add(card);
				card = cardPile.DrawCard();	
				words.setText(card.getCardName());
				description.setText(card.getCardDescription());
			}
		});
		
		btnCorrect.setBounds(69, 301, 66, 60);
		contentPane.add(btnCorrect);
		
		JButton btnStartTurn = new JButton("Start Turn");
		btnStartTurn.setBounds(69, 11, 89, 23);
		contentPane.add(btnStartTurn);
		
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
				String message = nextTeam.getName() + " is up and ";
				message += currentTeamGuessing.setNewRoles(lastClueGiver, lastGuesser);
				JOptionPane optionPane = new JOptionPane(message,JOptionPane.WARNING_MESSAGE);
				JDialog dialog = optionPane.createDialog("Warning!");
				dialog.setAlwaysOnTop(true); // to show top of all other application
				dialog.setVisible(true); // to visible the dialog	
			}
			
		});
		
		JButton btnWrong = new JButton("Wrong");
		btnWrong.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				cardPile.cardPileForCount.add(card);
				card = cardPile.DrawCard();
				words.setText(card.getCardName());
				description.setText(card.getCardDescription());
				System.out.println(teams);
			}
		});
		btnWrong.setBounds(302, 301, 66, 60);
		contentPane.add(btnWrong);
		
		words = new JTextField();
		words.setBackground(Color.LIGHT_GRAY);
		words.setHorizontalAlignment(SwingConstants.CENTER);
		words.setFont(new Font("Times New Roman", Font.BOLD, 24));
		words.setAlignmentX(Component.RIGHT_ALIGNMENT);
		words.setBounds(69, 56, 299, 43);
		contentPane.add(words);
		words.setColumns(10);
		words.setText(card.getCardName());
		words.setBackground(contentPane.getBackground());
		words.setBorder(null);
	
		
		
	}
}
