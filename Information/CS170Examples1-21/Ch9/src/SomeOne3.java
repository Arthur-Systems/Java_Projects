//Demo: Interface as reurn type and argument type

public class SomeOne3  implements CanDo {
  private int swimSpeed, flySpeed, walkSpeed;

  //method with interface return type and argument type
  public CanDo canDo(int swimSpeed, int flySpeed, int walkSpeed){
	  this.setSwimSpeed(swimSpeed);
	  this.setFlySpeed(flySpeed);
	  this.setWalkSpeed(walkSpeed);

	  return this;
  }

  public static void canDoList(CanDo object){	//CanDo is an interface type
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
  public void setSwimSpeed(int swimSpeed) {
	  this.swimSpeed = swimSpeed;
  }
  public void setFlySpeed(int flySpeed) {
	  this.flySpeed = flySpeed;
  }
  public void setWalkSpeed(int walkSpeed) {
	  this.walkSpeed = walkSpeed;
  }
  public String toString() {
	  String message = "My swim speed is " + swimSpeed + "\n"
	  				  + "My flying speed is " + flySpeed + "\n"
	  				  + "My walk speed is " + walkSpeed + "\n";
	  return message;
  }
}