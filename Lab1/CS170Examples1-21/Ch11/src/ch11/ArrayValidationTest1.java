package ch11;
//Demo:  exception handling in array uses

import java.util.*;

public class ArrayValidationTest1 {
  public static void main(String[] args) {

	  String choice = "y";
	  int count = 0;
	  int size = 0;

	  Scanner sc = new Scanner(System.in);

while (choice.equals("y")) {
          try {
             System.out.print("Please enter an integer for the size of array: " );

             size = sc.nextInt();  					//May throw InputMismatchException
             int[] intArray = new int[size];		//May throw NegativeArraySizeException
			 System.out.println();

             ArrayDemo.fillArray(intArray);			//Call the static method
			 Arrays.sort(intArray);					//Sort array
			 ArrayDemo.display(intArray);			//Call the static method
          }
          catch (InputMismatchException e) {  //Handle InputMismatchException
		  		System.out.println("You must enter an integer for array size...");
		  		count++;					//Increase the count
		  		sc.nextLine();				//Clear the buffer
		  		continue;					//Continue to loop
		  	  }
		  	  catch (NegativeArraySizeException e) {
		      	//Handle NegativeArraySizeException
		  		System.out.println("You must enter a positive integer for array size.");
		  		count++;					//Increase the count
		  		sc.nextLine();				//Clear the buffer
		  		continue;					//Continue to loop
		  	  }

		  finally { 	//count >= 3
			if (count >= 3) {
				System.out.println("The application is terminated now due to 3 times wrong entries....");
				System.out.println("Review your entries and try run the program again. Bye!");
		    	break;							//Or:System.exit(0); Terminate the loop
 			}
		  }

		System.out.print("Continue? (y/n): ");
		choice = sc.next();
    	}
		sc.close();
	}
}
