package ch10;
//subclass CircleShape3

public class Circle3 extends CircleShape3 {
	protected double area;

	public Circle3() {
		super();			//call super class non-argument constructor
	}
	public Circle3(double radius) {
		super(radius);		//call super class one-argument constructor
	}
	public Circle3(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);//call super class four-argument constructor

	}

	public void computeArea() {
		area = Math.PI * radius * radius;
	}

	public double getArea() {
		return area;
	}

	public void computeVolume() {} 					//must implement

	public double getVolume() {
		return 0.0;
	}

  	public String toString() {					//override the toString() method
	  return super.toString() + "Area: " + area + "\n";
 	 }

}
