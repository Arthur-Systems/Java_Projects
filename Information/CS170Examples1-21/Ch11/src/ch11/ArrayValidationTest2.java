package ch11;
//Demo:  exception handling in array uses with modified finally

import java.util.*;

public class ArrayValidationTest2 {
  public static void main(String[] args) {

	  String choice = "y";
	  int count = 0;
	  int size = 0;
	  Scanner sc = new Scanner(System.in);
while (choice.equals("y")) {
          try {
             System.out.print("Please enter an integer for the size of array: " );

             size = sc.nextInt();  					////May throw InputMismatchException
             int[] intArray = new int[size];
			 System.out.println();

             ArrayDemo.fillArray(intArray);
			 Arrays.sort(intArray);
			 ArrayDemo.display(intArray);
          }
          catch (InputMismatchException e) {
			System.out.println("You must enter an integer for array size....");
			count++;
			sc.nextLine();							//Clear buffer
			continue;
		  }
		  catch (NegativeArraySizeException e) {
			System.out.println("You must enter an positive integer for array size....");
			count++;
			sc.nextLine();
			continue;
		  }
		  finally {        							//cont >= 3
		  if (count >= 3) {
		  		System.out.println("You¡¯ve entered 3 times wrong entries....");
		  		System.out.println("System default array size 100 has assigned to the element¡­");
		  		int[] intArray = new int[100];
		  		ArrayDemo.fillArray(intArray);
				Arrays.sort(intArray);
				ArrayDemo.display(intArray);
			 	break;
		  	}
		 }
		System.out.print("Continue? (y/n): ");
		choice = sc.next();
		count = 0;								//reset count
    	}
	sc.close();
	}
}

