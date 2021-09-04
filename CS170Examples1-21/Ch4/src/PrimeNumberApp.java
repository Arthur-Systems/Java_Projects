//Demo: use of break to print prime numbers

public class PrimeNumberApp {
    public static void main(String[] args){
      int n, x;

      for (n = 2;n <= 20; n++ ){
        for (x = 2; x < n;x++ ){
          if(n % x == 0)			//Not a prime number
            break;					//Break the inner loop and jump to the next outer loop
        }
        if(n == x)					// n == x is a prime number
          System.out.print(n + "\t");
      }
      System.out.println();
    }
}