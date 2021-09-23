//Demo of testing if statements

import java.util.Scanner;

public class TestIfApp {
	public static void main(String[] args) {

	double discountRate = 0.1;	//default discountRate
	int total;                  //declare total

	Scanner  sc = new Scanner(System.in);	//create an object of Scanner

	System.out.println("Let's exam the first example......\n");

	System.out.print("Please enter a total (whole number only): ");
	total = sc.nextInt();	//scan in the total

	System.out.println();

	if (total >= 150)		//if this is true, discountRate is 0.2
		discountRate = 0.2;

	System.out.println("total is " + total);
	System.out.println("discount Rate is " + discountRate);
	System.out.println("discount is " + total * discountRate);
	System.out.println("this result is from the first example.\n");

	System.out.println("The following resluts are from the second example......\n");

	discountRate = 0.1;		//reset the discountRate
	int bulkOrder = 10;		//define the bulkOrder to 10

		if (total >= 150)	//if this is true, discountRate = 0.2, bulkOrder + 1
			{ discountRate = 0.2;
			  bulkOrder ++;
			}
		System.out.println("total is " + total);
		System.out.println("discount Rate is " + discountRate);
		System.out.println("Discount is " + total * discountRate);
		System.out.println("Number of bulk order is " + bulkOrder);

		System.out.println("Thank you for using this example.");
		
		sc.close();  //Close the scanner
	}	//end of the main()
}		//end of TestIfApp
