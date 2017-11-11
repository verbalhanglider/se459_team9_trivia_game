package se459Team9.triviaGame;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;



import java.awt.Color;
import javax.swing.JTextField;

public class WinPage extends JFrame {

	private JPanel contentPane;
	static WinPage frame;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	}
	public Color getColor(String color) {
		if(color == "Purple Team") {
			return new Color(102, 0, 102);
		}
		if(color == "Green Team") {
			return new Color(52, 143, 55);
		}
		if(color == "Blue Team") {
			return new Color(45, 151, 222);
		}
		else {
			//yellow
			return new Color(253, 219, 97);
		}
	}

	/**
	 * Create the frame.
	 */
	public WinPage(ArrayList<Team> teamList) {
		Collections.reverse(teamList);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	

		JButton btnPlayAgain = new JButton("Play again!");
		btnPlayAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameSettingPage gameSetting = new GameSettingPage();
				gameSetting.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnPlayAgain.setBounds(77, 305, 270, 29);
		contentPane.add(btnPlayAgain);
		
		for(int i = 0; i < teamList.size(); i ++) {
			if(i == 0 ) {
				JLabel currentPlace = new JLabel("The winner is " + teamList.get(i).getName() + " with " + teamList.get(i).getPoint() + " points.");
				currentPlace.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				currentPlace.setForeground(this.getColor(teamList.get(i).getName()));
				currentPlace.setHorizontalAlignment(SwingConstants.LEFT);
				currentPlace.setBounds(50, 50, 400, 100);
				contentPane.add(currentPlace);
			}
			if(i == 1) {
				JLabel currentPlace = new JLabel("In second place is " + teamList.get(i).getName() + " with " + teamList.get(i).getPoint() + " points.");
				currentPlace.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				currentPlace.setForeground(this.getColor(teamList.get(i).getName()));
				currentPlace.setHorizontalAlignment(SwingConstants.LEFT);
				currentPlace.setBounds(50, 105, 400, 100);
				contentPane.add(currentPlace);
			}
			if(i == 2) {
				JLabel currentPlace = new JLabel("In third place is " + teamList.get(i).getName() + " with " + teamList.get(i).getPoint() + " points.");
				currentPlace.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				currentPlace.setForeground(this.getColor(teamList.get(i).getName()));
				currentPlace.setHorizontalAlignment(SwingConstants.LEFT);
				currentPlace.setBounds(50, 160, 400, 100);
				contentPane.add(currentPlace);
			}
			if(i == 3) {
				JLabel currentPlace = new JLabel("In dead last is " + teamList.get(i).getName() + " with " + teamList.get(i).getPoint() + " points.");
				currentPlace.setFont(new Font("Lucida Grande", Font.BOLD, 14));
				currentPlace.setForeground(this.getColor(teamList.get(i).getName()));
				currentPlace.setHorizontalAlignment(SwingConstants.LEFT);
				currentPlace.setBounds(50, 215, 400, 100);
				contentPane.add(currentPlace);
			}
		}
	}
}
