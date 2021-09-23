package ch11;
//Utility class for validation using regular expressions with more functions
import java.util.*;

public class Validator5 {
	public static double doubleData(Scanner sc, String prompt) {
		boolean isValid = false;
		double data = 0.0;

		while(!isValid) {
			try {
		 		System.out.print(prompt);
				if (!sc.hasNextDouble())
					throw new NumberFormatException();
				else {
					data = sc.nextDouble();
					isValid = true;
				}
			  }		//End of try
			catch (NumberFormatException e) {
				System.out.println(e);
				System.out.println("\nMust entry a decimal number...");
				sc.nextLine();		//Clear buffer
			 }						//End of catch
			} //End of while
			return data;
		}	//End of doubleData()

	public static int intData(Scanner sc, String prompt) {
		boolean isValid = false;
		int data = 0;

		 while(!isValid) {
		  try {
	 		System.out.print(prompt);
			if (!sc.hasNextInt())
				throw new NumberFormatException();
			else {
				data = sc.nextInt();
				isValid = true;
			}
		  }
		catch (NumberFormatException e) {
			System.out.println("\nMust enter a whole number...");
			sc.nextLine();
		 }
		}
		return data;
	 }

	public static String letter(Scanner sc, String prompt) {
		boolean isValid = false;
		String data = "";

		 while(!isValid) {
		  try {
	 		System.out.print(prompt);
			data = sc.nextLine();
			if (data.matches("\\s"))	//Whitespace
				throw new NullPointerException();
			else if (data.matches("[a-zA-Z]"))		//letters only
					isValid = true;
			else 				//Invalid character entry
				throw new Exception();
		  }
		catch (NullPointerException e) {
			System.out.println("\nYou must enter a letter...");
		 }
		catch (Exception e) {
			System.out.println("\nInvalid entry.  Please enter a letter...");
		 }
		}
		return data;
	 }

	public static int intWithRange(Scanner sc, String prompt, int min, int max) {
			boolean done = false;
			int count = 0;
			int data = 0;
			while (!done) {
	          try {
	             System.out.print(prompt );
	             data = sc.nextInt();  					//May throw InputMismatchException
	             if (data < min) 							//negative array size
	               throw new IntegerOutOfRangeException("Data out of minimum "+ min + " range exception.");
	             if (data > max)
					throw new IntegerOutOfRangeException("Data out of maximum "+ max + " range exception.");
	          	 System.out.println();
				 done = true;
	       	   }
	          catch (InputMismatchException e) {
				System.out.println("You must enter an integer....");
				count++;
				sc.nextLine();
				continue;
			  }
			  catch (IntegerOutOfRangeException e) {
				System.out.println(e);
				count++;
				sc.nextLine();
				continue;
			  }
		 	}
		   return data;
	 	}

	public static int positiveAge(Scanner sc, String prompt) {
		boolean isValid = false;
		int age = 0;

		 while(!isValid) {
		  try {
	 		System.out.print(prompt);					//may be InputMismatchException
			age = sc.nextInt();
			if (age <= 0)								//age < 0 exception
				throw new NegativeAgeException();
		  }		//try½áÊø
		catch (InputMismatchException e) {
			System.out.println("\nAge must be a whole number...");
		 }						//End of catch
		catch (NegativeAgeException e) {
			System.out.println("\nAge must be positive...");
		 }
		}
		return age;
	 }	//

}

class IntegerOutOfRangeException extends Throwable {   //Or: extends Exception
	public IntegerOutOfRangeException() {}

	public IntegerOutOfRangeException(String message) {
		super(message);
	}
}

class NegativeAgeException extends Exception {			//Or: extends Throwable
	public NegativeAgeException()  {}
	public NegativeAgeException(String message) {
		super(message);
	}
}
