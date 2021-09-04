package ch15;
//package ch15;

//Example:  Use of JLabel, JTextField,JButton and event handling to calculate product total

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

class ProductCalculatorPanel extends JPanel implements ActionListener{
	private final double CD_PRICE = 2.99,
					     DVD_PRICE = 19.89;
	private JTextField productField, quantityField, totalField;
	private JButton okButton, exitButton;
	public ProductCalculatorPanel() {						//The panel
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(new JLabel("Enter product name:"));
		productField = new JTextField("CD or DVD", 10);
		add(productField);
		add(new JLabel("Enter the quantity:"));
		quantityField = new JTextField(10);
		add(quantityField);
		add(new JLabel("The total amount:"));
		totalField = new JTextField("$0.00", 10);
		totalField.setEditable(false);
		add(totalField);
		okButton = new JButton("Ok");				//Create buttons
		exitButton = new JButton("Exit");
		add(okButton);								//Add the buttons
		add(exitButton);
		okButton.addActionListener(this);			//Add for event handling
		exitButton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {	//Event handling
		Object source = e.getSource();				//Get the source of the event
			if (source == okButton) {				//If event source is Ok button
			   if (productField.getText().equals("CD")) {	//Get the product name
			       int quantity = Integer.parseInt(quantityField.getText());	 // Get number
				double total = CD_PRICE * quantity;	//Compute and display total
				totalField.setText(NumberFormat.getCurrencyInstance().format(total));
			   }
			   else if (productField.getText().equals("DVD")) {	//Get product name
				    int quantity = Integer.parseInt(quantityField.getText());
				    double total = DVD_PRICE * quantity;
				    totalField.setText(NumberFormat.getCurrencyInstance().format(total));
			   }
			   else {						//Wrong product name
			         JOptionPane.showMessageDialog(null, "Entry error!\n"
					+ "Please check product name and try again...");
				   System.exit(0);	 		//Stop execution
				}
			}
			else if (source == exitButton) {		//If event source is exitButton
				         JOptionPane.showMessageDialog(null, "Goodbye!\nPress OK to close window...");
				         System.exit(1);			//Stop execution

			}
		}
}