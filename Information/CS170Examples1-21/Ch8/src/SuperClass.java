//demo polymorphic method

public class SuperClass {
 public String method() {
 	return "from SuperClass...";
  }
 public void otherMethod()
 	{	
		System.out.println("from SuperClass otherMethod()...");
	}
 }

class SubClass extends SuperClass {
 public String method() {
 	return "from subClass...";
 	}
 }
