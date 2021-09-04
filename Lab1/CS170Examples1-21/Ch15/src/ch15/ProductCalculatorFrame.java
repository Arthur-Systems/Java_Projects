package ch15;
//package ch15;

//Example:  Use of JLabel, JTextField,JButton and event handling to calculate product total

import javax.swing.*;
import java.awt.*;

class ProductCalculatorFrame extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public ProductCalculatorFrame() {
		setTitle("Product Calculator");
		setSize(280, 200);							//Size of frame
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);							//Center display
		JPanel panel = new ProductCalculatorPanel();//Create panel
		this.add(panel);							//Add the panel
		}
	private void centerWindow(JFrame frame) {
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
		setLocation(centeredWidth, centeredHeight);
	}
}