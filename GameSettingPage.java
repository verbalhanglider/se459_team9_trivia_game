package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;

public class GameSettingPage extends JFrame {

	private JPanel contentPane;
	static GameSettingPage frame;
	private JTextField PurplePlayer1;
	private JTextField PurplePlayer2;
	private JTextField GreenPlayer1;
	private JTextField GreenPlayer2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
				PlayingPage playingPage = new PlayingPage();
				playingPage.setVisible(true);
				frame.setVisible(false);				
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
		PurplePlayer1.setText("Enter Name");
		PurplePlayer1.setForeground(Color.BLACK);		
		PurplePlayer1.setColumns(10);
		PurplePlayer1.setBorder(null);
		PurplePlayer1.setBounds(23, 24, 130, 26);
		panelPurple.add(PurplePlayer1);
				
		PurplePlayer2 = new JTextField();
		PurplePlayer2.setText("Enter Name");
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
		GreenPlayer1.setText("Enter Name");
		GreenPlayer1.setForeground(Color.BLACK);
		GreenPlayer1.setColumns(10);
		GreenPlayer1.setBorder(null);
		GreenPlayer1.setBounds(23, 24, 130, 26);
		panelGreen.add(GreenPlayer1);
		
		GreenPlayer2 = new JTextField();
		GreenPlayer2.setText("Enter Name");
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
		
		textField = new JTextField();
		textField.setText("Enter Name");
		textField.setForeground(Color.BLACK);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(23, 24, 130, 26);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("Enter Name");
		textField_1.setForeground(Color.BLACK);
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(23, 59, 130, 26);
		panel.add(textField_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(102, 0, 102), 2, true));
		panel_1.setBounds(236, 177, 195, 91);
		contentPane.add(panel_1);
		
		JLabel lblYellowTeam = new JLabel("YELLOW TEAM");
		lblYellowTeam.setHorizontalAlignment(SwingConstants.CENTER);
		lblYellowTeam.setBounds(38, 6, 115, 16);
		panel_1.add(lblYellowTeam);
		
		textField_2 = new JTextField();
		textField_2.setText("Enter Name");
		textField_2.setForeground(Color.BLACK);
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(23, 24, 130, 26);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("Enter Name");
		textField_3.setForeground(Color.BLACK);
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBounds(23, 59, 130, 26);
		panel_1.add(textField_3);
				
	}
}
