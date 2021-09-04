package ch10;
//demo: driver for Iterm sorting
import java.util.Arrays;

public class ItemSortTest {
   public static void main( String args[] ) {

		Item[] items = new Item[4];
		items[0] = new Item(25, "Java");
		items[1] = new Item(100, "JSP");
		items[2] = new Item(12, "Servlets");
		items[3] = new Item(88, "JDBC");

		Arrays.sort(items);

		for (Item item : items)
      	 	System.out.println(item.getNumber() + "\t" + item.getName() );
   }
}


