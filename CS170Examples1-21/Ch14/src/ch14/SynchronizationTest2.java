package ch14;
//package ch14;

//Demo: thread synchronization test using synchronized methods

public class SynchronizationTest2 {
	static Shared2 sharedObject = new Shared2();
	static class DemoThread1 extends Thread {
		public void run() {
				sharedObject.sorting();
		}
	}

	static class DemoThread2 extends Thread {
		 public void run() {
		 		sharedObject.printing();

		 }
	}
	public static void main(String[] args) {
         new DemoThread1().run();
         new DemoThread2().run();
	}
}