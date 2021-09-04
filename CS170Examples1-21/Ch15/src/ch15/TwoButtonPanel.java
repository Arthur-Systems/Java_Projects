package ch15;
//package ch15;
//Demo: two buttons in a panel
import javax.swing.*;

class TwoButtonPanel extends JPanel {		//Button panel
	private JButton okButton,
					exitButton;			//Declare button
	public TwoButtonPanel() {				//Constructor
	   okButton = new JButton("OK");	//Create two buttons, or code as:
	   this.add(okButton);				//add(myButton); add button

	   exitButton = new JButton("Exit");
	   this.add(exitButton);
	}
}
