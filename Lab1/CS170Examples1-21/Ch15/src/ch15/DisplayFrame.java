package ch15;
//package ch15;
//Demo:  Test of JLabel

import javax.swing.*;
import java.awt.*;

class DisplayFrame extends JFrame {
	public DisplayFrame() {
		setTitle("Display Frame");
		setSize(208,200);							//Frame size
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);							//Display window at center
		JPanel panel = new DisplayLabelPanel();			//create a panel
		this.add(panel);							//Add the panel
		}
	private void centerWindow(JFrame frame) {		//Method for centering window
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
		setLocation(centeredWidth, centeredHeight);
	}
}