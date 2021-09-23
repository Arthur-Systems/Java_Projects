package ch16;
//package ch16;
//Example: Use of JLabel, JPasswordField, JTextField, JButton and event handling

import javax.swing.*;
import java.awt.*;

class PasswordFrame extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public PasswordFrame() {
		setTitle("Password Frame");
		setSize(280, 150);						//Size of frame
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);						//Center display
		JPanel panel = new PasswordPanel();		//Create the panel
		this.add(panel);						//Add the panel
		}
	private void centerWindow(JFrame frame) {	//Method to center the window display
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
		setLocation(centeredWidth, centeredHeight);
	}
}