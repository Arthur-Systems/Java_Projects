package ch13;
//package ch13;
//demo: use of HashMap and TreeMap

import java.util.*;

public class MapTest {
	public static void main(String[] args) {

	HashMap myMap = new HashMap(10); //Size 10 and type safety is not checked
	HashMap<String, String> phonebook = new HashMap<String, String>();  //Size 16 String type

	phonebook.put("Lee", "510-666-9900");
	phonebook.put("Smith", "408-322-2277");

	String oldValue = phonebook.put("Lee", "925-333-5566");
	System.out.println("old value = " + oldValue);

	System.out.println(phonebook.containsKey("Smith"));
	System.out.println(phonebook.containsValue("510666-9900"));

	String phone = phonebook.get("Lee");
	System.out.println(phone);

	Set<String> phoneKeySet;
	phoneKeySet = phonebook.keySet();

	for(Iterator iterator = phoneKeySet.iterator(); iterator.hasNext();)
			System.out.println(iterator.next());

	System.out.println(phoneKeySet);

	Collection<String> phoneValues = phonebook.values();

	for(Object value : phoneValues)
		System.out.println(value);

	TreeMap treeMap = new TreeMap();
	TreeMap<String, String> emailMap = new TreeMap<String, String>();
	emailMap.put("zhao123@yahoo.com", "Zhao Xiao");
	emailMap.put("qian_li@hotmail,com", "Li Qian");

	String firstKey = emailMap.firstKey();
	System.out.println("first key = " + firstKey);

	String lowerKey = emailMap.lowerKey("zhao123@yahoo.com");
	System.out.println("lower key = " + lowerKey);

	String value = emailMap.get("Zhao Xiao");
	System.out.println("value = " + value);

	System.out.println(emailMap);

	TreeMap<String, String> productMap = new TreeMap<String, String>(new CodeComparator());
	productMap.put("Java", "JDK1.70 with a new IDE");
	productMap.put("1111", "Solaris Server");

	System.out.println(productMap);
  }
}

class CodeComparator implements Comparator {
	public int compare(Object key1, Object key2) {

		int flag = key1.toString().compareTo(key2.toString());

		return -flag;
	}
}
