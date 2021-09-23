//Demo: implements Printable interface

import java.text.*;
import java.util.*;

public class Employee2 implements Printable {
   private String name;

   // Constructor
   public Employee2(String name ) {
      this.name = name;
   }

   public String getName()
      { return name; }

   public   double earnings(){return 0.0;}

   public void print() {		//implements print()
	   System.out.print("Name: " + name + "\t");
	}
   public NumberFormat currencyFormat(Locale locale) {	//implements currencyFormat()
	   NumberFormat currency = NumberFormat.getCurrencyInstance(locale);
	   return currency;
   }
  }
