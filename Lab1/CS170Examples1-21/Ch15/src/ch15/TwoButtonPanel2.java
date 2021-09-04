package ch15;

//Demo:  Two buttons with event handling

import javax.swing.*;
import java.awt.event.*;

class TwoButtonPanel2 extends JPanel implements ActionListener{  //Create a panel
	private JButton okButton, exitButton;		//Declare
	public TwoButtonPanel2() {					//Constructor
		okButton = new JButton("Ok");			//Create objects
		exitButton = new JButton("Exit");
		this.add(okButton);						//Add to the panel
		this.add(exitButton);
		okButton.addActionListener(this);			//Add to event handling
		exitButton.addActionListener(this);			
	}
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == okButton) {
 			JOptionPane.showMessageDialog(null, "Ok button is pressed...");
		}
		else if (source == exitButton) {
			JOptionPane.showMessageDialog(null, "Good bye!\nPress È·¶¨ to close window...");
			System.exit(0);
		}
	}
}
