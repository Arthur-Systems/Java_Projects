package ch14;
//package ch14;
//Demo for simple example of Producer and Consumer relationship

class Shop {
	private static int numOfProduct = 0;   //tracking the business

	public static void producing() {       //Dissplay producing
		numOfProduct++;
		System.out.println("Number of products available: " + numOfProduct);
	}
	public static void consuming() {       //Display consuming
		numOfProduct--;
		System.out.println("Number of products available: " + numOfProduct);
	}
}
