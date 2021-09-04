package ch14;
//package ch14;

//Multithreaded Producer-consumer application

public class ProducerConsumerApp {							//Driver code
	public static void main(String[] args) {
		final int SIZE_OF_PRODUCER = 150;					//Can be any number
		final int SIZE_OF_CONSUMER = 150;
		Thread producer[] = new Producer2[SIZE_OF_PRODUCER];//Thread array
		Thread consumer[] = new Consumer2[SIZE_OF_CONSUMER];

		Shop2 shop = new Shop2();							//Create the market

		for(int i = 0; i < producer.length; i++) {			//For all threads
			producer[i] = new Producer2(shop);				//Share the market
        		producer[i].start();						//Ready
		}
	  for(int i = 0; i < consumer.length; i++) {			//All consumers
		  consumer[i] = new Consumer2(shop);				//Shared
		  consumer[i].start();								//Ready
	  }
	}
}

