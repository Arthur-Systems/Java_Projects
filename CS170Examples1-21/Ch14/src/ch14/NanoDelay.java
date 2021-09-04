package ch14;
//package ch14;

//Demo of DelayQueue

import java.util.concurrent.*;

class NanoDelay implements Delayed {  		//Implement Delayed
    long trigger;
    NanoDelay(long i) {						//Constructor
      trigger = System.nanoTime() + i; 		//Call system provided nanosecond plus i
    }
    public int compareTo(Delayed d) {		//Override compareTo()
	         long i = trigger;
	         long j = ((NanoDelay)d).trigger;
	         int returnValue;
	         if (i < j) {					//See which one is greater
	           returnValue = -1;
	         } else if (i > j) {
	           returnValue = 1;
	         } else {
	           returnValue = 0;
	         }
	         return returnValue;
       }
    public long getDelay(TimeUnit unit) {	//Implement getDelay()
      long n = trigger - System.nanoTime();	//Compute delay time
      return unit.convert(n, TimeUnit.NANOSECONDS);	//Conver on to nanosecond
    }
    public long getTriggerTime() {			//Return the trigger time
      return trigger;
    }
}
