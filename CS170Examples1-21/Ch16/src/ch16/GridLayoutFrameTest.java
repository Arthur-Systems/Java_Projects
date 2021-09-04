package ch16;
//package ch16;

//Demo:  Test of components in 3 rows and 2 columns in GridLayout

import javax.swing.*;
import java.awt.*;

class GridLayoutPanel extends JPanel {
	public GridLayoutPanel() {
		setLayout(new GridLayout(3, 2));			 //GridLayout
		add(new JLabel("Label"));
		add(new JTextField("Text Field"));
		add(new JButton("Button"));
		add(new JCheckBox("Check Box"));
		add(new JTextArea("Text Area"));
	}
}
class GridLayoutFrame extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public GridLayoutFrame() {
		setTitle("Components in Y-Axis in BoxLayout");
		setSize(300, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);
		JPanel panel = new GridLayoutPanel();
		this.add(panel);
		}
	private void centerWindow(JFrame frame) {
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
		setLocation(centeredWidth, centeredHeight);
	}
}
public class GridLayoutFrameTest {
	public static void main(String[] args) {
		JFrame frame = new GridLayoutFrame();
		frame.setVisible(true);
	}
}