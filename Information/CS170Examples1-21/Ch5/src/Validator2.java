//Example of validating data using static methods

import java.util.Scanner;

public class Validator2 {
	public static double validateDouble(Scanner sc, String prompt) {
		boolean isValid = false;
		double data = 0.0;

		while(!isValid) {
			try {
		 		System.out.print(prompt);
				if ( !sc.hasNextInt() )					//Illegal integer
				   throw new NumberFormatException();	//Throw the exception
				data = sc.nextInt();
				isValid = true;

				}								//End of try
			catch ( NumberFormatException e) {
				 System.out.println("\nInput data error! Please enter a decimal data...");
				 sc.nextLine();					//Clear the buffer
				}							//End of catch
			} 	//End of while
			return data;
		}

	//Validate integer
	public static int validateInt(Scanner sc, String prompt) {
		boolean isValid = false;
		int data = 0;

		 while(!isValid) {
		  try {
	 		System.out.print(prompt);
			if (!sc.hasNextInt())
				throw new NumberFormatException();
			data = sc.nextInt();  //else
			isValid = true;

		  }		//End of try
		catch (NumberFormatException e) {
			System.out.println("\nInput data error.  Please enter an integer...");
			sc.nextLine();		//Clear buffer
		 }
		} 						//End of while
		return data;
	 }	//End of validateInt()
}		//End of Validator2
