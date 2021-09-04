package ch15;
//package ch15;
//Demo: A button frame
import javax.swing.*;
import java.awt.*;

class ButtonFrame extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public ButtonFrame() {
		setTitle("Example Button Frame");
		setSize(d.width/2, d.height/2);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);					//Call central display method
		JPanel panel = new ButtonPanel();	//Create object of the panel
		this.add(panel);					//Add the panel to window

		}
	private void centerWindow(JFrame frame) {		//Programmer-definded method to centering a window open
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;	//Compute center width
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/2;	//Compute ceenter height
		setLocation(centeredWidth, centeredHeight);						//call method in JFrame
	}
}