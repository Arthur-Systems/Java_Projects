
/*
 *Demo: Use of methods in Scanner class to validate data
 */

import javax.swing.*;
import java.util.*;

public class TestValidationApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double price = 0.0;
        int quantity = 0;
        boolean notDone = true;
        Scanner sc = new Scanner(System.in);	    //Create object of Scanner
        while (notDone) {
            //Prompt user to enter a price 
            System.out.print("Please enter the price: ");
            if (sc.hasNextDouble() )		         //It’s a valid entry 
                price = sc.nextDouble(); 		 //Get the data
            else	{				 //It’s an invalid entry 
                sc.nextLine();				 //Clear the buffer
                JOptionPane.showMessageDialog(null, "Input error. Enter a price …");
                continue;				 // Continue the loop
               }
            System.out.print("Please enter the quantity: ");	  //Prompt user to enter
            if (sc.hasNextInt() )			  //It’s a valid entry
                quantity = sc.nextInt(); 		  //Get the data
            else	{				  //It’s an invalid data
                sc.nextLine();				  //Clear the buffer
                JOptionPane.showMessageDialog(null, "Input error.  Enter an integer…");
                continue;						//Continue loop
            }
        System.out.println("Price is: " + price + " Quantity is: " + quantity);
      }
      sc.close();  //Close the scanner
    }
}
