//Driver code for future value calculation

import javax.swing.JOptionPane;

public class FutureValue2App {
public static void main(String[] args) {

		String choice = "y",
			   str,
			   userName;
	FutureValue2 futureValue = new FutureValue2();
	while(choice.equalsIgnoreCase("y")) {

		userName = JOptionPane.showInputDialog("Welcome to future value application!\n\n"
					 + "please enter your name: ");

		futureValue.setName(userName);


		str = JOptionPane.showInputDialog("enter your monthly invest: ");
		futureValue.setMonthlyInvest(Double.parseDouble(str));

		str = JOptionPane.showInputDialog("enter yearly return rate: ");
		futureValue.setYearlyRate(Double.parseDouble(str));

		str = JOptionPane.showInputDialog("enter number of years: ");
		futureValue.setYears(Integer.parseInt(str));

		futureValue.futureValueCompute();

		JOptionPane.showMessageDialog(null, "Your future return is: "
									  + futureValue.getFutureValue());

		choice = JOptionPane.showInputDialog("continue? (y/n): ");
 	} //End of while

 	JOptionPane.showMessageDialog(null, "Thank you for using future value application.");
  } //End of main()
}