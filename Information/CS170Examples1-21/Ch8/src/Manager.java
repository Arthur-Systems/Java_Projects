//Manager class derived from Employee

public class Manager extends Employee {
   protected double salary;

   public Manager( String name, double salary) {
      super( name );  // call superclass constructor
      this.salary = salary;
   }

   public double earnings() { return salary; }	//override the method to return salary


   public String toString() {	//override the method to print the name
      return "Manager: " + getName();
   }
}

