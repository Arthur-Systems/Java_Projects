package ch16;
//package ch16;
//Example:  Use of JLabel, JCheckBox, JRadioButton, JTextArea and event handling
//to take a survey of opinions on various foods.
import javax.swing.*;
import java.awt.*;

class FoodSurveyFrame extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public FoodSurveyFrame() {
		setTitle("Food Survey");
		setSize(400, 220);							//Size of frame
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);						//Center display
		JPanel panel = new FoodSurveyPanel();		//Create panel
		this.add(panel);							//Add the panel
		}
	private void centerWindow(JFrame frame) {		//Method of center display
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/3;
		setLocation(centeredWidth, centeredHeight);
	}
}
