package ch15;
//package ch15;

//Demo:  creating text fields

import javax.swing.*;
import java.awt.*;

class DisplayPanel2 extends JPanel {  //Code the panel to display the text fields
	private JTextField productField, quantityField, totalField;
	public DisplayPanel2() {				//Constructor
	   setLayout(new FlowLayout(FlowLayout.RIGHT));	//Right alignment

	   //Create a text field with 18 columns and add it to the panel
	   productField = new JTextField(18);
	   add(productField);

	   //Create a text field with 15 columns and add it to the panel
	   quantityField = new JTextField(15);
	   add(quantityField);

	   //Create a non-editable (display-only) text field with 10 columns containing
	   //the associated displayed text and add it to the panel
	   totalField = new JTextField("$0.00", 10);
	   totalField.setEditable(false);
	   add(totalField);

	}
}
class DisplayFrame2 extends JFrame {
	public DisplayFrame2() {
		setTitle("Display Frame");
		setSize(220,160);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);							//Center window
		JPanel panel = new DisplayPanel2();			//Create panel
		this.add(panel);							//Add the panel
		}
	private void centerWindow(JFrame frame) {		//Cneter window method
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
		setLocation(centeredWidth, centeredHeight);
	}
}
public class DisplayFrame2Test {
	public static void main(String[] args) {
		JFrame frame = new DisplayFrame2();
		frame.setVisible(true);
	}
}