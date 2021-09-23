//class Rectange inherites Shape

public class Rectangle extends Shape {
	protected double height, length;
	protected double area;

public Rectangle(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);		//Code reusable
		computeHeight();
		computeLength();
	}
	public Rectangle(double height, double length) {
		this.height = height;
		this.length = length;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getLeangth() {
		return length;
	}
	public void computeHeight() {
		double height = Math.abs(x1 - x2);
		setHeight(height);
	}
	public void computeLength() {
		double length = Math.abs(y1 - y2);
		setLength(length);
	}
	public void computeArea() {
		area = height * length;
	}
	public double getArea() {
		return area;
	}
	public void computeVolume() { }		//there is no volume for rectangle

	public String toString() {
		String message = super.toString() + "Height: " + height + "\n"
								+ "Length: " + length + "\n"
								+ "Area: " + area + "\n";
		return message;
	}
}
