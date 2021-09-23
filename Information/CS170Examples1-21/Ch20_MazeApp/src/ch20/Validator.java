package ch20;
import java.lang.NumberFormatException;
import javax.swing.JOptionPane;

public class Validator {
	public static String getString(String prompt){
		System.out.print(prompt); //display prompt
		String s = JOptionPane.showInputDialog(prompt); //accept string
		return s; // return string
	}
	public static String getValidName(String prompt){
		String s = "";  //define and initialize variable
		while (true){    // enter non-ending loop
			s = Validator.getString(prompt); // get string
			try{
				if (s.length() == 0)
					throw new NameException("You must enter your name");
				for (int i = 0; i < s.length(); i++){
					if (s.substring(i, (i+1)).equalsIgnoreCase("1") || s.substring(i, (i+1)).equalsIgnoreCase("2") || s.substring(i, (i+1)).equalsIgnoreCase("3") || s.substring(i, (i+1)).equalsIgnoreCase("4") || s.substring(i, (i+1)).equalsIgnoreCase("5") || s.substring(i, (i+1)).equalsIgnoreCase("6") || s.substring(i, (i+1)).equalsIgnoreCase("7") || s.substring(i, (i+1)).equalsIgnoreCase("8") || s.substring(i, (i+1)).equalsIgnoreCase("9") || s.substring(i, (i+1)).equalsIgnoreCase("0"))
						throw new NameException("Invalid Entry, your name may not contain a number");
				}
				return s;
			}
			catch (NameException e)
			{
				JOptionPane.showMessageDialog(null, e);
			}
			catch (NullPointerException e)
			{
				JOptionPane.showMessageDialog(null, "You must enter your name.");
			}
		}
	}
	public static int getInt(String prompt){
		int i = 0; //define/initialize variables
		String s = "";
		while (true) {
			s = Validator.getString(prompt); // get string
			try {
				i = Integer.parseInt(s);
				return i;
			}
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, e);
				//System.out.println(e + ": Invalid entry! Please try again.\n"); // if not, print err msg
			}
		}
	}
	public static int getIntInRange(String prompt, int min, int max){
		int i = 0; // define/initialize variable
		while (true) {
			i = Validator.getInt(prompt); // get valid int
			try {
				if (i > max || i < min)
					throw new InputRangeException("Error! the input must be between " + min + " and " + max);
				return i;
			}
			catch (InputRangeException e){
				JOptionPane.showMessageDialog(null, e);
			}
		}
	}
}
class InputRangeException extends Exception
{
    public InputRangeException(){}
    public InputRangeException(String message){super(message);}
}
class NameException extends Exception
{
	public NameException(){}
	public NameException(String message){super(message);}
}
