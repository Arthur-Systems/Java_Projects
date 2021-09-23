//Demo: use of labeled continue to print prime numbers

public class PrimeNumber2App {
  public static void main(String[] args) {
	int n = 2;
	outerLoop:				//Labeled continue
	while ( n <= 20) {
		for (int x = 2; x <= n -1; x++) {
			if (n % x == 0) {			//Not a prime number
				n++;					//Next number
				continue outerLoop;		//Jump out to the next loop
			}							//End of if
		}								//End of for loop
		System.out.print(n + "\t");		//Print the prime number
		n++;
	}	//End of while loop
	System.out.println();
  }
}
