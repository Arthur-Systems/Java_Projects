package ch16;
//package ch16;

//Demo:  Test of components in Y_Axis in BoxLayout

import javax.swing.*;
import java.awt.*;

class BoxLayoutPanel2 extends JPanel {
	BoxLayout boxLayout;
	public BoxLayoutPanel2() {
		boxLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
		setLayout(boxLayout);
		add(new JLabel("Label"));
		add(new JTextField("Text Field"));
		add(new JButton("Button"));
		add(new JCheckBox("Check Box"));
	}
}
class BoxLayoutFrame2 extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public BoxLayoutFrame2() {
		setTitle("Components in Y-Axis in BoxLayout");
		setSize(420, 140);							// Frame size
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);							//Center display
		JPanel panel = new BoxLayoutPanel();		//Create the panel
		this.add(panel);							//Add the panel
		}
	private void centerWindow(JFrame frame) {		//Method for center display
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
		setLocation(centeredWidth, centeredHeight);
	}
}
public class BoxLayoutFrameTest2 {
	public static void main(String[] args) {
		JFrame frame = new BoxLayoutFrame();
		frame.setVisible(true);
	}
}