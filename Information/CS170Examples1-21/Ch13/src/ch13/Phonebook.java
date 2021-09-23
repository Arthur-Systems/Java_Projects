package ch13;
//package ch13;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

class Phonebook {
	private String name,
				   phone;
	Map<String, String> phones;
	public Phonebook() throws IOException {
		name = phone = null;

		phones = new TreeMap<String, String>(); 	//name or email - phone
		readPhonebooks();
	}
	public String makeChoice() {
		String choice = null,
		       message = "Welcome to phonebook...\n"
			                 + "Enter 1 for add phone record\n"
			                 + "Enter 2 for search phone number\n"
			                 + "Enter 3 for exit\n";
	    boolean done = false;
	    while (!done) {
			choice = JOptionPane.showInputDialog(null, message);
			if (choice.matches("[1|2|3]"))
			 done = true;
			else
			 JOptionPane.showMessageDialog(null, "Wrong choice.  Please try again...");
		 }
		 return choice;
	}
	private void readPhonebooks() throws IOException{

		File phoneData = new File("C:\\Users\\ygao\\Documents\\NetBeansProjects\\JavaArtCh13\\src\\ch13\\phones.txt");

		 BufferedReader in = new BufferedReader(
                          new FileReader(phoneData));
		String line = in.readLine();
		while(line != null){
		   StringTokenizer token = new StringTokenizer(line, "\t");

		   name = token.nextToken();
		   phone = token.nextToken();
		   phones.put(name, phone);
		   line = in.readLine();
		 }
      	 in.close();

      	 System.out.println("phones: " + phones);
	 }

	public void displayNames() {
			System.out.println(phones);
	}
	public void addRecord() throws IOException {
		String message = null;
		 name = JOptionPane.showInputDialog(null, "Please enter the name: ");
		 phone = JOptionPane.showInputDialog(null, "Please enter the phone number: ");

		processDuplicate();

		phones.put(name, phone);
		updatePhonebooks(name, phone);

		message = "The following record has been added to the phonebook: \n"
								+ "Name/Email: " + name + "\n"
								+ "Phone number: " + phone + "\n";
		JOptionPane.showMessageDialog(null, message);
	}

	public void processDuplicate() {
		String email = null,
			   message = null,
			   choice = null;

		while(phones.containsKey(name)) {
			message = "There is a duplicated name in the phonebook...\n"
					 			+ "Enter 1 to use other name\n"
		 						+ "Enter 2 to use email: ";
		 	choice = JOptionPane.showInputDialog(null, message);
		 	if (choice.equals("1")) {
				name = JOptionPane.showInputDialog(null, "Enter the new name: ");
			}
			else if (choice.equals("2")) {
				email = JOptionPane.showInputDialog(null, "Enter the email address: ");
				phone = name + " " + phone;
				name = email;
			}
		}
	}

	public void updatePhonebooks(String name, String phone) throws IOException {
		PrintWriter out = new PrintWriter(
                     	  new FileWriter("phones.txt", true));
        out.println(name + "\t" + phone);

        out.close();
	}
	public void search() throws IOException {
	   String choice = null,
		       message = "Enter the name or email address you want to search the phone #: ",
		       name = JOptionPane.showInputDialog(null, message);

	   if (phones.containsKey(name)) {
		   phone = phones.get(name);
		   display(name, phone);
	   }
	   else {
		   message = "This name or email is not in the phonebook...\n"
		   			 + "Do you want to add into the record? (y/n): ";
		   choice = JOptionPane.showInputDialog(null, message);
		   if (choice.matches("[y|Y]"))
		     addRecord();
		   //else
		   //  goodBye();
		 }
	 }

	public void display(String name, String phone) {
		String message = "Name/Email: " + name + "\n" + "Phone number: " + phone;
		JOptionPane.showMessageDialog(null, message);
	}
	public void goodBye() {
		JOptionPane.showMessageDialog(null, "Thank you for using the phonebook.  Good bye!");
		System.exit(0);
	}

}
