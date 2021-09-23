
//Demo of using switch-case

import java.util.Scanner;

public class SwitchTestApp {
  public static void main(String[] args) {

	 int dayOfWeek;					//Declare variables
	 String day ="", choice = "y";

	 Scanner sc = new Scanner(System.in);

	 while (choice.equalsIgnoreCase("y")) {
		 System.out.print("Please enter a number (1 to 7): ");
		 dayOfWeek = sc.nextInt();
		 System.out.println();

	     switch(dayOfWeek) {	//switch-case
	 		case 2:
	 		case 3:
	 		case 4:
	 		case 5:
	 		case 6:		day = "Work day";
	 					break;
	 		case 1:
	 		case 7:		day = "Weekend";
	 	}   //End of switch-case
	    System.out.println("day of week: " + day);

		System.out.print("Continue (y/n)? ");
		choice = sc.next();

		System.out.println();
	} 	//End of while
	sc.close();  //close the buffer
 }
}