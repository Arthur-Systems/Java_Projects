package ch14;
//package ch14;
//Demo:  shared class among the threads for testing synchronization

import java.util.*;

public class Shared2 {
	static final int SIZE = 1000;
	static volatile int nums[] = new int[SIZE];
	static volatile int first = 0;
	static volatile int last = 0;
	static volatile boolean ready = false;
	public synchronized void sorting() {
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
	public synchronized void printing() {
		if (ready) {
			System.out.println("the first number: " + first);
			System.out.println("the last number: " + last);
		}
	}
}
