package ch14;
//package ch14;

//Example of multi-thread synchronization in sorting and printing array using volatile
import java.util.*;

public class ThreadSynchronizationApp {
	public static void main(String[] args) {
        Thread[] producer = new Producer4[20];
        Thread[] consumer = new Consumer4[20];
		for(int i = 0; i < 20; i++) {
			producer[i] = new Producer4();
        	producer[i].start();
        	consumer[i] = new Consumer4();
        	consumer[i].start();
		}
	}
}

   class Producer4 extends Thread {
		private int productNumber = 0;
		private String productInfo = null;


		public void run() {
			  Shared4.sorting();
		}
	}

	class Consumer4 extends Thread {
		private int consumerNumber = 0;
		private String consumerInfo = null;

		public void run() {				//¸²¸Çrun()·½·¨
			  Shared4.printing();
		}
    }

    class Shared4 {
		static final int SIZE = 100;
		static volatile int nums[] = new int[SIZE];
		static volatile int first = 0;
		static volatile int last = 0;
		static volatile boolean ready = false;
		public static  synchronized void sorting() {
			ready = false;
			for(int i = 0; i < nums.length; i++) {
			 nums[i] = (int)(Math.random()*10000);
			}

			Arrays.sort(nums);
			for(int num : nums)
			 System.out.print(num + " ");
			System.out.println();

			first = nums[0];
			last = nums[SIZE-1];
			ready = true;

		}

		public static synchronized  void printing() {
			if (ready) {
				System.out.println("the first number: " + first);
				System.out.println("the last number: " + last);
			}
		}
	}
