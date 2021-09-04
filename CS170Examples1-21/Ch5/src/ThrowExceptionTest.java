/*
 * Demo:  Use of throw to handle the exceptions
 */

/**
 *
 * @author YGao
 */
import java.util.*;
import javax.swing.*;

public class ThrowExceptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = 0.0;

        //Use of throw to handle invalid double data
        try {
           System.out.println("Please enter a price: ");
           if (sc.hasNextDouble())		//if data is a double
	      price = sc.nextDouble();
           else	 {//otherwise use of throw to throw an object of Exception
        	  sc.close();
              throw new InputMismatchException("Invalid price entry. Please enter a double." ); 
           }
         }
         catch (InputMismatchException e) {
	   System.out.println(e);
         }

        //Use of throw to handle the data out of range execption
        String ageString = "";
        int age = 0;
        try {
	 ageString = JOptionPane.showInputDialog("Please enter your age: ");
	 age = Integer.parseInt(ageString);
	 if (age < 0 ) 					//Age less than min
            throw new Exception("Age less than 0 error!  Please try again.");
         else if (age > 199) 		             	//Age great than max
	   throw new Exception("Age greater than 199 error!  Please try again.");
        }
        catch (NumberFormatException e) {
	    System.out.println("Invalid entry.  Please enter an integer as your age." );
        }
        catch (Exception e) {
	    System.out.println(e);
        }
     }
 }
