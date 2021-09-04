package ch15;

//Demo: Create labels in panel

import javax.swing.*;

class DisplayPanel extends JPanel {	//Code the panel to display labels private JLabel productLabel, quantityLabel, totalLabel;
	
	private JLabel productLabel, quantityLabel, totalLabel;

	public DisplayPanel() {	//Constructor

	
		productLabel = new JLabel("Enter product name:");	//Create 3 labels 
		totalLabel = new JLabel("Total amount:");
		quantityLabel = new JLabel("Enter quantity:");
	
		this.add(productLabel);	//Add labels 
		this.add(quantityLabel);
		this.add(totalLabel);
	}
}
