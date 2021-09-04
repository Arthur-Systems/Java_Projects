package ch10;
//Use of Regular Expressions to validate data
import java.util.Scanner;

public class RegexValidator {
	//validateEmail() method
	public static String validateEmail(Scanner sc, String prompt) {
		boolean isValid = false;
		String email = null;
		String emailPattern = "(\\w+)(.\\w+)*@(\\w+\\.)(com|edu|net|org|gov)(.[a-z]{2})?";

		while(!isValid) {
			try {
		 		System.out.print(prompt);
		 		email = sc.nextLine();

				if (email.equals(""))
					throw new NullPointerException();
				else {
					//email = sc.next();
					System.out.println("\nyou entered: " + email);

					if (email.matches(emailPattern))
					  isValid = true;
					 else
					  throw new Exception();
				}
			  }		//End of try
			catch (NullPointerException e) {
				System.out.println("\nYou are in the email verification...");
			 }
			catch (Exception e) {
				System.out.println("\ninvalid email. check your entry and try again...");
			 } 	 					//End of catch
			} 	 					//End of while
		  return email;
		}							//End of validateEmail()

	//validateSSN()
	public static String validateSNN(Scanner sc, String prompt) {
		boolean isValid = false;
		String ssn = null;

		String ssnPattern = "(\\d)+{3}-(\\d)+{2}-(\\d)+{4}";

		 while(!isValid) {
		  try {
		  		 		System.out.println(prompt);

		  		 		ssn = sc.nextLine();

		  				if (ssn.equals(""))
		  					throw new NullPointerException();
		  				else {
		  					System.out.println("\nyou entered: " + ssn);

		  					if (ssn.matches(ssnPattern))
		  					  isValid = true;
		  					 else
		  					  throw new Exception();
		  				}

		  			  }
		  			catch (NullPointerException e) {

		  				System.out.println("\nYou are in the SSN verification...");

		  			 }
		  			catch (Exception e) {
		  				System.out.println("\ninvalid SNN. check your entry and try again...");
		  			 }
		  			}
		  	return ssn;
		}					//End of validateSNN()

	//validatePhoneNumber()
	public static String validatePhoneNumber(Scanner sc, String prompt) {
	  boolean isValid = false;
	  String phoneNumber = null;

	  String phonePattern = "[1-9][0-9]+{2}-[1-9][0-9]+{2}-(\\d)+{4}|(\\([1-9][0-9]+{2}\\))[1-9][0-9]+{2}-(\\d)+{4}";

	  while(!isValid) {
		try {
		  System.out.println(prompt);

		  phoneNumber = sc.nextLine();

		  if (phoneNumber.equals(""))
		 	throw new NullPointerException();
		  else {
			System.out.println("\nyou entered: " + phoneNumber);

		    if (phoneNumber.matches(phonePattern))
				  isValid = true;
		    else
			  throw new Exception();
		  }
		}
		catch (NullPointerException e) {
			System.out.println("\nYou are in the phone number verification...");
		}
		catch (Exception e) {
			System.out.println("\ninvalid phonenumber. check your entry and try again...");
		}
	 }
	return phoneNumber;
   }
}						//End of RegexValidator
