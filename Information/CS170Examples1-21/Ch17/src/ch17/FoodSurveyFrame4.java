package ch17;
//package ch17;

//to take a survey of opinions on various foods.
import javax.swing.*;
import java.awt.*;

class FoodSurveyFrame4 extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public FoodSurveyFrame4() {
		setTitle("Food Survey");
		setSize(580, 280);							//Frame size
		//setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);
		JPanel panel = new FoodSurveyPanel4();
		this.add(panel);
		}
	private void centerWindow(JFrame frame) {
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/3;
		setLocation(centeredWidth, centeredHeight);
	}
}
