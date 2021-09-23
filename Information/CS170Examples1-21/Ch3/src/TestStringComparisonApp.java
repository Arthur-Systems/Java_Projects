//Demo of testing string comparisons

import java.util.Scanner;

public class TestStringComparisonApp {
	public static void main(String[] args) {

		String  str1,		//declare two strings
				str2;

		Scanner sc = new Scanner(System.in);	//create an object of Scanner

		System.out.println("Welcome to String comparison testing\n");

		System.out.print("Please enter the first string: ");
		str1 = sc.nextLine();		//scan in the first string

		System.out.print("\nPlease enter the second string: ");
		str2 = sc.nextLine();		//scan in the second string

		//display the first and second one
		System.out.println();
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);

		//display the results of the comparison
		System.out.println("str1.equals(str2) is " + str1.equals(str2));
		System.out.println("str1.equalsIgoreCase(str2) is " + str1.equalsIgnoreCase(str2));

		System.out.println();
		System.out.println("Thank you and please try again...");
		
		sc.close();     //close the buffer
	}	//end of the main()
}		//end of TestStringomparisonApp