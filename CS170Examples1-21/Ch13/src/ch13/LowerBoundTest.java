package ch13;
//package ch13;
//demo: use of lower bound wildcard <? super Book2>
import java.util.*;

public class LowerBoundTest {
	public static void main(String[] args) {

	List<Item> iList = new ArrayList<Item>();
	iList.add(new Item("software"));
	iList.add(new Item("hardware"));

	List<? super Book2> list = new ArrayList<Item>(iList);
	Test3.printList(list);

	List<Book2> bList = new ArrayList<Book2>();
	bList.add(new Book2("Java", 89.90, "ABC"));
	bList.add(new Book2("JSPS", 100.98, "Bot Publishing"));
	Test3.printList(bList);
  }
}

class Test3  {
	static void printList(Collection<? super Book2> c) {
		for(Object item : c)
		 	System.out.println(item);
	}
}