package Square;
import javax.swing.JOptionPane;
//NegativeDoubleException to handle the negative data exception.
public class NegativeDoubleException extends Exception {
   public NegativeDoubleException() {
      JOptionPane.showMessageDialog(null, "Negative number is not allowed");
   }

   
   
}


//end of SquareException.java