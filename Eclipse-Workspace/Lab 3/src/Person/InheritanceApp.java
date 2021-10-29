package Person;

public class InheritanceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person("John", "Doe", "123-456-7890");
		System.out.println(p.getName());
		System.out.println(p.getPhoneNumber());
		System.out.println(p.getAddress());

		Customer c = new Customer("Bill", "Smith", 2048 ,true );
		System.out.println(c.getName());
		System.out.println(c.getCustomerNumber());
		System.out.println(c.getAddress());
		System.out.println(c.isMailingList());

		
		


	}

}
