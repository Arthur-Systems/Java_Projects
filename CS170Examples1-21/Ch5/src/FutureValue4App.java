//Example of the driver code using formatted output

import java.util.*;
import java.text.*;

public class FutureValue4App {
public static void main(String[] args) {

		String choice = "y",
			   userName;
		double monthlyInvestment,
		       yearlyReturnRate;
		int    investYears;
		final int minYear = 1,
				  maxYears = 150;

		String 	rateStr,
				investStr,
				futureValueStr;


	Scanner sc = new Scanner(System.in);
	FutureValue3 futureValue = new FutureValue3();  //Create the object

	while(choice.equalsIgnoreCase("y")) {

		System.out.print("Please enter your name: ");
		userName = sc.next();
		futureValue.setName(userName);				//Set name
		sc.nextLine();

		monthlyInvestment = Validator3.validateDouble(sc, "Your monthly invest: ");
		futureValue.setMonthlyInvest(monthlyInvestment);

		yearlyReturnRate = Validator3.validateDouble(sc, "Interest rate: ");
		futureValue.setYearlyRate(yearlyReturnRate);

		investYears = Validator3.validateInt(sc, "Invest years: ", minYear, maxYears);
		futureValue.setYears(investYears);

		futureValue.futureValueCompute();

		//Formatted output for currency
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		investStr = currency.format(futureValue.getMonthlyInvest());
		futureValueStr = currency.format(futureValue.getFutureValue());

		//Formatted output for perceent
		NumberFormat percent = NumberFormat.getPercentInstance();
		percent.setMinimumFractionDigits(2);
		rateStr = percent.format(futureValue.getYealyRate()/100);

		System.out.println("Your name: " + futureValue.getName());
		System.out.println("Invest amount: " + investStr);
		System.out.println("interest rate: " + rateStr);
		System.out.println("Invest years: " + futureValue.getYears());
		System.out.println("Future value: " + futureValueStr);
		System.out.println("Contine?(y/n): ");

		choice = sc.next();
		sc.nextLine();		//Clear the buffer
 	} //End of while

 	System.out.println("Good bye!");
  } //End of main()
} //End of FutureValue4App