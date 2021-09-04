package ch14;
//package ch14;

//Demo: thread synchronization test using synchronized methods

public class WaitNotifyAllTest {
	static Shared3 sharedObject = new Shared3();
	static class DemoThread1 extends Thread {
		public void run() {
				sharedObject.sorting();
				//Thread.interrupt();
		}
	}
	static class DemoThread2 extends Thread {
		 public void run() {
		 		sharedObject.printing();

		 }
	}
	public static void main(String[] args) {
		 final int NUM = 1000;
         DemoThread1[] demoSorting = new DemoThread1[NUM];
         DemoThread2[] demoPrinting = new DemoThread2[NUM];
         for(int i = 0; i < demoSorting.length; i++) {
			 demoSorting[i] = new DemoThread1();
			 demoPrinting[i] = new DemoThread2();
			 demoSorting[i].start();
			 demoPrinting[i].start();
		 }
	}
}