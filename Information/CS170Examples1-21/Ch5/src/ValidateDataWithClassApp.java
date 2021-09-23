//Example of the driver code using Validator

import java.util.*;

public class ValidateDataWithClassApp {
   public static void main(String[] args) {
	      double price, total;

	      int 	quantity;

	      Scanner sc = new Scanner(System.in);	//Create object of Scanner

      	  //Call static methods in Validator
	      price = Validator.validateDouble(sc, "Please enter a price:");
	      quantity = Validator.validateInt(sc, "Please enter quantity:");

	      total = price * quantity;
	      System.out.println("Total: $" + total);
	   } 		//End of main()
} 			    //End of ValidateDataApp

