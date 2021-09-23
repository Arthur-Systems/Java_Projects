package ch13;
//package ch13;

//demo: use of binarySearch()

import java.util.*;

public class BinarySearchTest {
	public static void main(String[] args) {


		List<Integer> iList = new LinkedList<Integer>();
		iList.add(88);
		iList.add(888);
		iList.add(8);

		Collections.sort(iList);
		int index = Collections.binarySearch(iList, 88);

		System.out.println("iList = " + iList);
		System.out.println("index of 88 = " + index);

		List<Items> list = new LinkedList<Items>();
		Items myItem = new Items(100, "software");
		Items hisItem = new Items(10, "hardware");
		Items herItem = new Items(15, "middleware");

		list.add(myItem);
		list.add(hisItem);
		list.add(herItem);

		//Collections.sort(list, new NumberComparator());
		index = Collections.binarySearch(list, hisItem, new NumberComparator());

		System.out.println("list = " + list);
		System.out.println("index of number in hisItem = " + index);
  }
}