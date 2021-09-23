package ch13;
//package ch13;
//demo: use of both upper and lower bound wildcard

import java.util.*;

public class WildcardCopyTest {
	public static void main(String[] args) {
	List<String> str1 = Arrays.asList("abc", "xyz");
	List<String> str2 = Arrays.asList("11");
	LowerAndUpperBound.copy(str1, str2);

	System.out.println(str1);

	List<Object> objs = Arrays.<Object>asList(1, 2.89, "three");
	List<Integer>  ints = Arrays.asList(100);
	LowerAndUpperBound.copy(objs, ints);

	System.out.println(objs);

	List<Item> items = Arrays.<Item>asList(new Item("Java"), new Item("JSPS"));

	List<Book2> books = Arrays.<Book2>asList(new Book2("J2EE", 100.89, "Bot Publishing"));
	LowerAndUpperBound.copy(items, books);

	System.out.println(items);
  }
}