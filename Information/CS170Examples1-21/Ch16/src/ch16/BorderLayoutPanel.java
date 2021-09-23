package ch16;
//package ch16;

//Demo:  5 regions in BorderLayout

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class BorderLayoutPanel extends JPanel {
	private JButton[] buttons;			//Declare array of buttons
	private BorderLayout layout;		//Declare object of BorderLayout
	private int post;					//Used for naming the button
	public BorderLayoutPanel() {
		buttons = new JButton[5];		//Create 5 elements of buttons
		post = 0;						//Initialize
		layout = new BorderLayout(5, 5); //Create the object with 5 pixel space
		setLayout(layout);				//Add layout manager
		for (int i = 0; i < 5; i++)		//Create buttons
		  buttons[i] = new JButton("button" + post++);	//button0 to button4
		add(buttons[0], BorderLayout.NORTH);   //Add each button to the specified region
		add(buttons[1], BorderLayout.SOUTH);
		add(buttons[2], BorderLayout.WEST);
		add(buttons[3], BorderLayout.EAST);
		add(buttons[4]);				//Default is CENTER
	}
}


