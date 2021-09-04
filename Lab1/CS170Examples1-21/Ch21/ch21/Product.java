package ch21;

//Product class

import java.io.*;

class Product implements Serializable {
	private String ID;
	private Item item = new Item();  //another referred object
	//double price;

	Product(String ID, String title, double price) {
		this.ID = ID;
		item.setTitle(title);
		item.setPrice(price);
	}
	String getID() {
	    return ID;
	}
	String getTitle() {
		return item.getTitle();
	}
	double getPrice() {
		return item.getPrice();
	}
}

class Item implements Serializable {
	private String title;
	private double price;

	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public double getPrice() {
		return price;
	}
}