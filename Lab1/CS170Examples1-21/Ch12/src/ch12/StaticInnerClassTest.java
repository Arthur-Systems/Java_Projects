package ch12;
//Demo: use of static inner class

public class StaticInnerClassTest {
   public static void main( String args[] ) {
	    OuterClass2 outer = new OuterClass2();
	    OuterClass2.StaticInnerClass.innerMethod();

	    OuterClass2.outerMethod();

	    OuterClass2.StaticInnerClass staticInner = new OuterClass2.StaticInnerClass();
	    int num = staticInner.innerMethod2();
	}
}

class OuterClass2 {

	private double x = 0.0;

    static private int n = 10;

    static protected void outerMethod() {

		System.out.println("from OuterClass...");
	}
	void outerMethod2() {
		System.out.println("from OuterClass¡¯ instance method2()...");
	}

    static class StaticInnerClass {
		static private int m = 5;

    	static void innerMethod() {
			int sum;
			n = 20;
			sum = n + m;

  	 		System.out.println("from InnerClass sum = " + sum);

  	 		outerMethod();
   	 	}
   	 	int innerMethod2() {
			n = 100;
  	 		outerMethod();
			System.out.println("from InnerMethod2() n = " + n);
			return n;
		}
   }		// end of static inner class
}			// end of outer class