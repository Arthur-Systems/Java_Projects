//RegularWorker2 inherits Employee2
import java.util.*;

public class RegularWorker2 extends Employee2 {
   protected double salary, overtimePay;

   public RegularWorker2( String name, double salary, double overtimePay) {
      super( name );  // call superclass constructor
      this.salary = salary;
      this.overtimePay = overtimePay;
   }

   public double earnings() { return salary + overtimePay; }	//override the method to return salary

   public String toString() {	//override the method to print the name
      return "Regular worker: " + getName();
   }
   public void print() {		//override print()
	   super.print();
	   System.out.println("Salary: " + currencyFormat(Locale.CHINA).format(earnings()) + "\n");
   }
}
