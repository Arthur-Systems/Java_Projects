package ch12;


//Demo: use of local class

public class LocalClassTest {
 public static void main( String args[] ) {
	    SomeClass obj = new SomeClass();

	    obj.someMethod();
	}
}

class SomeClass {
	private int x = 15;

  void someMethod() {
		class Local {
			private int n = 10;
			int localMethod() {
				return n * n * x;
			}   //
		}

		Local local = new Local();
		int m  = local.localMethod();

		System.out.println("from SomeClass someMethod() m = " + m);

	}		// end of someMethod()

}			// end of SomeClass

