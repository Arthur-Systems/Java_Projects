package ch16;
//package ch16;

//Demo:  Test of the borders

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class BorderDemoFrame extends JFrame {
	private JPanel borderDemoPanel, buttonPanel;
	private JRadioButton likeRadioButton,
		   			     dislikeRadioButton,
		   				 dontKnowRadioButton;
	private ButtonGroup buttonGroup;
	private JButton addButton, exitButton;
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public BorderDemoFrame() {
		setLayout(new BorderLayout());		//Create border layout

	   borderDemoPanel = new JPanel();
	   borderDemoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	   likeRadioButton = new JRadioButton("Like", true);
	   dislikeRadioButton = new JRadioButton("Dislike");
	   dontKnowRadioButton = new JRadioButton("Don't know");

		borderDemoPanel.add(likeRadioButton);
		borderDemoPanel.add(dislikeRadioButton);
		borderDemoPanel.add(dontKnowRadioButton);
		buttonGroup = new ButtonGroup();
		buttonGroup.add(likeRadioButton);
		buttonGroup.add(dislikeRadioButton);
		buttonGroup.add(dontKnowRadioButton);

		Border selectBorder = BorderFactory.createBevelBorder(BevelBorder.RAISED);
		selectBorder = BorderFactory.createTitledBorder(selectBorder, "Select your favored:");
		borderDemoPanel.setBorder(selectBorder);

		add(borderDemoPanel, BorderLayout.NORTH);	//Display at the top


		buttonPanel = new JPanel();
	    borderDemoPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
	    addButton = new JButton("OK");
	    buttonPanel.add(addButton);
	    exitButton = new JButton("Exit");

        buttonPanel.add(exitButton);
        add(buttonPanel, BorderLayout.SOUTH);

		setTitle("Demo of Border");
		setSize(250, 180);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		}
}
public class BorderDemoFrameTest {
	public static void main(String[] args) {
		JFrame frame = new BorderDemoFrame();
		frame.setVisible(true);
	}
}

