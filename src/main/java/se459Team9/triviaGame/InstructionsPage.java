package se459Team9.triviaGame;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class InstructionsPage extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			InstructionsPage dialog = new InstructionsPage();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public InstructionsPage() {
		setBounds(100, 100, 688, 622);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblInstructions = new JLabel("INSTRUCTIONS");
			lblInstructions.setFont(new Font("Lucida Grande", Font.BOLD, 40));
			lblInstructions.setHorizontalAlignment(SwingConstants.CENTER);
			lblInstructions.setBounds(70, 6, 325, 48);
			contentPanel.add(lblInstructions);
		}
		
		JTextArea txtrTest = new JTextArea();
		txtrTest.setText("How to Play:"
				+ "Click Play and then fill in the teams that will be playing. There must be\n" 
				+ " at least 2 teams of 2 players and a maximum of 4 teams of 2 players. After you \n" 
				+ "have defined your teams click on Start Game and three windows will show up. \n"
				+ "The main window is the game screen. It shows the cards that you need to give clues \n" 
				+ "and give the guessing team a point for a correct guess by clicking Correct or skip a \n"
				+ "card if it is too hard and get no points but a new card. When you are ready to play \n"
				+ "and the first team guesser is behind the computer click Start Timer on the timer \n"
				+ "window. Now the clue giver should try to get through as many cards as they can \n" 
				+ "until the timer window says Time's up. When Time's up appears it's time to \n" 
				+ "click on the Next button in the game screen. The game will show a pop-up alert " 
				+ "telling you which team is next and what role each player should play. When the \n" 
				+ "new team is ready to guess, you should click Start timer and play until the \n" 
				+ "Timer's up alert shows up. Do this until there are no more cards");	
		txtrTest.setBounds(17, 52, 620, 418);
		txtrTest.setEditable(false);
		txtrTest.setAutoscrolls(true);
		
		
		contentPanel.add(txtrTest);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
