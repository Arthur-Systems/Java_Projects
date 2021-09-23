package ch14;
//package ch14;

//Demo: thread synchronization test

public class SynchronizationTest {
	static Shared sharedObject = new Shared();		//Create shared data
	private static class DemoThread1 extends Thread {	//Inner static thread
		public void run() {						//Override run()
			synchronized (sharedObject) {		//Define synchronized block
				sharedObject.sorting();			//Call sorting()
			}
		}
	}
	static class DemoThread2 extends Thread {	//Another inner static thread
		 public void run() {					//Overrid run()
		 	 synchronized (sharedObject) {		//Define synchronized block
		 	 sharedObject.printing();			//Call printing()
		 	}
		 }
	}
	public static void main(String[] args) {	//Driver code
         new DemoThread1().run();				//Create and ready
         new DemoThread2().run();
	}
}

