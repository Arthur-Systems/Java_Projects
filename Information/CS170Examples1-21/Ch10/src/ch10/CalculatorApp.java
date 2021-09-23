package ch10;

//Calculator driver class to compute simple expressions

import javax.swing.*;

public class CalculatorApp {
   public static void main( String args[] ) {
	   Calculator calculator = new Calculator();	//Create object
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			   try {						//Handle exceptions
			           calculator.requestInput();		//request for entry
			           calculator.parseExpression();	//translate expression
			           JOptionPane.showMessageDialog(null, calculator);	//display result
			   	}

				catch (NumberFormatException e) {
					System.out.println("The expression is wrong...\nPlease try again.");
			  	}
			choice = JOptionPane.showInputDialog("Do you want to continue(y/n)? ");
		}
	}
}

