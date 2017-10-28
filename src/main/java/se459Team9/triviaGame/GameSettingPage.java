package se459Team9.triviaGame;


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
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;

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
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					frame = new GameSettingPage();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//		
//	}

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
				String player5 = PurplePlayer1.getText();				
				String player6 = PurplePlayer2.getText();
				String player1 = GreenPlayer1.getText();
				String player2 = GreenPlayer2.getText();
				String player3 = BluePlayer1.getText();
				String player4 = BluePlayer2.getText();
				String player7 = YellowPlayer1.getText();
				String player8 = YellowPlayer2.getText();
				
				
				ArrayList<Team> allTeams = new ArrayList<Team>();
				
				if (player1.contains("Enter name") || player2.contains("Enter anme")) {
					
				} else {
					Team newTeam = new Team("Green Team");
					newTeam.addMember(player1);
					newTeam.addMember(player2);
					allTeams.add(newTeam);
					
				}
				
				if (player3.contains("Enter name") || player4.contains("Enter name")) {
					System.out.println(player3);
					System.out.println("hello");
					
				} else {
					Team newTeam = new Team("Blue Team");
					newTeam.addMember(player3);
					newTeam.addMember(player4);
					allTeams.add(newTeam);
				}
				
				if (player5.contains("Enter name") || player6.contains("Enter name")) {
					
				} else {
					Team newTeam = new Team("Purple Team");
					newTeam.addMember(player5);
					newTeam.addMember(player6);
					allTeams.add(newTeam);
				}
				
				if (player7.contains("Enter name") || player8.contains("Enter name")) {
					
				} else {
					Team newTeam = new Team("Yellow Team");
					newTeam.addMember(player7);
					newTeam.addMember(player8);
					allTeams.add(newTeam);
				}
				
				if (allTeams.size() == 2 || allTeams.size() == 4) {
					System.out.println(allTeams);
					PlayingPage playingPage = new PlayingPage(allTeams);
					playingPage.setVisible(true);
					
				} else {
					JOptionPane optionPane = new JOptionPane("There must be at least 2 teams with both players defined",JOptionPane.WARNING_MESSAGE);
					JDialog dialog = optionPane.createDialog("Warning!");
					dialog.setAlwaysOnTop(true); // to show top of all other application
					dialog.setLocation(frame.getX() + frame.getWidth()/2 - dialog.getWidth()/2, frame.getY() + frame.getHeight()/2 - dialog.getHeight()/2);
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
		lblPurpleTeam.setForeground(new Color(128, 0, 128));
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
		
		PurplePlayer1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PurplePlayer1.setText("");
			}
		});
				
					
		PurplePlayer2 = new JTextField();
		PurplePlayer2.setText("Enter name");
		PurplePlayer2.setForeground(Color.BLACK);
		PurplePlayer2.setColumns(10);
		PurplePlayer2.setBorder(null);
		PurplePlayer2.setBounds(23, 59, 130, 26);		
		panelPurple.add(PurplePlayer2);
		
		PurplePlayer2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				PurplePlayer2.setText("");
			}
		});
				
		
		JPanel panelGreen = new JPanel();
		panelGreen.setLayout(null);
		panelGreen.setBorder(new LineBorder(new Color(0, 128, 0), 2, true));
		panelGreen.setBounds(236, 63, 195, 91);
		contentPane.add(panelGreen);
		
		JLabel lblGreenTeam = new JLabel("GREEN TEAM");
		lblGreenTeam.setForeground(new Color(0, 128, 0));
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
		
		GreenPlayer1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GreenPlayer1.setText("");
			}
		});
				
		
		GreenPlayer2 = new JTextField();
		GreenPlayer2.setText("Enter name");
		GreenPlayer2.setForeground(Color.BLACK);
		GreenPlayer2.setColumns(10);
		GreenPlayer2.setBorder(null);
		GreenPlayer2.setBounds(23, 59, 130, 26);
		panelGreen.add(GreenPlayer2);
		
		GreenPlayer2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GreenPlayer2.setText("");
			}
		});
				
		
		JPanel panelBlue = new JPanel();
		panelBlue.setForeground(new Color(0, 0, 255));
		panelBlue.setLayout(null);
		panelBlue.setBorder(new LineBorder(new Color(0, 0, 255), 2, true));
		panelBlue.setBounds(19, 177, 195, 91);
		contentPane.add(panelBlue);
		
		JLabel lblBlueTeam = new JLabel("BLUE TEAM");
		lblBlueTeam.setForeground(new Color(0, 0, 255));
		lblBlueTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlueTeam.setBounds(38, 6, 115, 16);
		panelBlue.add(lblBlueTeam);
		
		
		BluePlayer1 = new JTextField();
		BluePlayer1.setText("Enter name");
		BluePlayer1.setForeground(Color.BLACK);
		BluePlayer1.setColumns(10);
		BluePlayer1.setBorder(null);
		BluePlayer1.setBounds(23, 24, 130, 26);
		panelBlue.add(BluePlayer1);
		
		BluePlayer1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BluePlayer1.setText("");
			}
		});
				
		
		BluePlayer2 = new JTextField();
		BluePlayer2.setText("Enter name");
		BluePlayer2.setForeground(Color.BLACK);
		BluePlayer2.setColumns(10);
		BluePlayer2.setBorder(null);
		BluePlayer2.setBounds(23, 59, 130, 26);
		panelBlue.add(BluePlayer2);
		
		BluePlayer2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BluePlayer2.setText("");
			}
		});
				
		
		
		JPanel panelYellow = new JPanel();
		panelYellow.setLayout(null);
		panelYellow.setBorder(new LineBorder(new Color(210, 105, 30), 2, true));
		panelYellow.setBounds(236, 177, 195, 91);
		contentPane.add(panelYellow);
		
		JLabel lblYellowTeam = new JLabel("YELLOW TEAM");
		lblYellowTeam.setForeground(new Color(210, 105, 30));
		lblYellowTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblYellowTeam.setBounds(38, 6, 115, 16);
		panelYellow.add(lblYellowTeam);
		
		YellowPlayer1 = new JTextField();
		YellowPlayer1.setText("Enter name");
		YellowPlayer1.setForeground(Color.BLACK);
		YellowPlayer1.setColumns(10);
		YellowPlayer1.setBorder(null);
		YellowPlayer1.setBounds(23, 24, 130, 26);
		panelYellow.add(YellowPlayer1);
		
		YellowPlayer1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				YellowPlayer1.setText("");
			}
		});
				
		
		
		YellowPlayer2 = new JTextField();
		YellowPlayer2.setText("Enter name");
		YellowPlayer2.setForeground(Color.BLACK);
		YellowPlayer2.setColumns(10);
		YellowPlayer2.setBorder(null);
		YellowPlayer2.setBounds(23, 59, 130, 26);
		panelYellow.add(YellowPlayer2);
		
		YellowPlayer2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				YellowPlayer2.setText("");
			}
		});
				
		
				
	}
}