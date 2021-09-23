package ch15;
//package ch15;

//Test:  Event handling of JRadioButton

import javax.swing.*;
import java.awt.*;

class JRadioButtonFrame extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public JRadioButtonFrame() {
		setTitle("Book information");
		setSize(400, 120);							//Size of frame
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);							//Center display
		JPanel panel = new JRadioButtonPanel();		//Create the panel
		this.add(panel);							//add the panel
		}
	private void centerWindow(JFrame frame) {		//Method for center window
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/3;
		setLocation(centeredWidth, centeredHeight);
	}
}
