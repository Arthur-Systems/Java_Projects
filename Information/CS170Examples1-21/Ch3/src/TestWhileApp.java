//Demo of testing while loop with user control and computing the average score

import java.util.Scanner;

public class TestWhileApp {
  public static void main(String[] args) {

  double average; 		//avreage score
  int 	 score,			//holds student score
  		 total = 0,		//total of scores
  		 count = 0;     //number of scores

  Scanner  sc = new Scanner(System.in);	//create an object of Scanner
  String choice = "y";	//while loop control with default value "y"

  System.out.println("This demo will compute the average score\n");

  while(choice.equalsIgnoreCase("y"))	//loop continue if it's true
  {
	  System.out.print("Please enter a student score (1-100): " );
	  score = sc.nextInt();				//receive a score
	  total += score;					//accumulate the total
	  count++;							//increase number of score by 1

	  System.out.println();
	  System.out.print("Next student score? (y/n): "); //continue?
	  choice = sc.next();				//receive the choice

	  System.out.println();
  }
  average = total / count; //calculate the average score

  System.out.println("The number of students is " + count); //display the count
  System.out.println("The average score is " + average); //display the average
  System.out.println("\nThank you for using this example.");
  
  sc.close();  //Close the scanner
  
 }  // end of the main()
}	//end of the TestWhileApp
