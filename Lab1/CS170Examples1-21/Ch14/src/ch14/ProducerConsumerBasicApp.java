package ch14;
//package ch14;

//demo: driver code of basic producer-consumer threads

public class ProducerConsumerBasicApp {
	public static void main(String[] args) {
        Thread[] producer = new Producer[4];
        Thread[] consumer = new Consumer[4];
        for(int i = 0; i < 4; i++) {
			producer[i] = new Producer();
        	producer[i].start();
        	consumer[i] = new Consumer();
        	consumer[i].start();
        	System.out.println("consumer thread name: " + consumer[i].getName() + " is created...");
		}
        System.out.println("Thread name: " + Thread.currentThread().getName());
	}
}
