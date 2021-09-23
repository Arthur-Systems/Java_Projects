package ch12;

//Demo: use of inner class

public class InnerClassTest {
 public static void main( String args[] ) {
	    OuterClass outer = new OuterClass();
	    OuterClass.InnerClass inner1 = outer.new InnerClass();		//


	    OuterClass.InnerClass inner2 = new OuterClass().new InnerClass();

	    outer.outerMethod();
	    inner1.innerMethod();
	    inner2.innerMethod();

	}
}

class OuterClass {

  private int n = 10;
  void outerMethod() {
      InnerClass myInner = new InnerClass();
      myInner.innerMethod();
		System.out.println("from OuterClass...");
	}

  class InnerClass {
		private int m = 5;
  	void innerMethod() {
			int sum = n + m;
	 		System.out.println("from InnerClass sum = " + sum);
 	 } 
  }		// end of InnerClass
}		// end of OuterClass
