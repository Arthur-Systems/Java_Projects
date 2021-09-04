package ch16;
//package ch16;
//Demo:  Two buttons panel

import javax.swing.*;
import java.awt.*;

class ButtonsPanel extends JPanel {				//Panel to create buttons
	private JButton okButton, exitButton;		//Declare buttons
	public ButtonsPanel() {						//Constructor
		okButton = new JButton("Ok");			//Create buttons
		exitButton = new JButton("Exit");
		this.add(okButton);						//Add buttons to display
		this.add(exitButton);
	}
}