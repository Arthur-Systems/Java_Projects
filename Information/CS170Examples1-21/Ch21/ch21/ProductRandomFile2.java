package ch21;


//Product random file I/O class using JFileChooser

import java.io.*;
import java.util.*;
import javax.swing.*;

class ProductRandomFile2 {
	RandomFile productFile;			//Declare objects and data
			Scanner sc;
			private final int ID_LENGTH = 4;		//Product data
			private final int TITLE_LENGTH = 32;
			private final int RECORD_SIZE = 80;	//Standard record length
			private int recordNumber = 0;		//Beginning
			public ProductRandomFile2(String fileName) {	//Constructor
				try {
					productFile = new RandomFile(fileName);//Create
				}
				catch (FileNotFoundException fnf) {
					System.out.println(fnf);
				}
				sc = new Scanner(System.in);
	   		}
	   		public void createData() {				//Create data from file
				String productID;
				String	title;
				double price;
				String choice = "y";
				while (choice.equalsIgnoreCase("y")) {
					try {
					  System.out.println("Write data randomly to the file....");
					  System.out.println("Total records in the file: "
							+ productFile.getLength()/RECORD_SIZE);
					System.out.print("Enter the record number:  ");
					recordNumber = sc.nextInt();
					System.out.print("Product code (4 digits): ");
					productID = sc.next();
					productID = RandomFile.FixedStringLength(productID, 4);
					sc.nextLine();
					System.out.print("Product title (< 32 chars): ");
					title = sc.nextLine();
					title = RandomFile.FixedStringLength(title, 32);
					System.out.print("Product price: ");
					price = sc.nextDouble();
					productFile.setWriteRecordPos(recordNumber, RECORD_SIZE);	//Set the position
					productFile.outString(productID);	//Write out record
					productFile.outString(title);
					productFile.outDouble(price);
					}
					catch(Exception e) {
						sc.nextLine();   			//Clean the buffer
						System.out.println("Input error... \n");
						continue;    				//Return to the loop
					}
					System.out.print("Continue to write data? (y/n): ");
					choice = sc.next();
					System.out.println();
		        }
			}
			public void showData() {			//Read in the data
				double price;
				String choice = "y";
				while (choice.equalsIgnoreCase("y")) {		//Continue the loop
					try {
					System.out.println("Read data randomly from the file...");
					System.out.println("The total records in the file: "
							+ productFile.getLength()/RECORD_SIZE);
					System.out.print("Enter the record number: ");
					recordNumber = sc.nextInt();
					productFile.setReadRecordPos(recordNumber, RECORD_SIZE);
					System.out.println("Product code: "
	                                      + productFile.inString(ID_LENGTH));
	                System.out.println("Product title: "
	                                      + productFile.inString(TITLE_LENGTH));
					price = productFile.inDouble();
					System.out.println("Product price: "
	                                      + Formatter.currency(price));
					}
					catch(IOException ioe) {
						System.out.println(ioe);
					}
					catch(Exception e) {
					   sc.nextLine(); 	//Clean the buffer
					   System.out.println("Record number must be an integer\n");
					   continue;    				//Return to the loop
					}
					System.out.print("Continue to read? (y/n): ");
					choice = sc.next();
					System.out.println();
				}
			}
	   		public void closeFile() {			//Close file
				try {
	     			productFile.closeFile();
				}
				catch(IOException ioe) {
					System.out.println(ioe);
	    			}
		}
	public static String getSelectedFile() {
		JFileChooser fc = new JFileChooser();
		fc.setDialogTitle("Selecting File");
		fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int option = fc.showOpenDialog(null);
		if (option == JFileChooser.APPROVE_OPTION) {	//Selection successful
		     File file = fc.getSelectedFile();
		     String fileName = file.toString();
		     return fileName;
		 }
		 else
		 	return null;
	}

}

