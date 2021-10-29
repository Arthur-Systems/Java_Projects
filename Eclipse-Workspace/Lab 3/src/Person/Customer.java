package Person;


public class Customer extends Person {

   
    private int customerNumber;
    private boolean mailingList;
    public Customer(String firstName, String lastName, int customerNumber, boolean mailingList) {
        super(firstName, lastName);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }
    public int getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
    public boolean isMailingList() {
        return mailingList;
    }
    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }
  

}