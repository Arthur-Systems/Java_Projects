package ch16;
//package ch16;

//Demo:  Test of nested GridLayout with BorderLayout

import javax.swing.*;
import java.awt.*;

class GridLayoutFrame2 extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public GridLayoutFrame2() {
		JPanel componentPanel1 = new JPanel();
		GridLayout gridLayout = new GridLayout(1, 2);
		componentPanel1.setLayout(gridLayout);
		componentPanel1.add(new JLabel("Label"));
		componentPanel1.add(new JTextField("Text Field"));

		JPanel componentPanel2 = new JPanel();
		componentPanel2.setLayout(gridLayout);
		componentPanel2.add(new JCheckBox("Check Box"));
		componentPanel2.add(new JButton("Button"));

		add(componentPanel1, BorderLayout.NORTH);
		add(componentPanel2, BorderLayout.SOUTH);

		//Container contentPane = getContentPane();
		//contentPane.add(componentPanel1, BorderLayout.NORTH);
		//contentPane.add(componentPanel2, BorderLayout.SOUTH);

		setTitle("Components in nested Layouts");
		setSize(400, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);
		}
	private void centerWindow(JFrame frame) {
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
		setLocation(centeredWidth, centeredHeight);
	}
}
public class GridLayoutFrameTest2 {
	public static void main(String[] args) {
		JFrame frame = new GridLayoutFrame2();
		frame.setVisible(true);
	}
}