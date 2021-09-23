package ch15;
//package ch15;
//Example:  Use of JTextArea, JScrollPane and event handling
//Copy the content of the text area to output window of the JOptionPane

import javax.swing.*;
import java.awt.*;

class TextAreaFrame extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public TextAreaFrame() {
		setTitle("TextArea Test");
		setSize(280, 200);							//Size of the frame
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);						//Center display
		JPanel panel = new TextAreaPanel();		//Call method
		this.add(panel);						//Add the panel
		}
	private void centerWindow(JFrame frame) {		//Method
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/3;
		setLocation(centeredWidth, centeredHeight);
	}
}
