/*
Name: Haichuan Wei
Course: CS125
Lab #: Lab Three
Submission Date: 10/29/2021
Brief Description: this stores the main function of the program. It uses try catch to catch the exception.
*/

package Square;
import javax.swing.JOptionPane;
public class SquareValidationApp {
	public static void main(String[] args) { //Driver method
		double sideLength = 0;
		boolean isValid = false; //variables 
		while (!isValid) { //while loop
			try {
				sideLength = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of the side of the square: "));
				if (sideLength < 0) {
					throw new NegativeDoubleException(); //if the side length is negative, it will throw the exception
				}
				isValid = true;
			} catch (NumberFormatException e) { //the catch will be thrown if the input is not a number
				JOptionPane.showMessageDialog(null, "You must enter a number.");
			} catch (NegativeDoubleException e) {
			//Error message is handled by the exception class.
			}
		}
		Square square = new Square(sideLength); // create a new Square object
		square.print(); // print the square
		
	}   //end of main()

}		//end of the driver class


