package ch13;
//package ch13;

//demo: use of HashSet

import java.util.*;

public class HashSetTest {
	public static void main(String[] args) {

	HashSet mySet = new HashSet();						//Create a collection with 16 elements; type safety   is not checked
	HashSet<Character> set = new HashSet<Character>();	//Create a collection of Character type with size of 16
	HashSet<String> hisSet = new HashSet<String>(9);	//Create a collection of String type with size of 9
	Collection<Double> yourSet = new HashSet<Double>();	//Create a collection of Double type with size of 16
	Collection<?> herSet = new HashSet(mySet);		 	//Create a collection that has all elements from mySet
	hisSet.add("Wang");
	hisSet.add("45");

	herSet = new HashSet<String>(hisSet);
	System.out.println("herSet = " + hisSet);

	if(!mySet.add("Java"))
		System.out.println("the element is aready in the set.");
	else
		System.out.println("the element has been successfully added into the set.");
  }

}
