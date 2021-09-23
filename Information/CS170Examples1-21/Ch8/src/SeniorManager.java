//SeniorManager class derived from Manager

public final class SeniorManager extends Manager {
   private double meritPay;

   public SeniorManager( String name, double salary, double meritPay) {
      super( name, salary );  // call superclass constructor
      this.meritPay = meritPay;
   }

   public double earnings() { return salary + meritPay; }	//override the method to return salary


   public String toString() {	//override the method to print the name
      return "Senior Manager: " + getName();
   }
}