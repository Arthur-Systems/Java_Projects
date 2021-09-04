//Demo of testing print() and println()

public class TestPrintApp {
	public static void main(String[] args) {

		double interestRate = 0.234567891234567890;

		boolean result = interestRate == 0.234567891234567891;

		System.out.println("result: " + result);

		System.out.print("price: ");	//print price: to output screen
		System.out.println();		//print a blank line
		System.out.print("\n");		//same as above

		double total = 25.09;
		System.out.println("total: " + total);     //print total: and the value of total
		System.out.print("total: " + total + "\n");  //same as above

		String message = "Welcome to use of System.out.println()";
		System.out.println(message);		//print message string

		char letter = 'A';
		System.out.print("letter = " + letter + 1 + "\n");  //pirnt A1 and return
		System.out.print("letter= " + (letter + 1) + "\n"); //print 66 and return
		System.out.print("letter= " + (char)(letter + 1) + "\n"); //print B and return
	}
}