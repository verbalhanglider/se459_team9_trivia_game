package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlayingPage extends JFrame {

	private JPanel contentPane;
	private JTextField words;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the frame.
	 */
	public PlayingPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSkip = new JButton("SKIP");
		btnSkip.setFont(new Font("Lucida Grande", Font.BOLD, 35));
		btnSkip.setBounds(147, 301, 146, 60);
		contentPane.add(btnSkip);
		
		words = new JTextField();
		words.setBounds(69, 71, 299, 205);
		contentPane.add(words);
		words.setColumns(10);
		
		JLabel lblPurple = new JLabel("Purple");
		lblPurple.setHorizontalAlignment(SwingConstants.CENTER);
		lblPurple.setBounds(192, 6, 51, 38);
		contentPane.add(lblPurple);
		
		JLabel lblGreen = new JLabel("Green");
		lblGreen.setHorizontalAlignment(SwingConstants.CENTER);
		lblGreen.setBounds(242, 6, 51, 38);
		contentPane.add(lblGreen);
		
		JLabel lblBlue = new JLabel("Blue");
		lblBlue.setHorizontalAlignment(SwingConstants.CENTER);
		lblBlue.setBounds(294, 6, 51, 38);
		contentPane.add(lblBlue);
		
		JLabel lblYellow = new JLabel("Yellow");
		lblYellow.setHorizontalAlignment(SwingConstants.CENTER);
		lblYellow.setBounds(345, 6, 51, 38);
		contentPane.add(lblYellow);
		
		JButton btnCorrect = new JButton("Correct");
		btnCorrect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCorrect.setBounds(69, 301, 66, 60);
		contentPane.add(btnCorrect);
		
		JButton btnWrong = new JButton("Wrong");
		btnWrong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnWrong.setBounds(302, 301, 66, 60);
		contentPane.add(btnWrong);
	}
}
