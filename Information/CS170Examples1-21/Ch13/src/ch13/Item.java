package ch13;
//package ch13;

//Item and Book2 classes for demo

public class Item {
	   protected String name;
	   protected double price;

	   public Item(String name) {
		   this.name = name;
	   }
	   public Item(String name, double price) {
		   this.name = name;
		   this.price = price;
	   }
	   public void setName(String name) {
	  	   this.name = name;
	     }
	     public String getName() {
	  	   return name;
	   }
	   public void setPrice(double price) {
		   this.price = price;
	   }
	   public double getPrice() {
		   return price;
	   }

	  public String toString()  {
		  return "Name: " + name + " price: " + price;
	  }
	 }









