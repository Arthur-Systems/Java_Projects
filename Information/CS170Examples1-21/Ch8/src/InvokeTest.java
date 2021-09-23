
//demo: invokespecial vs. invokevirtual

class SuperClass5 {
 	public String method() {
		 return "from SuperClass5...";
 	}
 	public void otherMethod() {
 		System.out.println("In SuperClass5 otherMethod()...");
 		System.out.println("SuperClass5 otherMethod() calls method(): " + method());
 	}
 }

class SubClass5 extends SuperClass5{
 	public String method() {
 		return "from SubClass5...";
 	}
 	public void subMethod() {
		//call SuperClass5 method()
		System.out.println("SubClass5 calls super.method(): " + super.method());
	}
}

public class InvokeTest {
   public static void main( String args[] ) {

      SubClass5 b = new SubClass5();
	  SuperClass5 supper = b;				//Cast to super class type
	  System.out.println(supper.method());

      b.subMethod();
      b.otherMethod();
   }
}
