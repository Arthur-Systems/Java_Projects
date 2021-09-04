//Demo of testing the GradeWihSwitch class with switch statement
import javax.swing.JOptionPane;

public class GradeWithSwitchApp {

	public static void main(String[] args) {
		GradeWithSwitch grade = new GradeWithSwitch();	//create an object
		
		int score;
		//int total = 100, sum = 0;
		String str, message, choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {   
		//ask for input score
		str = JOptionPane.showInputDialog("please enter an integer score: ");
		score = Integer.parseInt(str); //convert to int

		grade.setScore(score);			//call the method to set the score
		grade.assginGrade();			//call the method to assign the grade
		
		//build the output message
		message =  "Your score is " + score + " and grade is " + 
				   grade.getGrade() + "\n" +
				   "Number of A in the class: " + grade.getACount() + "\n" +
				   "Number of B in the class: " + grade.getBCount() + "\n" +
				   "Number of C in the class: "	+ grade.getCCount() + "\n" +
				   "Number of D in the class: " + grade.getDCount() + "\n" +
				   "Number of F in the class: " + grade.getFCount();
		
		//output the message
		JOptionPane.showMessageDialog(null, message);
		//update the loop variable
		choice = JOptionPane.showInputDialog("Continue (y/n)?: ");
		
		}   //end of while
	}		//end of main()
}			//end of GradeSwitchApp class
