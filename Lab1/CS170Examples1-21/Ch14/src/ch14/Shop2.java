package ch14;
//package ch14;
//Demo:  Shared place for Producer-Consumer relationship

import java.util.*;											//Support LinkedList<E>
class Shop2 {
	private volatile LinkedList<Product> productQue = new LinkedList
	<Product>();											//Product list
	public synchronized void producing(Product product) {	//Sychronized method
		while (productQue.size() > 5 ){						//Product out of bound
			try {
				  wait(100);								//Wait 0.1 second
				  System.out.println("Products are overstocked.  Waiting consumer to buy...");
				  System.out.println("Producer " + Thread.
				  currentThread().getName() + " is wating...");
			  }
			catch (InterruptedException e) {
				  System.out.println(e);
			 }
		}
		notifyAll();										//Notify all waiting threads
		productQue.addLast(product);						//Produce the product
		System.out.println("Number of products available: " + productQue.size()); //Display the product count
	}
	public synchronized Product consuming() {				//Sychronized method
		while (productQue.size() == 0) {					//No inventory
			try {
				 wait();									//Wait for inventory
				 System.out.println("Number of products available: " + productQue.size());
				 System.out.println("Consumer " + Thread.currentThread().getName() + " is wating...");
			   }
			 catch (InterruptedException e) {
				 System.out.println(e);
			   }
		 }
		 return productQue.removeFirst();					//Otherwise consume the product
	}
	public synchronized int getSize() {						//Sychronized method
		return productQue.size();							//Return the inventory number
	}
}

