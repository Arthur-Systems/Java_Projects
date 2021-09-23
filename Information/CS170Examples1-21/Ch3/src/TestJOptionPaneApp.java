//Demo of testing the methods of JOptionPane
import javax.swing.JOptionPane;

public class TestJOptionPaneApp {
public static void main(String[] args) {

		//test the first method listed in 3.11 with one argument
		String str = JOptionPane.showInputDialog("Please enter a number: ");

		//test the second one with 2 arguments. "120" should be the default entry
		str = JOptionPane.showInputDialog("Please enter a number: ", "120");

		//test the fourth one with 4 arguments
		str = JOptionPane.showInputDialog(null, "Please enter a number: ",
				"Input windows",
				-1);  //int -1 can be JOptionPane.PLAIN_MESSAGE

		//test the fifth one with 2 arguments
		JOptionPane.showMessageDialog(null, "This is another testing.");

		//test the sixth one with 4 arguments;
		//the JOptionPane.QUESTION_MESSAGE can be 3
		JOptionPane.showMessageDialog(null, "Testing..... " + str,
										"Testing Window",
										JOptionPane.QUESTION_MESSAGE );
		//test the last one: showConfirmDialog()
		JOptionPane.showConfirmDialog(null, "Make a choice: ");
	} //end of main()
} //end of TestJOptionPaneApp