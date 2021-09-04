
//RegularWorker class derived from Employee

public class RegularWorker extends Employee {
   protected double salary, overtimePay;

   public RegularWorker( String name, double salary, double overtimePay) {
      super( name );  // call superclass constructor
      this.salary = salary;
      this.overtimePay = overtimePay;
   }

   public double earnings() { return salary + overtimePay; }	//override the method to return salary


   public String toString() {	//override the method to print the name
      return "Regular worker: " + getName();
   }
}


