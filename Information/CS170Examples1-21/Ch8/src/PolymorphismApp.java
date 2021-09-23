// Driver for Employee hierarchy
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class PolymorphismApp {
   public static void main( String[] args )
   {
      Employee[] ref = new Employee[3];  // superclass reference
      String output = "";

      Manager manager = new Manager( "Wang", 5800.00 );
      SeniorManager senior = new SeniorManager( "Smith", 6250.0, 1500.0);
      RegularWorker regular = new RegularWorker( "Lee", 2980.00, 270.0);

      DecimalFormat precision2 = new DecimalFormat( "0.00" );

      ref[0] = manager;  // Employee reference to a manager

      ref[1] = senior;  // Employee reference to a senior manager

      ref[2] = regular;  // Employee reference to a regular Worker

      for(int i = 0; i < 3; i++)  //polymorphically form output for different objects
        output += ref[i].toString() + " earned $" +
                precision2.format( ref[i].earnings() ) + "\n";

      JOptionPane.showMessageDialog( null, output,
         "Demonstrating Polymorphism",
         JOptionPane.INFORMATION_MESSAGE );
   }
}
