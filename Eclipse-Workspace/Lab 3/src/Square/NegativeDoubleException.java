/*
Name: Haichuan Wei
Course: CS125
Lab #: Lab Three
Submission Date: 10/29/2021
Brief Description: this is the exception class for negative double it will be thrown when the user input a negative number
*/
package Square;
import javax.swing.JOptionPane;
public class NegativeDoubleException extends Exception {
   public NegativeDoubleException() {
      JOptionPane.showMessageDialog(null, "Negative number is not allowed");
   }

   public NegativeDoubleException(String message) {
      super(message);
   }

   
}//end of NegativeDoubleException.java