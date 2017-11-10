package se459Team9.triviaGame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;

public class ProhibitedWordList extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ProhibitedWordList dialog = new ProhibitedWordList();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ProhibitedWordList() {
		setBounds(100, 100, 450, 768);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel prohibitedWords = new JLabel("Prohibited Words");
		prohibitedWords.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		prohibitedWords.setHorizontalAlignment(SwingConstants.CENTER);
		prohibitedWords.setBounds(95, 6, 221, 25);
		contentPanel.add(prohibitedWords);
		
		JTextArea wordList = new JTextArea();
		wordList.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		wordList.setBounds(29, 43, 403, 687);
		
		wordList.setText("          1.. Scrum \n" + 
				"          2. Daily scrum \n" + 
				"          3. Scrum of scrums \n" + 
				"          4. Scrum master \n" + 
				"          5. Product owner \n" + 
				"          6. Team member \n" + 
				"          7. Story point \n" + 
				"          8. Value \n" + 
				"          9. Estimation \n" + 
				"          10. Sprint Retrospective \n" + 
				"          11. Sprint Review \n" + 
				"          12. Sprint Planning \n" + 
				"          13. Sprint \n" + 
				"          14. I teration \n" + 
				"          15. Epic \n" + 
				"          16. Spike \n" + 
				"          17. Sprint Backlog \n" + 
				"          18. Product Backlog \n" + 
				"          19. Backlog Grooming \n" + 
				"          20. Effort \n" + 
				"          21. Ideal work day \n" + 
				"          22. Simple story \n" + 
				"          23. Compound story \n" + 
				"          24. Unknowns \n" + 
				"          25. Knowns \n" + 
				"          26. Kanban \n" + 
				"          27. eXtreme Programming");
		contentPanel.add(wordList);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
