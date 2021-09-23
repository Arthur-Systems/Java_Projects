//Demo: implements AccountPayable and Printable interfaces

import java.text.*;
import java.util.*;

public class Employee3 implements AccountPayable, Printable {
   private String name;

   // Constructor
   public Employee3(String name ) {
      this.name = name;
   }

   public String getName()
      { return name; }

   public double payment(){return 0.0;}

   public void print() {		//implements print()
	   System.out.print("Name: " + name + "\t");
	}
   public NumberFormat currencyFormat(Locale locale) {	//implements currencyFormat()
	   NumberFormat currency = NumberFormat.getCurrencyInstance(locale);
	   return currency;
   }
  }
