//Demo: use of break

public class BreakTestApp {
  public static void main(String[] args) {

    int result, num = 1;
	for (int count = 1; count <= 4; count++) {
	  System.out.println("Counter: " + count);

	  while ( true ) {
		result = count * num;
		System.out.print("\t\tResult: " + result);

		if (num % 3 == 0) {
			System.out.println();
			break;				//Break out while loop
		}
		num++;
	 }
   }
 }
}