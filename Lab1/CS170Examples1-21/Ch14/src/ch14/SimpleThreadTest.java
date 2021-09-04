package ch14;
//package ch14;

//demo: simple thread test


public class SimpleThreadTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());  //Display the thread name

        Thread thread1 = new HelloThread();     //Create thread
        Thread thread2 = new HelloThread();

        thread1.start();						//get into ready for the execution
        thread2.start();
	}
}

class HelloThread extends Thread {

		public void run() {  			//Override run method
		 for(int i = 0; i < 10; i++)    //Print 10 times
		  System.out.println("Hollo world! " + this.getName() + " is running...");
		}
	}