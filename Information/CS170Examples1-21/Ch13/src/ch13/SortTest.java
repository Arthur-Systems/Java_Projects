package ch13;
//package ch13;

//demo: use of sorting algorithm in Collections
import java.util.*;

public class SortTest {
	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(89);
		intList.add(78);
		intList.add(88);

		Collections.sort(intList);

		System.out.println(intList);

		Collections.sort(intList, Collections.reverseOrder());
		System.out.println(intList);

		Collections.reverse(intList);
		System.out.println(intList);

		ArrayList<Double> doubleList = new ArrayList<Double>(); //Create a collection

		doubleList.add(120.99);			//Add elements
		doubleList.add(87.03);
		doubleList.add(89.67);

		System.out.println("Before reverse: " + doubleList);		//Display
		Collections.reverse(doubleList);							//Call resvers()
		System.out.println("After reverse: \t" + doubleList);		//Display result

		Collections.sort(doubleList);								//Call sort()
		System.out.println("After sort: \t" + doubleList);			//Display result

		Collections.sort(doubleList, Collections.reverseOrder());
		System.out.println("After reverse again: \t" + doubleList);

  }
}