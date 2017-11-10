package timer;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.Timer;
import java.util.TimerTask;
import java.text.NumberFormat;

public class TimerFrame extends JFrame {
	int startMin = 2;
	int startSec = 0;
	private final int MINSECONDS = 0;
	private JPanel contentPane;
	JLabel timerlabel = new JLabel();
	NumberFormat format;
	
	private Timer timer = new Timer();

	public TimerFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		setTitle("TIMER");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		format = NumberFormat.getNumberInstance();
        format.setMinimumIntegerDigits(2); 
		
		timerlabel.setFont(new Font("Lucida Grande", Font.BOLD, 40));
		timerlabel.setHorizontalAlignment(SwingConstants.CENTER);
		timerlabel.setBounds(25, 6, 406, 45);
		contentPane.add(timerlabel);
		
		JButton startTimer = new JButton("Start timer");
		startTimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TimerTask task;
				timerlabel.setText(format.format(startMin) + ":" + format.format(startSec));
		    	
		    	task = new TimerTask() {
		    		
		    		public void run() {
		    			if (startSec > MINSECONDS) {
		    				startSec = startSec - 1;
		    		        timerlabel.setText(format.format(startMin) + ":" + format.format(startSec));
		    		        System.out.println(startSec);
		    			}
		    			else if (startSec == MINSECONDS) {
		    				if (startMin == 0) {
		    					timerlabel.setText("Times up!");
			    				timer.cancel();
		    				}
		    				else {
		    					startMin = startMin - 1;
		    					startSec = 60;
		    				}
		    				
		    			}
		    		}
		    	};
		    	timer.schedule(task, 0, 1000);
			}
		});
		
		startTimer.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		startTimer.setBounds(127, 310, 205, 42);
		contentPane.add(startTimer);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimerFrame timerframe = new TimerFrame();
					timerframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    }
}
