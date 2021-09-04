package ch13;
//package ch13;

//demo: use of HashMap

import java.util.*;

public class EmployeeMapTest {
	public static void main(String[] args) {


	Map<String, String> employeeMap = new HashMap<String, String>();	//Create an object of HashMap
	employeeMap.put("1110", "Ming Zhu");  //Add element to employeeMap
	employeeMap.put("1115", "John Smith");
	employeeMap.put("1112", "Lee Wong");
	System.out.println("Size of employeeMap:" + employeeMap.size());
	//System.out.println(employeeMap);

	employeeMap.put("1115", "Geo King");
	System.out.println(employeeMap);
  }

}

