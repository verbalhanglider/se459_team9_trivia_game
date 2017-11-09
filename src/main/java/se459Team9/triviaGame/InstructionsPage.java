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
		txtrTest.setText("Rule 1: Teams are composed of pairs.\n"
				+ "Rule 2: The trivia cards are placed in a single stack and used by all teams.\n"
				+ "Rule 3: A round last 2 minutes multiplied by the number of teams.\n"
				+ "Rule 4: During a round, one player from a team pulls trivia cards from the \n"
				+ "stack and after reading the brief description tries to get their teammate \n"
				+ "to guess the agile term on that card by giving the teammate clues.\n"
				+ "Rule 5: Reader is not allowed to use any agile words in clues from the \n"
				+ "prohibited list. \n"
				+ "Rule 6: When the guesser guesses correctly, the reader puts the card in the \n"
				+ "team’s guessed cards and draws a new card. When the guesser guesses \n"
				+ "incorrectly the reader puts the card in the game “wrong guess” pool \n"
				+ "Rule 7: A reader can skip a card for any reason, but a skipped card counts \n"
				+ "as a wrong answer. \n"
				+ "Rule 8: If a reader uses an agile word in a clue from the prohibited list, \n"
				+ "the reader must put the card in the “wrong guess” pool.\n"
				+ "Rule 9: The reader keeps pulling cards from the trivia stack until the time \n"
				+ "is up.\n"
				+ "Rule 10: Once the time is up, the next team has a turn. This goes on until \n"
				+ "all teams have had an opportunity to guess. Once it comes back to the first \n"
				+ "team, the player who was guessing now has an opportunity to read and the \n"
				+ "player who was reading has to be a guesser. Do this for every team. This is \n"
				+ "the start of a new round.\n"
				+ "Rule 11: A game lasts eight rounds.");
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
