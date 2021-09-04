package ch13;
//package ch13;
//Programmer-defined class for demo in sorting

import java.util.Comparator;

class Items {
	   private int number;
	   private String name;

	   Items(int number, String name) {
		   this.number = number;
		   this.name = name;
	   }

	   public void setNumber(int number) {
		   this.number = number;
	   }
	   public int getNumber() {
		   return number;
	   }
	  public void setName(String name) {
	  	   this.name = name;
	     }
	     public String getName() {
	  	   return name;
	   }

	  public String toString()  {
		  return "Number: " + number + " Name: " + name;
	  }
	 }
class NumberComparator implements Comparator<Items>  {
	 	public int compare(Items Item1, Items Item2) {

			if (Item1.getNumber() < Item2.getNumber())  //Sorting number in natural way
			  return -1;

			 if (Item1.getNumber() > Item2.getNumber())
			  return 1;

	 		return 0;
	 	}
	 }
