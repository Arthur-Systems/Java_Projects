package ch11;

//Demo:  Checked exception handling

import java.io.*;

public class CheckedExceptionTest{
   public static void main(String[] args) throws FileNotFoundException {

   try{
	  RandomAccessFile in = new RandomAccessFile("books.dat", "r");

     }

    catch(FileNotFoundException e){
      System.out.println("File is not found in the directory....");
      
      System.exit(0);
 	}
   
   }
}