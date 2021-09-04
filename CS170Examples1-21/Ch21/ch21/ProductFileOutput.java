package ch21;

import java.util.*;

public class ProductFileOutput {
		ObjectOutput out;
    public void createOutputfile(String fileName) {
		out = new ObjectOutput(fileName);
	}
	public void createData() {
		Product product;
		String productID;
		String	title;
		double price;

		Scanner sc = new Scanner(System.in);

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			// get the input from the user
			try {
				//sc.nextLine();
				System.out.print("Enter the product ID: ");
				productID = sc.next();
				sc.nextLine();
				System.out.print("Enter the product title: ");
				title = sc.nextLine();
				System.out.print("Enter the price: ");
				price = sc.nextDouble();
				sc.nextLine();

				product = new Product(productID, title, price);

				System.out.println("Product ID: " + product.getID());
				System.out.println("Product tile: " + product.getTitle());
				System.out.println("Product price: " + product.getPrice());
				out.outObject(product);
			}
			catch(Exception e) {
				sc.nextLine();   // discard the invalid price
				System.out.println("Error! Invalid price. Try again.\n");
				continue;    // jump to start of loop
			}
			 // see if the user wants to continue
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			//sc.nextLine();
			System.out.println();
        }
	}
	public void closeOutputFile() {
      	out.closeFile();
	}
}