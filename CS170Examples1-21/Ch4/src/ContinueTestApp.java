//Demo: use of continue to print the reciprocal

public class ContinueTestApp {
  public static void main(String[] args) {

    for(double i = 3; i >= -3; i--) {
	   if (i == 0)
	     continue;				//continue to the next loop
	   System.out.println("Reciprocal of " + i + " is " + (1 / i));
	}
 }
}