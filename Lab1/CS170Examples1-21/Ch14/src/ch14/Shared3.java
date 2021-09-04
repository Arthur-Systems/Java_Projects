package ch14;
//package ch14;

//Demo:  use of wait() and notifyAll() for cynchronization

import java.util.*;

public   class Shared3 {
	static final int SIZE = 20;
	static volatile int nums[] = new int[SIZE];
	static volatile int first = 0;
	static volatile int last = 0;
	static volatile boolean ready = false;
	public synchronized void sorting() {

	  try {
	  	if(!ready) {

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

			wait();
		 }
		else
		  ready = false;
	}
	catch (InterruptedException e) {
		System.out.println(e);
	}
	  }
  public synchronized void printing() {
		if (ready) {
			notifyAll();
			System.out.println("the first number: " + first);
			System.out.println("the last number: " + last);
		}
	}
}
