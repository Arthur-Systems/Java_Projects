/*
Name: Haichuan Wei
Course: CS125
Lab #: Lab One
Submission Date: 9/23/21
Brief Description: This program take a number that is less then 10 from the user and convert it to a roman numeral.
*/
package RomanNumerals;
import java.util.Scanner;
public class RomanNumeralsApp {//driver class
	private static Scanner Input = new Scanner(System.in);
	public static void main(String[] args) {//this method sets its width variable to the 
		
		RomanNumerals Roman = new RomanNumerals();
		
		System.out.println("Enter a number between 1 and 10");
		int number = Input.nextInt();//User inputs their number
		if(number <= 10){//checks to make sure that the inputted number is less then ten
			Roman.convertNum(number); //passes the "Number " vararble back to the convertNum method
			System.out.println(Roman.displayResult());

		}
		else if (number < 0 || number > 10){//if the number is greater or less then 10 then it will warn the user
			System.out.println("Please enter a number between 1 and 10");
		}
		else{
			System.out.println("ERROR!");//if anything else is entered then it will warn the user
		}
	
}// end of main method
}// end of driver class