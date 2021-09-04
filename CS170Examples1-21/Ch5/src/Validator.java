//Example of validation class

import java.util.Scanner;

public class Validator {              //Define Validator class
   public static double validateDouble(Scanner sc, String prompt) {
	      boolean isValid = false;
	      double data = 0.0;

	      while(!isValid) {
		         System.out.print(prompt);
		         if (sc.hasNextDouble()) {
				data = sc.nextDouble();
				isValid = true;
	      	   	  }
		         else    			 //Invalid input
			       System.out.println("\nData input error.  Enter a decimal number…");

		         sc.nextLine();		 //Clear the buffer
		} 		//End of while loop
		return data;
	   }	    //End of validateDouble()


	public static int validateInt(Scanner sc, String prompt) {
		boolean isValid = false;
		int data = 0;

		 while(!isValid) {

	 		System.out.print(prompt);
			if (sc.hasNextInt()) {
				data = sc.nextInt();
				isValid = true;
			 }
			else {
				System.out.println("\nData inout error.  Enter an integer...");
				sc.nextLine();		//Clear the buffer
		     }
		 } 							//End of while
		return data;
	 }		//End of validateInt()
}			//End of Validator
