package ch14;
//package ch14;
//Demo: Use of BlockingQueue

import java.util.concurrent.*;

class Producer3 extends Thread {				//Producer threads
	private final BlockingQueue<Product> bQue;	//Use interface as parameter
	private static int productNumber;
	Producer3(BlockingQueue<Product> que) { bQue = que; }	//Constructor
public void run() {								//Override run()
		try {
			 Thread.sleep(1000);
			 bQue.put(producing()); 			//Call synchronized put()
		} catch (InterruptedException e) { System.out.println(e); }
	}
	Product producing() { 						//Produce product
		productNumber++;
		Product product = new Product(productNumber);
		System.out.println(product + " produced by "+ Thread.currentThread().getName());
		return product;							//Reutrn product
	}
}
class  Consumer3 extends Thread { 				//Consumer threads
		private final BlockingQueue<Product> bQue;
		Consumer3(BlockingQueue<Product> que) { bQue = que; }
		public void run() {						//Override run()
			try {
				consuming(bQue.take());			//Call synchronized take()
			} catch (InterruptedException e) { System.out.println(e); }
		}
		void consuming(Object product) {
			System.out.println(product + " consumed by "+ Thread.currentThread().getName());
		}
}
