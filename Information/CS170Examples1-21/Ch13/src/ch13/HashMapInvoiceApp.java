package ch13;
//package ch13;

//Demon:Driver code for use of HashMap
public class HashMapInvoiceApp {
	public static void main(String[] args) {

		Invoice invoice = new Invoice();								//Create object
		invoice.addOrder("1122", new Product("Java", 15, 89.69));		//Add elements
		invoice.addOrder("1133", new Product("JSPS", 12, 78.99));
		invoice.addOrder("1124", new Product("Java", 20, 89.69));

		System.out.println("Product info\n" + invoice.search("1133"));			//Search and display the element
		System.out.println("Get order info\n" + invoice.getOrderInfo("Java"));	//Get the order info
		System.out.println("Invoice info\n" + invoice.getInvoiceTotal());		//Get the order total
	}
}

