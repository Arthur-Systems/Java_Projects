package ch13;
//package ch13;

//demo class used for testing Generics and wildcard

public class Product {
	protected String name;
	protected int  quantity;
	protected double price;

	Product(String name, int quantity, double price) {
			this.name = name;
			this.quantity = quantity;
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public int getQuantity() {
			return quantity;
		}
		public double getPrice() {
			return price;
		}
		public String toString() {
			String message = "Name: " + name + " Quantity: " + quantity + " Price: " + price;
			return message;
		}
}

class Book extends Product {
	String ISBN;

	public Book(String name, int quantity, double price, String ISBN)  {
		super(name, quantity, price);
		this.ISBN = ISBN;
	}

	public String toString() {
		return super.toString() + " ISNB: " + ISBN;
	}
}
