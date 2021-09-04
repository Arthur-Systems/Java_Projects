package ch14;
//package ch14;

//demo: basic threads application using join() to estimate PI

public class ThreadJoinApp {
	public static void main(String[] args) {

        Thread demo = new Estimate();

        demo.start();

      try {
			demo.join();

		  }
	  catch (InterruptedException e) {
		  }
	  System.out.println("PI = " + Estimate.PI);
	}
}

