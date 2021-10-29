//Demo:  Simple exception handling for data entry using nextIn() of Scanner

import java.util.Scanner;

import java.util.InputMismatchException;

public class ExceptionHandlingScannerDemo {

	public static void main(String[] args) {
		int grade;
		Scanner sc = new Scanner(System.in);
			
		try {		//Exception handing code
			System.out.print("Please enter a grade: "); 
			grade = sc.nextInt();   //It will throw InputMismatchException automatically
			
			System.out.println("\nGrade: " + grade);
		}   //End of try
		catch (InputMismatchException e) {
			System.out.println("Incorrect grade entry! Please try again... ");
		}   //End of catch
		
		sc.close();
	}
}
