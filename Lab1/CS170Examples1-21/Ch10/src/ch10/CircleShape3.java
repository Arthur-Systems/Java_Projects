package ch10;
//abstract class CircleShape3

public abstract class CircleShape3 extends Shape implements Comparable {
	protected double radius;

public CircleShape3() {
	x1 = y1 = x2 = y2 = 0.0;
	}
public CircleShape3(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);		//Call super class constructor
	}
public CircleShape3(double radius) {
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

	public int compareTo(Object object) {
		CircleShape3 circleShape = (CircleShape3)object;
		if (this.radius < circleShape.getRadius())
			return -1;
		if (this.radius > circleShape.getRadius())
			return 1;
		return 0;
	}

}
