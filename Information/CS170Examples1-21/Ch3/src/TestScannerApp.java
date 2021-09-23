//Demo of using the common methods in Scanner

import java.util.Scanner;

public class TestScannerApp {
	public static void main(String[] args) {
		String title,
			   message;
		double price,
			   total;
		int quantity;

		Scanner sc = new Scanner(System.in);	//create an object of Scanner

		System.out.print("Enter a title: ");	//prompt use to enter
		title = sc.next();						//receive a token
		System.out.println("title is " + title); //print the title

		System.out.print("\nEnter a price: ");   //prompt user to enter a price
		price = sc.nextDouble();				//receive the double

		System.out.print("\nenter the quantity: "); //prompt user to enter quantity
		quantity = sc.nextInt();			//receive the quantity
		total = (price + price * 0.065) * quantity;
		System.out.print("\ntotal is  " + total);  //print total

		sc.nextLine();			//clear the sc buffer
		System.out.println("\n\nenter a line of message: "); //prompt user to enter a line
		message = sc.nextLine();				//receive the line of entry
		System.out.println("My message is " + "\"" + message + "\"");		//print message
		sc.close();				//close the buffer
	}
}