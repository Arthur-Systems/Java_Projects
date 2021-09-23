package ch13;
//package ch13;

//Demo:  Driver code to processing order invoice using collections
public class OrderInvoiceApp {
	public static void main(String[] args) {

		Product myOrder = new Product("Java", 15, 89.69);
		Product herOrder = new Product("JSPS", 12, 78.99);
		Product hisOrder = new Product("Java", 20, 89.69);


		Order invoice = new Order();
		invoice.addOrder(myOrder);
		invoice.addOrder(herOrder);
		invoice.addOrder(hisOrder);

		System.out.println("Invoice info: " + invoice.getInvoiceTotal());

		System.out.println("Get order info: " + invoice.getOrderInfo("Java"));
	  }
}
