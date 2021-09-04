package ch17;
//package ch17;

//Demo:  Test of JList

import javax.swing.*;
import java.awt.*;

class JListFrame extends JFrame {
		String[] foods = {"Pizza", "Hamburger", "French Fries", "KFC", "Salad"};
		JList foodList;
		JPanel foodPanel;
	public JListFrame() {
		foodPanel = new JPanel();
		foodList = new JList(foods);					//Create a list
		foodList.setFixedCellWidth(200);
		foodList.setVisibleRowCount(4);
		foodList.setSelectedIndex(0);
		foodList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		foodPanel.add(new JScrollPane(foodList));
		add(foodPanel);

		setTitle("JList Test");
		setSize(250,140);							//Size of the frame
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
public class ListFrameTest {
	public static void main(String[] args) {
		JFrame frame = new JListFrame();
		frame.setVisible(true);
	}
}
