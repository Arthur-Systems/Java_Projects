package ch10;

//StringBuilderFormatter driver class to format a string
//String input format as: Changling Wang9991236578

import javax.swing.*;

public class StringBuilderFormatterApp {
   public static void main( String args[] ) {

	   String choice = "y";

	   while (choice.equalsIgnoreCase("y")) {
		    String message = JOptionPane.showInputDialog("Please enter your string want to be formatted: ");
		    StringBuilderFormatter format = new StringBuilderFormatter();
		    StringBuilder str = format.formatter(message);

		    JOptionPane.showMessageDialog(null, str);

	   		choice = JOptionPane.showInputDialog("Do you want to continue(y/n)? ");
		}
	}
}

