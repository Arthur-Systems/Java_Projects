package ch11;

//Demo of exception propagation

import java.io.*;



public class ExceptionTesterApp
{
  public static void main(String[] args) //throws IOException
  {
      System.err.println("In main: calling Method1.");
      Method1();
      System.err.println("In main: returned from Method1.");
  }

  public static void Method1() //throws IOException
  {
      System.err.println("\tIn Method1: calling Method2.");

     try
      {
      Method2();
      }
      catch (IOException e)
      {
          System.err.println("File 'products.ran' not found!");

      }

      System.err.println("\tIn Method1: returned from Method2.");
  }

  public static void Method2() throws IOException
  {
      System.err.println("\t\tIn Method2: calling Method3.");
      Method3();
      System.err.println("\t\tIn Method2: returned from Method3.");
  }

  public static void Method3() throws IOException
  {
      System.err.println("\t\t\tIn Method3: Entering.");

      //Add code to throw an exception here.
      /*
      int zero = 0;
      int wrongGuy = 12/zero;
      * */

      RandomAccessFile in = new RandomAccessFile("products.ran","r");
      /* when the program hits this checked exception, it doesn't continue on. Instead,
       * it throws the exception back to method 2, and 1 and be caught there. And then it
       * continues the rest of the method 1 code and exits the program.
       */

      System.err.println("\t\t\tIn Method3: Exiting.");
      
      in.close();  //Close the file
  }
}