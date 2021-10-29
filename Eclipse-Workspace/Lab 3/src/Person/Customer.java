package Person;
/*
Name: Haichuan Wei
Course: CS125
Lab #: Lab Three
Submission Date: 10/29/2021
Brief Description:  This file is a subset of the person class and is used to create customer.
*/
public class Customer extends Person { //start of class Customer

    private int customerNumber; 
    private boolean mailingList; //variable declaration
    public Customer(String name, String address, String phoneNumber , int customerNumber, boolean mailingList) { //constructor
        super(name , address , phoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }
    public Customer(String name, String address, String phoneNumber, int customerNumber) { //constructor
        super(name , address , phoneNumber);
        this.customerNumber = customerNumber;
    }
    public Customer(String name, int customerNumber, boolean mailingList) { //constructor
        super(name);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }
   
    public int getCustomerNumber() { //gets customer number
        return customerNumber;

    }
    public boolean getMailingList() { //gets mailing list
        if (mailingList == true) {
            System.out.println("Customer " + getName() + " is on the mailing list.");
        }
        else {
            System.out.println("Customer " + getName() + " is not on the mailing list.");
        }
        return mailingList;
    }
    public void setCustomerNumber(int customerNumber) { //sets customer number
        this.customerNumber = customerNumber;
    }
    public void setMailingList(boolean mailingList) { //sets mailing list
        this.mailingList = mailingList;

    } 

}//end of class Customer