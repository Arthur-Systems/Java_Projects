package ch12;


//Demo:  Anonmous class

public class AnonmousClassTest {
	   public static void main( String args[] ) {

		    System.out.println(new Object() {		//Anonmous class
								   public String toString() {
									   return "toString() in Object class will return the address of " +
									           super.toString();
								   }
							   });
		}
	}
