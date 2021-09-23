package ch15;
//package ch15;
//Demo: Create a button in a panel
import javax.swing.*;

class ButtonPanel extends JPanel {		//Button panel
	private JButton myButton;			//Declare a button

	public ButtonPanel() {				//Constructor
	   myButton = new JButton("My button");	//Create a button, or code as:
	   this.add(myButton);				//add(myButton); add button
	}
}
