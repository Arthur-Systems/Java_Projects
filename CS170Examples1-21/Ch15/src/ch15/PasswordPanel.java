package ch15;
//package ch15;

//Example:  Use of JLabel, JPasswordField, JTextField, JButton and event handling

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PasswordPanel extends JPanel implements ActionListener{
	private JPasswordField passwordField;		//Declare a password text field
	private JButton okButton, exitButton;
	public PasswordPanel() {				//Constructor
	   setLayout(new FlowLayout(FlowLayout.RIGHT));
	   add(new JLabel("Enter your password:"));	//Create and add label
	   //Create password field of length(columns) 10
	   passwordField = new JPasswordField(10);
	   add(passwordField);			//Add the password field to the panel
	   okButton = new JButton("Ok");		//Create two buttons
	   exitButton = new JButton("Exit");
	   add(okButton);				//Add Ok button to the panel
	   okButton.addActionListener(this);	//Add Ok button for event handling
	   add(exitButton); 			//Add exit button to the panel
	   exitButton.addActionListener(this);	//Add exit button for event handling
	}
	public void actionPerformed(ActionEvent e) {	//Implement event handling
	   Object source = e.getSource();		//Get the source of the event
	   if (source == okButton) {	//If okButton triggered the event
	       String password = new String(passwordField.getPassword());
	       if (password.equals("abc123")) {//If password is correct
	          this.setVisible(false);	//Remove password display
	          JFrame frame = new ProductCalculatorFrame();
	          frame.setVisible(true);	//Display window
			}
			else {
					JOptionPane.showMessageDialog(null, "Entry error!\nPlease check password and try again...");
					System.exit(0);
				}
			}
			else if (source == exitButton) {			//Event from exit button
				JOptionPane.showMessageDialog(null, "Good bye!\nPress È·¶¨ to close window...");
				System.exit(1);							//Stop
			}
		}
}