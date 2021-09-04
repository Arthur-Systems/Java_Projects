//Example using while and do-while to compute the future value of the investment

import java.util.*;

public class MonthlyFutureValueApp {
	public static void main(String[] args) {

		String choice = "y";

		double monthlyAmount,
			   monthlyInterestRate,
		       investReturn;

		int 	monthCount,
				monthInvested;

		Scanner sc = new Scanner(System.in);

		while (choice.equalsIgnoreCase("y")) {

			monthCount = 1;
			investReturn = 0.0;
			System.out.println("Please enter numvber of monthes: ");
			monthInvested = sc.nextInt();
			System.out.println("Please enter monthly invest amount: ");
			monthlyAmount = sc.nextDouble();
			System.out.println("Please enter monthly interest rate: ");
			monthlyInterestRate = sc.nextDouble();


			do {
				investReturn = (investReturn + monthlyAmount) *
		  				 (1 + monthlyInterestRate);
				++monthCount;
		  	} while (monthCount <= monthInvested)	;					//Continue
			System.out.println("Your return is: " + investReturn);

			System.out.println("Continue(y/n)? ");
			choice = sc.next();
		}		//End of while loop
		sc.close();    //Close the scanner
  	} 		//End of main()
} 			//MonthlyFutureValueApp½áÊø