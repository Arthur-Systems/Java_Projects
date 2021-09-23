//Demo: polymorphic method

public class SuperClass3 {
 public String method() {
	 return "from SuperClass3...";
 }

 public void otherMethod() {
 	System.out.println("from SuperClass3 otherMethod()...");
 	}
 }

class SubClass3 extends SuperClass3 {
 public String method() {
	System.out.println("SubClass3 calls SuperClass3 method: " + super.method());
 	return "from SubClass3...";
 	}
 }

class SubClass4 extends SuperClass3 {
	public String method() {
		return "from SubClass4...";
	}
}
class SubSubClass extends SubClass4 {
	public String method() {
		return "from SubSubClass...";
	}
}
