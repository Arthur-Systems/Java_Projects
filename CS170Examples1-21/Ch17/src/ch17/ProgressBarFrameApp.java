package ch17;
//package ch17;

//Use of JProgressBar

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ProgressBarFrame extends JFrame implements ActionListener {
    private static int DELAY = 100;

    JProgressBar progressBar;
    int minimum, maximum;
	JPanel panel;
    JButton startButton, cancelButton;

    ProgressBarFrame() {
		super("Progress Bar Demo");
		progressBar = new JProgressBar(0, 100);
		progressBar.setStringPainted(true);
		add(progressBar, BorderLayout.NORTH);

		minimum = progressBar.getMinimum();
		maximum = progressBar.getMaximum();

		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		startButton = new JButton("Start");
		panel.add(startButton);
		cancelButton = new JButton("Cancel");
		panel.add(cancelButton);

		add(panel, BorderLayout.SOUTH);
		startButton.addActionListener(this);
		cancelButton.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
	       Object source = e.getSource();
	       if (source == cancelButton)
	       	 System.exit(0);
	       else if (source == startButton)
	         new Thread(new BarThread()).start(); //Start the thread
    }

 	class BarThread implements Runnable{
         public void run(){
             for (int i=minimum; i<=maximum; i++){ //Progressively increment variable i
                 progressBar.setValue(i); //Set value
                 progressBar.repaint(); //Refresh graphics
                 try{Thread.sleep(DELAY);} //Sleep 50 milliseconds
                 catch (InterruptedException err){}
             }
         }
     }
}
public class ProgressBarFrameApp {
  public static void main(String args[]) {
    JFrame frame = new ProgressBarFrame();
    frame.setSize(300, 120);
    frame.setVisible(true);
  }
}

