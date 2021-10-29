package Person;
/*
Name: Haichuan Wei
Course: CS125
Lab #: Lab Three
Submission Date: 10/29/2021
Brief Description: This file is the driver file. It contains the main method. All data is hard coded.
*/
public class InheritanceApp { //start Diver Class 

	public static void main(String[] args) { //start main method
		// TODO Auto-generated method stub
		Person p = new Person("John", "123 Run drive" , "123-456-7890");//create a new person object
		System.out.println(); // print a blank line
		System.out.println(p.getName()); //print the name of the person
		System.out.println(p.getPhoneNumber());//print the phone number of the person
		System.out.println(p.getAddress());//print the address of the person
		System.out.println();
		Person p2 = new Person("Jane",  "123 Run drive");//constructor overloading
		System.out.println(p2.getName());
		System.out.println(p2.getAddress());
		System.out.println();
		Person p3 = new Person("Jill");//constructor overloading
		System.out.println(p3.getName());
		Customer c2 = new Customer("Bob", "123-456-7890", "123 Run drive", 2048 ,false ); //create a new customer object
		System.out.println();
		System.out.println(c2.getName());
		System.out.println(c2.getPhoneNumber());
		System.out.println(c2.getAddress());
		System.out.println("Customer Number: "+ c2.getCustomerNumber());
		System.out.println(c2.getMailingList());
		Customer c = new Customer("Bill", 3089 ,true ); //constructor overloading
		System.out.println();
		System.out.println(c.getName());
		System.out.println("Customer Number: " +c.getCustomerNumber());
		System.out.println(c.getMailingList());
	} //end main method

}//end Diver Class
