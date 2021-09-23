package ch13;
//package ch13;

import java.util.*;
import java.text.NumberFormat;

public class Order {
	private ArrayList<Product> orderList;		//
	NumberFormat currency = NumberFormat.getCurrencyInstance();

	public Order() {
		orderList = new ArrayList<Product>();
	}


	public void addOrder(Product product) {
		orderList.add(product);
	}

	public String getOrderInfo(String name) {
		Iterator<Product> iterator = orderList.iterator();
		int totalQuantity = 0;
		double totalAmount = 0.0;
		String message;
		Product order;
		while (iterator.hasNext()) {
			order = iterator.next();

			if (name.equals( order.getName()))
				totalQuantity += order.getQuantity();
			totalAmount = order.getPrice();
		}
		totalAmount *= totalQuantity;
		message = "Product name: " + name + "\nTotal quantity: " + totalQuantity
				  + "\nTotal Amount: " + currency.format(totalAmount);

		return message;
		}
	public String getInvoiceTotal() {
		double total = 0.0;

		for(Product order : orderList)
	 		total += order.getPrice()*order.getQuantity();

	    return "Grand Total: " + currency.format(total);
	}
}


