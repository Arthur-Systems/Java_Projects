package ch17;
//package ch17;

//Application:  Use of Border, GridBagLayout, JList, JLabel, JTextField, JTextArea and event handling
//to show common use OOP terms.

import javax.swing.*;
import java.awt.*;

class OOPListFrame extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public OOPListFrame() {
		setTitle("OOP Terminology");
		setSize(530, 250);
		//setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);
		JPanel panel = new OOPListPanel();
		this.add(panel);
		}
	private void centerWindow(JFrame frame) {
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/3;
		setLocation(centeredWidth, centeredHeight);
	}
}
