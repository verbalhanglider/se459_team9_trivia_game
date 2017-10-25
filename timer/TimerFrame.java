package game;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.text.NumberFormat;

public class TimerFrame extends JFrame {
    long remaining; // How many milliseconds remain in the countdown.
    long lastUpdate; // When count was last updated
    int startMin = 2;
    int startSec = 0;
    JLabel label; // Displays the count
    private JPanel contentPane;
    NumberFormat format;
    public static boolean working;
    private void display(){
        setTitle("Timer");
        setBounds(100, 100, 450, 300);
        setLayout(new GridLayout(0, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new TimerButton("Start timer", 3 * 1000));
        pack();
        setVisible(true);
    }

    private void startTime() {
        label.setText(format.format(startMin) + ":" + format.format(startSec));
    }

    private void updateTime() {
        long now = System.currentTimeMillis(); // current time in ms
        long elapsed = now - lastUpdate; // ms elapsed since last update
        remaining -= elapsed; // adjust remaining time
        lastUpdate = now; // remember this update time

        // Convert remaining milliseconds to mm:ss format and display
        if (remaining < 0) remaining = 0;

        int minutes = (int) (remaining / 60000);
        int seconds = (int) ((remaining) / 1000);
        label.setText(format.format(minutes) + ":" + format.format(seconds));
    }

    private class TimerButton extends JButton {

        private final Timer timer;

        public TimerButton(String text, int delay) {
            super(text);
            label = new JLabel();
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setOpaque(true); // So label draws the background color
            getContentPane().add(label, BorderLayout.CENTER);
            format = NumberFormat.getNumberInstance();
            format.setMinimumIntegerDigits(2); // pad with 0 if necessary
            this.addActionListener(new StartListener());
            timer = new Timer(delay, new StopListener());
        }

        private class StartListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                TimerFrame.this.setVisible(true);
                startTime();
                timer.start();


            }
        }

        private class StopListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                timer.stop();
                working = false;
                TimerFrame.this.setVisible(true);
                label.setText("Times up!");
            }
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                TimerFrame timerframe = new TimerFrame();
                timerframe.display();
                timerframe.updateTime();
            }
        });
    }
}
