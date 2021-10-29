//Demo: Validator class using JOptionPane and custom-designed exception classes 
//Utility class to verify input data as exception handling

import javax.swing.JOptionPane;

public class Validator {
	
	public static int verifyIntegerNotNegative(String prompt) {
		boolean isValid = false;
		int data = 0;
		String strData = null;

		while(!isValid) {
			  try {
		 		strData = JOptionPane.showInputDialog(prompt);
		 		data = Integer.parseInt(strData);     //automatically throw NumberFormatException

				if (data < 0) 				//less than 0
						throw new NegativeIntException("Data is negtive");		//Throw the exception
				isValid = true;   //otherwise data is correct
			  }		//End of try
			catch (NegativeIntException e) {  //List catches from specific to general
					JOptionPane.showMessageDialog(null, e + "\nTry again...");
			  }						//End of the catch
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, e + "\nData type incorrect, try again...");
			 }						//End of catch
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, e + "\nData input error! Check it and try again...");				
			}
			
			} 						//End of while
			return data;
		}	//end of verifyIntegerNotNegative()
	
	
	public static String verifyYN(String prompt) {
		boolean isValid = false; 
		String choice = null;
		
		while (!isValid) {
			try {
				choice = JOptionPane.showInputDialog(prompt);
				
				if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("n"))
					isValid = true;
				else
					throw new Exception("Invalid entry and try again..."); //Polymorphic References To Exceptions 
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, e);
				continue;
			}
		}   //end of while loop
		return choice;
	}  //end of validateYN()
	
}	   //End of Validator