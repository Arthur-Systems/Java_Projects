//Example of the driver code with the validation

import java.util.*;

public class FutureValue3App {
public static void main(String[] args) {

		String choice = "y",
			   userName;
		double monthlyInvestment,
		       yearlyReturnRate;
		int    investYears;
		final int minYear = 1,
				  maxYears = 150;

	Scanner sc = new Scanner(System.in);
	FutureValue3 futureValue = new FutureValue3();  //Create the object

	while(choice.equalsIgnoreCase("y")) {

		System.out.print("Please enter your name: ");
		userName = sc.next();

		futureValue.setName(userName);				//Call method to set the name						//Clear the buffer

		monthlyInvestment = Validator3.validateDouble(sc, "Please enter monthly investment: ");
		futureValue.setMonthlyInvest(monthlyInvestment);

		yearlyReturnRate = Validator3.validateDouble(sc, "Please enter the annual interest rate: ");
		futureValue.setYearlyRate(yearlyReturnRate);

		investYears = Validator3.validateInt(sc, "Please enther the invest years: ", minYear, maxYears);
		futureValue.setYears(investYears);

		futureValue.futureValueCompute();  //Call the method to compute

		System.out.println("Your return value: $" + futureValue.getFutureValue());
		System.out.println("Continue?(y/n): ");

		choice = sc.next();	//Get the choice
		sc.nextLine();		//Clear the buffer
 	} //End of while

 	System.out.println("Good bye!");
  } //End of main()
} //End of the driver code