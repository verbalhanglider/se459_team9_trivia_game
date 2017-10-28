package se459Team9.triviaGame;


import javax.swing.JFrame;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class StartPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					StartPage window = new StartPage();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public StartPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnInstructions = new JButton("INSTRUCTIONS");
		btnInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InstructionsPage instructionsPage = new InstructionsPage();
				instructionsPage.setVisible(true);
			}
		});
		btnInstructions.setBounds(77, 222, 270, 29);
		frame.getContentPane().add(btnInstructions);
		
		JButton btnPlay = new JButton("PLAY");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameSettingPage gameSetting = new GameSettingPage();
				gameSetting.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnPlay.setBounds(77, 189, 270, 29);
		frame.getContentPane().add(btnPlay);
		
		JLabel lblTrivia = new JLabel("TRIVIA");
		lblTrivia.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		lblTrivia.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrivia.setBounds(77, 6, 270, 39);
		frame.getContentPane().add(lblTrivia);
		
		JLabel lblAnAgileGame = new JLabel("An agile game");
		lblAnAgileGame.setForeground(Color.BLACK);
		lblAnAgileGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnAgileGame.setBounds(166, 58, 100, 16);
		frame.getContentPane().add(lblAnAgileGame);
	}

	public void show() {

		frame.setVisible(true);
	}
}
