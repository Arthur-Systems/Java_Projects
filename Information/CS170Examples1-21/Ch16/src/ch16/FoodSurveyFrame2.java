package ch16;
//package ch16;
//Application:  Use of L&F, GridBagLayout, JLabel, JCheckBox, JRadioButton, JTextArea and event handling
//to take a survey of opinions on various foods.
import javax.swing.*;
import java.awt.*;

class FoodSurveyFrame2 extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public FoodSurveyFrame2() {
		setTitle("Fast Food Survey");
		setSize(545, 250);							//Size of the frame
		//setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);							//Cengter dispaly
		JPanel panel = new FoodSurveyPanel2();		//Create the panel
		this.add(panel);							//Add the panel
		}
	private void centerWindow(JFrame frame) {		//Method for cengter display
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/3;
		setLocation(centeredWidth, centeredHeight);
	}
}
