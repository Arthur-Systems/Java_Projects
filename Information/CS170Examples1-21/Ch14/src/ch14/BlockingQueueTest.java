package ch14;
//package ch14;
//Demo for using SynchronousQueue to simulate producer-consumer

import java.util.concurrent.*;

public class BlockingQueueTest {					//Driver
	public static void main(String[] args)  {
		SynchronousQueue<Product> bQue = new SynchronousQueue<Product>();
		Producer3 producer1 = new Producer3(bQue);	//Create two producters
		Producer3 producer2 = new Producer3(bQue);
		Consumer3 consumer1 = new Consumer3(bQue);	//Create two consumers
		Consumer3 consumer2 = new Consumer3(bQue);
		new Thread(producer1).start();				//Ready
		new Thread(consumer1).start();
		new Thread(consumer2).start();
		new Thread(producer2).start();
	}
}
