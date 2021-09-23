//Example of validation class with verification of the data with ranges

import java.util.Scanner;

public class Validator3 {
	public static double validateDouble(Scanner sc, String prompt) {
		boolean isValid = false;
		double data = 0.0;
		sc.nextLine();								//Clear the buffer

		//System.out.println("Inside validateDouble()");

		while(!isValid) {
			try {
				   System.out.print(prompt);

				   if (!sc.hasNextDouble())     //Not a double
				    {   //System.out.println("Inside hasNextDouble()");
						throw new NumberFormatException();
					}
				   else {
						data = sc.nextDouble();	//Receive double

						if (inRange(data))		//In the right range
					         isValid = true;
				      		else
					         throw new Exception();  //Out of range
				   }
			 }								//End of try

			catch (NumberFormatException e) {
				System.out.println("\nData input error.  Please enter a decimal data...");
				sc.nextLine();		//Clear buffer
			 }						//End of catch
			catch (Exception e) {
				System.out.println("\nData input error.  Please check the data and try again...");
				sc.nextLine();
			 }
			} //End of while
			return data;
		}	//End of validateDouble()

	//Method of validateInt()with range
	public static int validateInt(Scanner sc, String prompt, int min, int max) {
		boolean isValid = false;
		int data = 0;
		sc.nextLine();								//Clear the buffer

		 while(!isValid) {
		  try {
	 		System.out.print(prompt);
			if (!sc.hasNextInt())
				throw new NumberFormatException();
			else {
				data = sc.nextInt();

				if (data < min) 				//less than min
					throw new Exception();		//Throw the exception
				else if (data > max) 			//Greater than max
					throw new Exception();		//Throw the exception
				isValid = true;
			}
		  }		//End of try
		catch (NumberFormatException e) {
			System.out.println("\nData input error.  Please enter an integer...");
			sc.nextLine();		//Clear buffer
		 }						//End of catch
		catch (Exception e) {
			System.out.println("\nInput data out of the range error. Please check the data and try again...");
			sc.nextLine();
		 }
		} 						//End of while
		return data;
	 }	//End of validateInt()

	//Method of inRange()
	private static boolean inRange(double num) {
		if (num >=0.0)
			return true;
		else
			return false;
	}

}			//End of Validator3
