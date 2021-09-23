//Demo of testing a simple if-else statement

import java.util.Scanner;

public class TestIfElseApp {
	public static void main(String[] args) {

	double discountRate = 0.1;	//defult discoutRate
	int total = 150;            //defult total
	String answer;				//define a string

	Scanner  sc = new Scanner(System.in);	//create an object of Scanner

	System.out.println("Let's see a simple example for if-else......\n");

	System.out.print("The total is " + total + ", enter Y or N to confirm: ");
	answer = sc.next();			//scan in the answer

	System.out.println();

	if (answer.equals("Y"))		//if this is true, discountRate is 0.2
		 discountRate = 0.2;
	else
		discountRate = 0.15;	//if it's not truw, then discountRate is 0.1

	//display the results
	System.out.println("answer is " + answer);
	System.out.println("discount Rate is " + discountRate);
	System.out.println("discount is " + total * discountRate);

	System.out.println("\nThank you for using this example.\n");
	
	sc.close();  //Close the scanner
	}	//end of the main()
}		//end of TestIfElseApp