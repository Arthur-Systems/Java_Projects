package ch11;
//Example of programmer-defined exception

import javax.swing.JOptionPane;
 
public class NegativeAgeExceptionTest{
   public static void main(String[] args) { //throws IOException, CustomIOException {

	try{
	   String ageString = JOptionPane.showInputDialog("Enter your age: ");

	   if (Integer.parseInt(ageString) < 0)
	        throw new NegativeAgeException("Please enter a positive age");
	   else
	        JOptionPane.showMessageDialog(null, ageString, "Age", 1);
	}
	catch(NegativeAgeException e){
	    System.out.println(e);
	}
   }
//programmer-defined exception
   static final class NegativeAgeException extends Exception {
	public NegativeAgeException()  {}
	public NegativeAgeException(String message) {
		super(message);
	}
   }
}