//Demo: indirect multiple inheritance
abstract class Action {
  public void doingList() {
  	System.out.println("Here is what I can do: ");
  }
}

public class SomeOne extends Action implements CanSwim, CanFly, CanWalk {
  public void swim() {
  	System.out.println("I can catch fish.");
  }

  public void fly() {
  	System.out.println("Sky is my limit.");
  }
  public void walk() {
  	System.out.println("I can even run.");
  }
}