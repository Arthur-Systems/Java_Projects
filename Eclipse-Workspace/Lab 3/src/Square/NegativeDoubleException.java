package Square;
import java.util.*;
import javax.swing.JOptionPane;
//NegativeDoubleException to handle the negative data exception.
public class NegativeDoubleException extends Exception {
   //You are required to use methods of JOptionPaneto accept data entry, display the error messages and code a separate method for displaying results including side length, perimeter, and the area using JOptonPane.
    public NegativeDoubleException() {
        JOptionPane.showMessageDialog(null, "Please enter a positive number.");
    }

}
//end of SquareException.java