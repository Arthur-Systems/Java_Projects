package ch14;
//package ch14;
//Demo:  Product for Producer-Consumer relationship

import java.text.*;						//Currency format
class Product {
	private int productID;				//Product ID
	private double price;				//Product price
	public Product(int productNumber) {	//Constructor
		productID = productNumber;
		price = Math.random() * 100 + 5;	//Randomly generate price
	}
	public String toString() {				//Override toString()
	  String amount = NumberFormat.getCurrencyInstance().format(price);
	  return "Product ID: " + productID + "\tPrice: " + amount;
	}
}

