package ch10;
//Demo: Iterm class implements Comaprable interface for sorting

public class Item implements Comparable {
   private int number;
   private String name;

   Item(int number, String name) {
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

  public int compareTo(Object object) {
	  Item item = (Item) object;
	  if (this.number < item.getNumber())
	    return -1;

	  if (this.number > item.getNumber())
	    return 1;

	  return 0;
  }
//The following can be used to compare the names instead of numbers
/*
  public int compareTo(Object object) {
	  Item item = (Item) object;

	  return this.name.compareTo(item.getName());

	  //return 0;
  }
 */
 }
