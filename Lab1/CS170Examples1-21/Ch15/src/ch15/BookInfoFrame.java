package ch15;
//package ch15;
//Example:  Use of JCheckBox, other componenets and event handling

import javax.swing.*;
import java.awt.*;

class BookInfoFrame extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public BookInfoFrame() {
		setTitle("Book information");
		setSize(520, 125);							//Size of frame
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);						//Call the method
		JPanel panel = new BookInfoPanel();		//Create and add the panel
		this.add(panel);
		}
	private void centerWindow(JFrame frame) {		//Method to center the window
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/3;
		setLocation(centeredWidth, centeredHeight);
	}
}
