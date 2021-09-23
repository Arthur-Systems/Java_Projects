//Manager3 class inherits Employee3

import java.util.*;

public class Manager3 extends Employee3 {
   protected double salary;

   public Manager3( String name, double salary) {
      super( name );  // call superclass constructor
      this.salary = salary;
   }

   public double payment() { return salary; }	//override the method to return salary


   public String toString() {	//override the method to print the name
      return "Manager: " + getName();
   }

   public void print() {		//override print()
	   super.print();
	   System.out.print("Salary: " + currencyFormat(Locale.US).format(payment()) + "\n");
	}
 }