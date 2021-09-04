//Demo:  Example of simple exception handling

import java.util.*;

public class TestExceptionApp {
   public static void main(String[] args) {
   	int intData = 0;
        String choice = "y";
        Scanner sc = new Scanner(System.in);

    while (choice.equals("y")) {
 	  try {
	    System.out.print("\nEnter the quantity: ");
	    intData = sc.nextInt();
	    System.out.println("intData = " + intData * 10);
	  }
	  catch (InputMismatchException e) {
	    sc.nextLine();					// Clear sc buffer
	    System.out.println("Error!  Invalid integer.  Try again…");
	    continue;						//Continue to input in the loop
	  }
	  System.out.print("Continue (y/n)?  ");
	  choice = sc.next();
    }
    sc.close();  //Close the scanner
  }
}