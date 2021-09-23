package ch14;
//package ch14;

//demo: simple thread test using yield()

public class SimpleThreadYieldTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

        Thread thread1 = new HelloThread2();
        Thread thread2 = new HelloThread2();

        thread1.start();
        thread2.start();
	}
}

class HelloThread2 extends Thread {

		public void run() {  			//Override run()
			 for(int i = 0; i < 10; i++)  {
				  System.out.println("Hollo world! " + this.getName() + " is running...");

				 Thread.yield();
	 		}
		}

	}