package ch13;
//package ch13;

//demo: driver for Items sorting using NumberComparator

import java.util.*;

public class ItemsSortTest {
   public static void main( String args[] ) {

		List<Items> list = new LinkedList<Items>();			//Create a collection

		Items myItem = new Items(100, "software");				//Create the objects
		Items hisItem = new Items(10, "hardware");
		Items herItem = new Items(15, "middleware");

		list.add(myItem);									//Add elements
		list.add(hisItem);
		list.add(herItem);

		Collections.sort(list, new NumberComparator());		//Call sort()

		System.out.println(list);
   }
}

