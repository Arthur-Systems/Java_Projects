package ch10;
//abstract class CircleShape

public abstract class CircleShape extends Shape {		//abstract class
	protected double radius;

public CircleShape() {
	x1 = y1 = x2 = y2 = 0.0;
	}
public CircleShape(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);		//调用抽象类构造器
	}
public CircleShape(double radius) {
	 	this.radius = radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void computeRadius() {
		radius = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2) * (y1 - y2));
	}
	public String toString() {
		return super.toString() + "Radius: " + radius + "\n";
	}
}
