package se459Team9.triviaGame;


import javax.swing.JLabel;
import javax.swing.JTextField;

public class ScoreInfo {
	private JTextField box;
	private String TeamName;
	private JLabel label;
	
	public ScoreInfo(JTextField _box, String _TeamName) {
		box = _box;
		TeamName = _TeamName;
	}
	
	public ScoreInfo() {
		
	}
	
	public void setJTextField(JTextField _box) {
		box = _box;
	}
	
	public void setTeamName(String _TeamName) {
		TeamName = _TeamName;
	}
	
	public JTextField getJTextField() {
		return box;
	}
	
	public String getTeamName() {
		return TeamName;
	}
	
	public void setLabel(JLabel _label) {
		label = _label;
	}
	
	public JLabel getLabel() {
		return label;
	}
}
