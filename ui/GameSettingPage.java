

package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import teams.Team;

import java.awt.Color;
import javax.swing.JTextField;

public class GameSettingPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static GameSettingPage frame;
	private JTextField PurplePlayer1;
	private JTextField PurplePlayer2;
	private JTextField GreenPlayer1;
	private JTextField GreenPlayer2;
	private JTextField BluePlayer1;
	private JTextField BluePlayer2;
	private JTextField YellowPlayer1;
	private JTextField YellowPlayer2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new GameSettingPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GameSettingPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTeamSelection = new JLabel("TEAM SELECTION");
		lblTeamSelection.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		lblTeamSelection.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeamSelection.setBounds(25, 6, 406, 45);
		contentPane.add(lblTeamSelection);
		
		JButton btnStartGame = new JButton("START GAME");
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String player1 = PurplePlayer1.getText();
				String player2 = PurplePlayer2.getText();
				String player3 = GreenPlayer1.getText();
				String player4 = GreenPlayer2.getText();
				String player5 = BluePlayer1.getText();
				String player6 = BluePlayer2.getText();
				String player7 = YellowPlayer1.getText();
				String player8 = YellowPlayer2.getText();

				ArrayList<Team> allTeams = new ArrayList<Team>();
				
				if (player1.contains("Enter name") || player2.contains("Enter anme")) {
					
				} else {
					Team newTeam = new Team("Green");
					newTeam.addMember(player1);
					newTeam.addMember(player2);
					allTeams.add(newTeam);
					
				}
				
				if (player3.contains("Enter name") || player4.contains("Enter name")) {
					System.out.println(player3);
					System.out.println("hello");
					
				} else {
					Team newTeam = new Team("Blue");
					newTeam.addMember(player3);
					newTeam.addMember(player4);
					allTeams.add(newTeam);
				}
				
				if (player5.contains("Enter name") || player6.contains("Enter name")) {
					
				} else {
					Team newTeam = new Team("Purple");
					newTeam.addMember(player5);
					newTeam.addMember(player6);
					allTeams.add(newTeam);
				}
				
				if (player7.contains("Enter name") || player8.contains("Enter name")) {
					
				} else {
					Team newTeam = new Team("Yellow");
					newTeam.addMember(player7);
					newTeam.addMember(player8);
					allTeams.add(newTeam);
				}
				
				if (allTeams.size() == 2 || allTeams.size() == 4) {
					PlayingPage playingPage = new PlayingPage(allTeams);
					playingPage.setVisible(true);
				} else {
					JOptionPane optionPane = new JOptionPane("There must be at least 2 teams with both players defined",JOptionPane.WARNING_MESSAGE);
					JDialog dialog = optionPane.createDialog("Warning!");
					dialog.setAlwaysOnTop(true); // to show top of all other application
					dialog.setVisible(true); // to visible the dialog	
				}			
			}
		});
		
		
		btnStartGame.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		btnStartGame.setBounds(127, 310, 205, 42);
		contentPane.add(btnStartGame);
		
		JPanel panelPurple = new JPanel();
		panelPurple.setBorder(new LineBorder(new Color(102, 0, 102), 2, true));
		panelPurple.setBounds(19, 63, 195, 91);
		contentPane.add(panelPurple);
		panelPurple.setLayout(null);
		
		JLabel lblPurpleTeam = new JLabel("PURPLE TEAM");
		lblPurpleTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblPurpleTeam.setBounds(38, 6, 115, 16);
		panelPurple.add(lblPurpleTeam);
		
		PurplePlayer1 = new JTextField();
		PurplePlayer1.setText("Enter name");
		PurplePlayer1.setForeground(Color.BLACK);		
		PurplePlayer1.setColumns(10);
		PurplePlayer1.setBorder(null);
		PurplePlayer1.setBounds(23, 24, 130, 26);
		panelPurple.add(PurplePlayer1);
				
		PurplePlayer2 = new JTextField();
		PurplePlayer2.setText("Enter name");
		PurplePlayer2.setForeground(Color.BLACK);
		PurplePlayer2.setColumns(10);
		PurplePlayer2.setBorder(null);
		PurplePlayer2.setBounds(23, 59, 130, 26);
		panelPurple.add(PurplePlayer2);

		
		JPanel panelGreen = new JPanel();
		panelGreen.setLayout(null);
		panelGreen.setBorder(new LineBorder(new Color(102, 0, 102), 2, true));
		panelGreen.setBounds(236, 63, 195, 91);
		contentPane.add(panelGreen);
		
		JLabel lblGreenTeam = new JLabel("GREEN TEAM");
		lblGreenTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblGreenTeam.setBounds(38, 6, 115, 16);
		panelGreen.add(lblGreenTeam);
		
		GreenPlayer1 = new JTextField();
		GreenPlayer1.setText("Enter name");
		GreenPlayer1.setForeground(Color.BLACK);
		GreenPlayer1.setColumns(10);
		GreenPlayer1.setBorder(null);
		GreenPlayer1.setBounds(23, 24, 130, 26);
		panelGreen.add(GreenPlayer1);
		
		GreenPlayer2 = new JTextField();
		GreenPlayer2.setText("Enter name");
		GreenPlayer2.setForeground(Color.BLACK);
		GreenPlayer2.setColumns(10);
		GreenPlayer2.setBorder(null);
		GreenPlayer2.setBounds(23, 59, 130, 26);
		panelGreen.add(GreenPlayer2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(102, 0, 102), 2, true));
		panel.setBounds(19, 177, 195, 91);
		contentPane.add(panel);
		
		JLabel lblBlueTeam = new JLabel("BLUE TEAM");
		lblBlueTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlueTeam.setBounds(38, 6, 115, 16);
		panel.add(lblBlueTeam);
		
		
		BluePlayer1 = new JTextField();
		BluePlayer1.setText("Enter name");
		BluePlayer1.setForeground(Color.BLACK);
		BluePlayer1.setColumns(10);
		BluePlayer1.setBorder(null);
		BluePlayer1.setBounds(23, 24, 130, 26);
		panel.add(BluePlayer1);
		
		BluePlayer2 = new JTextField();
		BluePlayer2.setText("Enter name");
		BluePlayer2.setForeground(Color.BLACK);
		BluePlayer2.setColumns(10);
		BluePlayer2.setBorder(null);
		BluePlayer2.setBounds(23, 59, 130, 26);
		panel.add(BluePlayer2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(102, 0, 102), 2, true));
		panel_1.setBounds(236, 177, 195, 91);
		contentPane.add(panel_1);
		
		JLabel lblYellowTeam = new JLabel("YELLOW TEAM");
		lblYellowTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblYellowTeam.setBounds(38, 6, 115, 16);
		panel_1.add(lblYellowTeam);
		
		YellowPlayer1 = new JTextField();
		YellowPlayer1.setText("Enter name");
		YellowPlayer1.setForeground(Color.BLACK);
		YellowPlayer1.setColumns(10);
		YellowPlayer1.setBorder(null);
		YellowPlayer1.setBounds(23, 24, 130, 26);
		panel_1.add(YellowPlayer1);
		
		YellowPlayer2 = new JTextField();
		YellowPlayer2.setText("Enter name");
		YellowPlayer2.setForeground(Color.BLACK);
		YellowPlayer2.setColumns(10);
		YellowPlayer2.setBorder(null);
		YellowPlayer2.setBounds(23, 59, 130, 26);
		panel_1.add(YellowPlayer2);
				
	}
}
