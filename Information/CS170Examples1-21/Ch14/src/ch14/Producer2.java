package ch14;
//package ch14;
//Demo: Producer and consumer classes for demo of producer-consumer relationship

class Producer2 extends Thread {					//Producer thread
	private static volatile int productNumber;		//Shared data
	private Shop2 shop;
	public Producer2(Shop2 shop) {					//Constructor
		this.shop = shop;							//The market
	}
	public void run() {								//Override run()
		try {
			  productNumber++;						//Update Product ID
			  Product product =new Product(productNumber);	//Create product
			  Thread.sleep((int)(Math.random() * 1000 + 200)); //Time to make
			  shop.producing(product);				//Product to shop
			  System.out.println(product + " producted by " + this.getName());
		  }
		  catch (InterruptedException e) {
			   Thread.currentThread().interrupt();	//Interrupt
		  }
	}
}

class Consumer2 extends Thread {			//Consumer thread
	private Shop2 shop;
	public Consumer2(Shop2 shop) {			//Constructor
		this.shop = shop;					//enter the market
	}
	public void run() {						//Override run()
		Product product;
		    try {
			Thread.sleep((int)(Math.random() * 1000 + 300)); 	//Need time for trade
				product = shop.consuming();						//Buy product
				System.out.println(product + " is consumed by " + this.getName());	 //Print the buying info
			 }
			 catch (InterruptedException e) {
				Thread.currentThread().interrupt(); //Interrupt
		}
	}
}
