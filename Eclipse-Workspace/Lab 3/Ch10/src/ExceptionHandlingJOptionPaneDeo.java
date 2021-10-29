//Demo:  Exception handling for parseXxx() of JOptionPane

import javax.swing.JOptionPane;

public class ExceptionHandlingJOptionPaneDeo {

	public static void main(String[] args) {
		String strGrade;
		int grade;
		
			
		try {		//Exception handing code
			strGrade = JOptionPane.showInputDialog("Please enter a grade: ");
			grade = Integer.parseInt(strGrade);  //Will throw NumberFormatException automatically
			grade = grade + 10;  				//Some computing...
			
			JOptionPane.showMessageDialog(null, "Grade: " + grade);
		}   //End of try
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Incorrect grade entry, please try again...");
		}   //End of catch
	}
}
