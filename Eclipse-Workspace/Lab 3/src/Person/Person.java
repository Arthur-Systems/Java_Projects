package Person;
/*
Name: Haichuan Wei
Course: CS125
Lab #: Lab Three
Submission Date: 10/29/2021
Brief Description: this file hosts the super class person and defines the methods.
*/

public class Person { //Start of class Person
    private String name;
    private String address;
    private String phoneNumber; //variables
    
    public Person(String name, String address, String phoneNumber) { // constructor
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public Person(String name, String address) { // overloaded constructor
        this.name = name;
        this.address = address;
    }
    public Person(String name) { // overloaded constructor
        this.name = name;
    }
    public Person() { //default constructor
        this.name = "";
        this.address = "";
        this.phoneNumber = "";
    }
    public String setName() { //sets name
        return name;
    }
    public String getName() { //gets name
        return name;
    }
    public String getAddress() { //gets address
        return address;
    }
    public void setAddress(String address) { //sets address
        this.address = address;
    }
    public String getPhoneNumber() { //gets phone number
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) { //sets phone number
        this.phoneNumber = phoneNumber;
    }

} //End of class Person
