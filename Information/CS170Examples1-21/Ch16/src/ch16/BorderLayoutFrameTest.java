package ch16;
//package ch16;

//Driver to test BorderLayout Panel

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

class BorderLayoutFrame extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public BorderLayoutFrame() {
		setTitle("Five Buttons in BorderLayout");
		setSize(350, 250);							//Size of frame
		//setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);							//Center display
		JPanel panel = new BorderLayoutPanel();		//Create the panel
		this.add(panel);							//Add the panel
		}
	private void centerWindow(JFrame frame) {		//Method for centering window
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
		setLocation(centeredWidth, centeredHeight);
	}
}
class BorderLayoutFrameTest {
	public static void main(String[] args) {
		JFrame frame = new BorderLayoutFrame();
		frame.setVisible(true);
	}
}