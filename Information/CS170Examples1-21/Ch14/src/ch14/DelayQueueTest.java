package ch14;
//package ch14;
//Driver code for demo of using DelayQueue

import java.util.*;
import java.util.concurrent.*;

public class DelayQueueTest {
  public static void main(String args[]) throws InterruptedException {
    Random random = new Random();
    DelayQueue<NanoDelay> queue = new DelayQueue<NanoDelay>();
    for (int i=0; i < 5; i++) {
      queue.add(new NanoDelay(random.nextInt(1000)));
    }
    long last = 0;
    for (int i=0; i < 5; i++) {
      NanoDelay delay = (NanoDelay)(queue.take());
      long triggerTime = delay.getTriggerTime();
      System.out.println("Trigger time: " + triggerTime);
      if (i != 0) {
        System.out.println("Delta: " + (triggerTime - last));
      }
      last = triggerTime;
    }
  }
}
