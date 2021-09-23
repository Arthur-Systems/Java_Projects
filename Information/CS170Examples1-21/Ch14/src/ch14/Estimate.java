package ch14;
//package ch14;

//Estimate PI

class Estimate extends Thread {
	   public static double PI = 0.0;
	   private int sign = 1;

		public void run() {  			//
		   for(long i = 1; i <= 9999999; i += 2)  {
			   PI += 4.0 * (double)sign / i;
			   sign = -sign;
		   }
		}
	}
