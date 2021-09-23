package ch10;

//StringBuilderFormatter class using StringBuilder to format a string

public class StringBuilderFormatter {

		StringBuilder formatter(String message) {
			int phoneIndex = 0,
			    lastNameIndex = 0;
			StringBuilder str = new StringBuilder(message);
			//find the index of ending person's name
			for(int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != ' ' && str.charAt(i) != '.' && str.charAt(i) < 'A') {  // find the starting location of phone number
				  phoneIndex = i;
				  break;
			  	}
			 }

			 for(int i = phoneIndex; i >= 0; i--) { //find the beginning of the last name
			  if (str.charAt(i) == ' ') { // find the beginning of the last name
			    lastNameIndex = i+1;
			    break;
			  }
		   	}

		   	String lastName = str.substring(lastNameIndex, phoneIndex);  //have the last name
		   	lastName += ", ";			//add a camma and a space after the last

		   	str.insert(phoneIndex, " (");	//formatting phone number
		   	str.insert(phoneIndex+5, ")");
		   	str.insert(phoneIndex+9, "-");

			str.delete(lastNameIndex, phoneIndex);
		   	str.insert(0, lastName);	//insert last name at the beginning

		   	return str;
	   }
}
