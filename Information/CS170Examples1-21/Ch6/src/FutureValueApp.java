//Use constructor overloading to create different objects and call their methods

import java.util.*;

public class FutureValueApp {
public static void main(String[] args) {

		String choice = "y",
			   userName;
		double monthlyInvestment,
		       yearlyReturnRate;
		int    investYears;
		final int minYear = 1,
				  maxYears = 150;

	Scanner sc = new Scanner(System.in);

	//Create object using a variety of overloaded constructors
	FutureValue noNameFutureValue = new FutureValue();
		noNameFutureValue.futureValueCompute();
	FutureValue noInvestFutureValue = new FutureValue("John");
		noInvestFutureValue.futureValueCompute();
	FutureValue noRateFutureValue = new FutureValue("Wang", 1000);
		noRateFutureValue.futureValueCompute();
	FutureValue noYearsFutureValue = new FutureValue("Liu", 2000, 9.85);
		noYearsFutureValue.futureValueCompute();
	FutureValue myFutureValue = new FutureValue("Gao", 1590, 10.28, 25);
		myFutureValue.futureValueCompute();

	//Call formatted methods
	System.out.println(FutureValue.getFormattedMessage(noNameFutureValue));
	System.out.println(FutureValue.getFormattedMessage(noInvestFutureValue));
	System.out.println(FutureValue.getFormattedMessage(noRateFutureValue));
	System.out.println(FutureValue.getFormattedMessage(noYearsFutureValue));
	System.out.println(FutureValue.getFormattedMessage(myFutureValue));


	while(choice.equalsIgnoreCase("y")) {

		FutureValue futureValue = new FutureValue();

		System.out.print("Please enter your name: ");
		userName = sc.next();
		futureValue.setName(userName);				//Set name
		sc.nextLine();

		monthlyInvestment = Validator3.validateDouble(sc, "Enter your monthly invest amount: ");
		futureValue.setMonthlyInvest(monthlyInvestment);

		yearlyReturnRate = Validator3.validateDouble(sc, "Enter your interest rate: ");
		futureValue.setYearlyRate(yearlyReturnRate);

		investYears = Validator3.validateInt(sc, "Enter your invest years: ", minYear, maxYears);
		futureValue.setYears(investYears);

		futureValue.futureValueCompute();

		//Display the return
		System.out.println(FutureValue.getFormattedMessage(futureValue));

		System.out.println("Continue (y/n): ");
		choice = sc.next();
		sc.nextLine();		//Clear the buffer
 	} //End of while

 	System.out.println("Number of objects: " + FutureValue.getCount() + "\n\n" ); //Call static method¨

 	System.out.println("Good bye!");
  } //End of main()
} //End of FutureValueApp