package ch17;
//package ch17;

//Application:  Use of Border, GridBagLayout, JComoBox, JLabel, JTextField, JTextArea and event handling
//to show common use OOP terms.

import javax.swing.*;
import java.awt.*;

class OOPFrame extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public OOPFrame() {
		setTitle("OOP Terminology");
		setSize(530, 250);						//Frame size
		//setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);						//Center display
		JPanel panel = new OOPPanel();			//Create the panel
		this.add(panel);						//Add the panel
		}
	private void centerWindow(JFrame frame) {		//Method for center display
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/3;
		setLocation(centeredWidth, centeredHeight);
	}
}
