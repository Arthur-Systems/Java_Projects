package ch12;
//Demo: use of autoboxing and autounboxing

//package ch12;

public class AutoboxingTest {
   public static void main( String args[] ) {

	   double y = 9.88;

	   Double myDouble = 10.2 + 2.5 - y;

	   Integer myInt = 88;

	   double z = myDouble.doubleValue();
	    System.out.println("z = " + z);

	   double result = myDouble + 100 + myInt;
	   System.out.println("result = " + result);

	   boolean flag = true;

	   Boolean  myBoolean = true,
	   			yourBoolean = false;

	   flag = myBoolean && yourBoolean;

	   if(flag && myBoolean && yourBoolean)
	     System.out.println("result is true.");
	   else
	     System.out.println("result is false.");

	   Integer n1 = 127;
	   Integer n2 = 127;
	   Integer n3 = 128;
	   Integer n4 = 128;

	   System.out.println(n1 == n2);
	   System.out.println(n3 == n4);
	}
}