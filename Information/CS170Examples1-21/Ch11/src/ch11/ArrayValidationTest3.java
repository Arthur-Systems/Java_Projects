package ch11;
//Demo:  exception handling in array uses with specially designed validation class

import java.util.*;

public class ArrayValidationTest3 {
  public static void main(String[] args) {

	  String choice = "y";
	  int size = 0;

	  Scanner sc = new Scanner(System.in);

	while (choice.equals("y")) {
          size = Validator4.arraySize(sc, "Please enter an integer for the size of array: ");
          int[] intArray = new int[size];

           ArrayDemo.fillArray(intArray);
		   Arrays.sort(intArray);
		   ArrayDemo.display(intArray);

	       System.out.print("Continue? (y/n): ");
		   choice = sc.next();
		//count = 0;								//reset count
     }
  }
}