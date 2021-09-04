//demo polymorphic method

public abstract class SuperClass2 {
 public abstract String method();  //abstract method

 public void otherMethod()
 	{System.out.println("from SuperClass otherMethod()...");}
 }

class SubClass2 extends SuperClass2 {
 public String method() {
 	return "from subClass...";
 	}
 }
