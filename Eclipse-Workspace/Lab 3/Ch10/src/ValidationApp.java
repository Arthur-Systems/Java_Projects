//Demo: use of Validator as a utility in exception handling 

import javax.swing.JOptionPane;

public class ValidationApp {

	public static void main(String[] args) {

		String choice = "y";
		double data = 0.0;
		
		while (choice.equalsIgnoreCase("y")) {
		
			data = Validator.verifyIntegerNotNegative("Please enter your data: ");
			JOptionPane.showMessageDialog(null, "Data is verified: " + data);
			
			choice = Validator.verifyYN("Contiune (y/n)? ");
		}	//end of while loop
		
		JOptionPane.showMessageDialog(null, "Thank you and good bye!");
	}   //end of main()

}		//end of the class
