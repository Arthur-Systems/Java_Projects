package ch15;

//Demo:  Display the panel

import javax.swing.*;
import java.awt.*;

class DisplayLabelPanel extends JPanel {			//Code panel to display
	public DisplayLabelPanel() {					//Constructor
	   setLayout(new FlowLayout(FlowLayout.RIGHT));	//Display on right side
	   add(new JLabel("Enter product name:"));		//Create 3 unnamed labels
	   add(new JLabel("Enter the quantity:"));
	   add(new JLabel("The total amount:"));
	}
}

