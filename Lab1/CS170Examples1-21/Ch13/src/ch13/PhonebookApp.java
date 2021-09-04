package ch13;
//package ch13;

//Driver code for Phonebook application using TreeMap and file I/O

import java.io.*;
import javax.swing.JOptionPane;

public class PhonebookApp {
	public static void main(String[] args) throws IOException{
		String again = "y";

		Phonebook phonebook = new Phonebook();
		while(again.matches("[y|Y]")) {
			String choice = phonebook.makeChoice();
			switch (Integer.parseInt(choice)) {

				case 1: phonebook.addRecord();
						break;
				case 2: phonebook.search();
						break;
				case 3: phonebook.goodBye();
		 	}
		again = JOptionPane.showInputDialog(null, "Continue? (y/n): ");
	 	}
	 	phonebook.goodBye();
  	}
}

