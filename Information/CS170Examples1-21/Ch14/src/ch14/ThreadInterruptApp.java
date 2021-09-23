package ch14;
//package ch14;

//demo: basic threads application using Interrupt() to stop program

import java.util.Scanner;

public class ThreadInterruptApp {
	public static void main(String[] args) {

		System.out.println("current thread = " + Thread.currentThread().getName());
		System.out.println("Is thread interrupted? " + Thread.currentThread().isInterrupted());

        Thread service = new Service();
        service.start();
		Scanner sc = new Scanner(System.in);
		String choice = "";
		while (!choice.equals("stop"))
		  choice = sc.next();

		service.interrupt();
	}
}
class Service extends Thread {
		private int count = 1;
		public void run() {
			while (!isInterrupted()) {
				System.out.println(this.getName() + " providing service " + count++);
				System.out.println("Type stop to interrupt...");
				try {
					Thread.sleep(2500);
				}
				catch (InterruptedException e) {
					break;
				}
 		    }
 		    System.out.println("Thread service is interrupted by user...");
		}
	}
