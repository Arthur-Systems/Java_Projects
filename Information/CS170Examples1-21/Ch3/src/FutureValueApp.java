//driver class for future value application using JOptionPane

import javax.swing.JOptionPane;

public class FutureValueApp {
public static void main(String[] args) {

		String choice = "y",		//loop control initial value
			   str,
			   userName;
	FutureValue futureValue = new FutureValue();  //create an object of FutureValue
		
	while(choice.equalsIgnoreCase("y")) {

		userName = JOptionPane.showInputDialog("Welcome to future value application!\n\n"
					 + "please enter your name: ");

		futureValue.setName(userName);				//set user name


		str = JOptionPane.showInputDialog("enter your monthly invest: ");
		futureValue.setMonthlyInvest(Double.parseDouble(str));		//set monthly invset

		str = JOptionPane.showInputDialog("enter yearly return rate: ");
		futureValue.setYearlyRate(Double.parseDouble(str));			//set yearly rate

		str = JOptionPane.showInputDialog("enter number of years: ");
		futureValue.setYears(Integer.parseInt(str));				//set invest years

		futureValue.futureValueCompute();

		JOptionPane.showMessageDialog(null, "Your future return is: "
									  + futureValue.getFutureValue());

		choice = JOptionPane.showInputDialog("continue? (y/n): ");	//ask for continue or no
 	} //end of while

 	JOptionPane.showMessageDialog(null, "Thank you for using future value application.");
  } //end of main()
} //end of TestJOptionPaneApp