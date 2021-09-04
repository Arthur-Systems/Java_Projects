//Validation class

import java.util.Scanner;

public class Validator3 {
	public static double validateDouble(Scanner sc, String prompt) {
		boolean isValid = false;
		double data = 0.0;

		while(!isValid) {
			try {
		 		System.out.print(prompt);
				if (!sc.hasNextDouble())
					throw new NumberFormatException();
				else {
					data = sc.nextDouble();
					if (inRange(data))			//It is valid
						isValid = true;
					else
						throw new Exception();
				}
			  }
			catch (NumberFormatException e) {
				System.out.println("\nData entry error... Please enter a decimal number.");
				sc.nextLine();		//Clear buffer
			 }
			catch (Exception e) {
				System.out.println("\nData enter error...");
				sc.nextLine();
			 }
			} //End of while
			return data;
		}	//End of validateDouble() with range

	//Validate int with range
	public static int validateInt(Scanner sc, String prompt, int min, int max) {
		boolean isValid = false;
		int data = 0;

		 while(!isValid) {
		  try {
	 		System.out.print(prompt);
			if (!sc.hasNextInt())
				throw new NumberFormatException();
			else {
				data = sc.nextInt();
				if (data < min)
					throw new Exception();
				else if (data > max)
					throw new Exception();
				isValid = true;
			}
		  }
		catch (NumberFormatException e) {
			System.out.println("\nData entry error... Please enter an integer.");
			sc.nextLine();		//Clear the buffer
		 }
		catch (Exception e) {
			System.out.println("\nData entry error...");
			sc.nextLine();
		 }
		} 						//End of while
		return data;
	 }	//End of validateInt() with range

	private static boolean inRange(double num) {
		if (num >=0.0)
			return true;
		else
			return false;
	}

}			//End of Validator3