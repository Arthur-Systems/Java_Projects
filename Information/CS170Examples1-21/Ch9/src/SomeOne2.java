//Demo: Interface as argument type

public class SomeOne2  implements CanDo {
  public void canDoList(CanDo object){	//CanDo is an interface type
	  object.swim();
	  object.fly();
	  object.walk();
  }
  public void swim() {
  	System.out.println("I can catch fish.");
  }

  public void fly() {
  	System.out.println("Sky is my limit.");
  }
  public void walk() {
  	System.out.println("I can even walk.");
  }
}