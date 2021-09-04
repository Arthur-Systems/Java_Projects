package ch16;
//package ch16;
//Demo:  Use of FlowLayout

import java.awt.*;
import javax.swing.*;

class TwoButtonsPanel extends JPanel {
   public TwoButtonsPanel() {
   	//Create the object with RIGHT alignment
	 FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT);
	 setLayout(flowLayout);			//Add the object for the management
	 add(new JButton("Button One"));		//Create two buttons
     add(new JButton("Button Two"));
   }
}
class TwoButtonsFrame extends JFrame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public TwoButtonsFrame() {
		setTitle("Use of FlowLayout");
		setSize(300, 120);							//Size of frame
		//setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);							//Center display
		JPanel panel = new TwoButtonsPanel();		//Create the panel
		this.add(panel);							//Add the panel
		}
	private void centerWindow(JFrame frame) {		//Center display mehtod
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/3;
		setLocation(centeredWidth, centeredHeight);
	}
}
public class TwoButtonsFrameTest {
	public static void main(String[] args) {
		JFrame frame = new TwoButtonsFrame();
		frame.setVisible(true);
	}
}
