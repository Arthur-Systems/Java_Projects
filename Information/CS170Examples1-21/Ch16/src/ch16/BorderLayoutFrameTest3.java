package ch16;
//package ch16;

//Demo:  Test of 5 regions and changes in BorderLayout

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BorderLayoutPanel3 extends JPanel implements ActionListener {
	private JButton[] buttons;
	private BorderLayout layout;
	private int post,
				count;
	public BorderLayoutPanel3() {
		buttons = new JButton[5];				//Create array of buttons
		post = count = 0;						//Initialize to 0
		layout = new BorderLayout(5, 5);
		setLayout(layout);						//set the layout

		for (int i = 0; i < 5; i++)
		  buttons[i] = new JButton("button" + post++);

		add(buttons[0], BorderLayout.NORTH);
		add(buttons[1], BorderLayout.SOUTH);
		add(buttons[2], BorderLayout.WEST);
		add(buttons[3], BorderLayout.EAST);
		add(buttons[4]);

		for (int i = 0; i < 5; i++)
			buttons[i].addActionListener(this);			//Add for event handling
	}
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (count < 4) {			//Still have buttons in display
		 for (int i = 0; i < 5; i++)	//See which button triggered event
		     if (source == buttons[i]) {
		         buttons[i].setVisible(false); //Do not display
		         count++;			  	  //Counter update

			}
		}
	    else {
		  for(JButton button : buttons)
		    button.setVisible(true);
		  count = 0;
		}
	}
}
class BorderLayoutFrame3 extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public BorderLayoutFrame3() {
		setTitle("Five Buttons in BorderLayout");
		setSize(360, 200);							//Size of the frame
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);							//Center the window
		JPanel panel = new BorderLayoutPanel3();	//Create the panel
		this.add(panel);							//Add the panel
		}
	private void centerWindow(JFrame frame) {		//Method to center the window
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
		setLocation(centeredWidth, centeredHeight);
	}
}
public class BorderLayoutFrameTest3 {
	public static void main(String[] args) {
		JFrame frame = new BorderLayoutFrame3();
		frame.setVisible(true);
	}
}

