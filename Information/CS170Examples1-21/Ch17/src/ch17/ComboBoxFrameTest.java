package ch17;

//Demo:  Test of JComboBox

import javax.swing.*;
import java.awt.*;

class ComboBoxFrame extends JFrame {
		String[] books = {"Programming Arts in Java", "All C/C++ Programming", "JSP and Servlets"};
	public ComboBoxFrame() {
		JComboBox bookComboBox = new JComboBox(books);	//Create a combobox
		add(bookComboBox);								//Add the combobox

		setTitle("JComboBox Test");
		setSize(250,100);							//Display frame size
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);							//Center display
	}
	private void centerWindow(JFrame frame) {		//Method for center display
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;
		setLocation(centeredWidth, centeredHeight);
	}
}
public class ComboBoxFrameTest {					//Driver code
	public static void main(String[] args) {
		JFrame frame = new ComboBoxFrame();
		frame.setVisible(true);
	}
}

