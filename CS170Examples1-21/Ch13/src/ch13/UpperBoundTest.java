package ch13;
//package ch13;

//demo: use of upper bound wildcard <? extends Item>

import java.util.*;

public class UpperBoundTest {
	public static void main(String[] args) {

	List<Book2> bList = new ArrayList<Book2>();
	bList.add(new Book2("Java", 5.5, "ABC"));	
	bList.add(new Book2("JSPS", 10.89, "Lulu.com"));
	List<? extends Item> list = new ArrayList<Book2>(bList);
	Test2.printList(list);

	List<Item> iList = new LinkedList<Item>();

	iList.add(new Item("software"));
	iList.add(new Item("hardware"));

	Test2.printList(iList);
  }
}
/*
class Item {
	protected String name;

	Item(String name) {
			this.name = name;
		}
	public String toString() {
		return "Name: " + name;
	}
}

class Book2 extends Item {
	private int  quantity;

	public Book2(String name, int quantity)  {
		super(name);
		this.quantity = quantity;
	}
	public String toString() {
		return super.toString() + "\nQuantity: " + quantity;
	}
}
*/
class Test2  {
	static   void printList(List<? extends Item> c) {
				for(Item item : c)
				 	System.out.println(item);
	}
}