package ch13;
//package ch13;

import java.util.*;
import java.text.NumberFormat;

class Invoice {
	private HashMap<String, Product> orderMap;					//Create HashMap collection
	private Collection<Product> orderList;							//Create collection

	NumberFormat currency = NumberFormat.getCurrencyInstance();	//Currency format

	public Invoice() {											//Constructor
		orderMap = new HashMap<String, Product>();
	}
	public void addOrder(String code, Product product) {		//Add element
		orderMap.put(code, product);
	}
	public String search(String code) {						//Search product info
		String message = null;
		Product product = orderMap.get(code);
		double total = product.getQuantity() * product.getPrice();		//Return total

		message = "Product: " + product.getName()
				  + "\nQuantity: " + product.getQuantity()
				  + "\nPrice: " + currency.format(product.getPrice())
				  + "\nTotal: " + currency.format(total) + "\n";
		return message;											//Return message
	}
	public String getOrderInfo(String name) {					//Order info
		orderList = orderMap.values();							//Keep the order info in collection

		int totalQuantity = 0;
		double totalAmount = 0.0;
		String message;
		for(Product order : orderList) {						//Iterator
			if (name.equals( order.getName()))
				totalQuantity += order.getQuantity();
				totalAmount += order.getPrice();
			}

		totalAmount *= totalQuantity;
		message = "Product name: " + name + "\nTotal quantity: " + totalQuantity
				  + "\nTotalAmount: " + currency.format(totalAmount) + "\n";
		return message;										//Return message
		}
	public String getInvoiceTotal() {						//Invoice total
		orderList = orderMap.values();
		double total = 0.0;
		for(Product order : orderList)
	 		total += order.getPrice()*order.getQuantity();
	    return "Grand Total: " + currency.format(total) + "\n";				//Return total
	 }
}

