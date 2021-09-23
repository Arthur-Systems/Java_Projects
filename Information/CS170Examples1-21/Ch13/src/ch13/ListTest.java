package ch13;
//package ch13;

//demo: use of ArrayList, LinkedList, and Iterator

import java.util.*;

public class ListTest {
	public static void main(String[] args) {
		ArrayList noSafeList = new ArrayList();		//Creat a collection of ArrayList with default size 10 without type safe check
		ArrayList<String> nameList = new ArrayList<String>();	  //Create a String collection of ArrayList with default size 10
		ArrayList<Double> priceList = new ArrayList<Double>(80);  //Create a Double collection with size 80
		ArrayList<Product2> productList = new ArrayList<Product2>();//Create a collection of Product with default size 10
		ArrayList<String> list = new ArrayList<String>(nameList);	  //Create a String collection of another collection called nameList

		noSafeList.add(10);
		noSafeList.add("Java");
		nameList.add("Lee");
		nameList.add("Smith");

		priceList.add(129.65);			//Add an element at the end of the collection
		priceList.add(0, 89.76);		//Add an element at the beginning of the collection

		productList.add(new Product2("1011", "software", 59.85));


		System.out.println(priceList.contains(129.65));

		System.out.println(nameList.get(1));
		System.out.println(nameList.indexOf("Lee"));

		ArrayList<String> list2 = new ArrayList<String>(nameList);	  //list2 has all elements of nameList
		System.out.println(list2.isEmpty());				//Return false


		list2.remove(1);
		list2.set(0, "Lisa");
		System.out.println("Size of list2 = " + list2.size());
		System.out.println("Size of nameList = " + nameList.size());

		System.out.println("nameList contains = " + nameList.contains("Lee"));
		System.out.println("list contains = " + list.contains("Lee"));
		System.out.println("nameList size = " + nameList.size());
		System.out.println("list size = " + list.size());

		Object[] doubleArray = priceList.toArray();			//Return an array
		System.out.println(doubleArray[0]);					//return the first element in the array
		System.out.println(priceList);						//Call pricelist.toString()

		System.out.println("productList = " + productList.toString());


		//Examples in LinkedList
		LinkedList<String> linkedList = new LinkedList<String>(nameList);

		linkedList.addFirst("Jon");
		linkedList.addLast("Duke");
		System.out.println("linkedList = " + linkedList);

		//Object obj = linkedList.getFirst();		//obj = "Jon"
		System.out.println("Last index of \"Lee\" = " + linkedList.lastIndexOf("Lee"));


		Iterator<String> iterator = linkedList.iterator();

		int i = 1;
		while (iterator.hasNext()) {
			System.out.println(i + "th element: " + iterator.next());
			i++;
		}

		for(Iterator it = linkedList.iterator(); it.hasNext();)
			System.out.println(it.next());
  }

}

class Product2 {
	String code;
	String type;
	double price;

	public Product2(String code, String type, double price) {
		this.code = code;
		this.type = type;
		this.price = price;
	}

}
