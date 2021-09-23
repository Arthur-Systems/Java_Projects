package ch15;
//package ch15;

//Test:  Event handling of JRadioButton

import javax.swing.*;
import java.awt.event.*;

class JRadioButtonPanel extends JPanel implements ActionListener{
	private JLabel entryLabel;
	private JRadioButton check, creditCard, debitCard;
	private JButton okButton;
	public JRadioButtonPanel() {						//The constructor
		entryLabel = new JLabel("Enter your payment type:");
		add(entryLabel);
		check =  new JRadioButton("Check", true);			//Create radio buttons
		creditCard = new JRadioButton("Credit Card");
		debitCard = new JRadioButton("Debit Card");
		add(check);											//Add radion buttons
		add(creditCard);
		add(debitCard);
		ButtonGroup paymentGroup = new ButtonGroup();	//Create button group
		paymentGroup.add(check);						//Add each button
		paymentGroup.add(creditCard);
		paymentGroup.add(debitCard);
		check.addActionListener(this);					//Add for event handling
		creditCard.addActionListener(this);
		debitCard.addActionListener(this);
		okButton = new JButton("Ok");
		add(okButton);;
		okButton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {  	//Implement the event handling
		Object source = e.getSource();				//Get the source of the event
		if (source == okButton) {
	      //If OK triggered event and if radio button is selected, display information
		    if (check.isSelected())
		        JOptionPane.showMessageDialog(null, "Check is selected...");
		    else if (creditCard.isSelected())
		              JOptionPane.showMessageDialog(null, "Credit card is selected...");
		    else if (debitCard.isSelected())
				JOptionPane.showMessageDialog(null, "Debit card is selected...");
		}
		if (source == check)		//If the event source is the radio button
		    JOptionPane.showMessageDialog(null, "check triggered the event...");
		if (source == creditCard)		//And if the event is triggered by creditCard
		    JOptionPane.showMessageDialog(null, "creditCard triggered the event...");
		if (source == debitCard)			//If the event is triggered by debitCard
		    JOptionPane.showMessageDialog(null, "debitCard triggered the event...");
	}
}


