//Manager2 class inherits Employee2

import java.util.*;

public class Manager2 extends Employee2 {
   protected double salary;

   public Manager2( String name, double salary) {
      super( name );  // call superclass constructor
      this.salary = salary;
   }

   public double earnings() { return salary; }	//override the method to return salary


   public String toString() {	//override the method to print the name
      return "Manager: " + getName();
   }

   public void print() {		//override print()
	   super.print();
	   System.out.print("Salary: " + currencyFormat(Locale.US).format(earnings()) + "\n");
	}
 }