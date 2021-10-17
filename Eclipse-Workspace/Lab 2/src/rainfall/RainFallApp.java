/*
Name: Haichuan Wei
Course: CS125
Lab #: Lab Two
Submission Date: 10/14/2021
Brief Description:  This program takes in data passed by the user in the driver class and calculates the 
average, total , highest, and lowest amount based on the provided data.

*/
package rainfall;
import java.util.*;

public class RainFallApp {// driver class

	public static void main(String[] args) {// main method

		RainFall app = new RainFall(); // create object of RainFall
		app.stop = false;
		Scanner input = new Scanner(System.in);// create scanner object
		while (!app.stop) {

			System.out.println("Enter rainfall for month. (to exit, please enter -99 :3) "); // prompt
			for (int i = 0; i < app.RainData.length; i++) { // loop to get rainfall for each month
				int rainfall = input.nextInt();
				if (rainfall == -99) { // condition to exit
					app.stop = true;

					input.close();// close scanner
					break;
				} else {
					app.RainData[i] = rainfall; // data is passed into the array
				}
			}
			app.displayRainFall(); // called the display method
		}

		System.out.println("Ok Quitting!"); // exit message
	}// end of main method
}// driver class
