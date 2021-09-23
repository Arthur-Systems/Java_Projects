package ch10;
//Example of Command line execution with arguments
//Enter two integers when it's executing in command line

public class CommandLineTest{
   public static void main(String[] args) {

	   int x = Integer.valueOf(args[0]);
	   int y = Integer.valueOf(args[1]);

	   System.out.println("x * y = " + x*y);
   }
}

