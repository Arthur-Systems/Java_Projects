
import java.util.Scanner;

public class Rectangle {
	private static Scanner Input = new Scanner(System.in);
	public double height, width, circumference, area;

	public static void main(double height , double width) {
		Rectangle r = new Rectangle();
		r.getInput();
		r.calculate(height,width);
		r.display();
	}
	
	public void getInput() {
		System.out.println("Enter the height of the rectangle: ");
		height = Input.nextDouble();
		System.out.println("Enter the width of the rectangle: ");
		width = Input.nextDouble();
	}

	public void calculate(double height, double width) {
		circumference = (height + width) * 2;
		area = height * width;
	}

	public void display() {
		System.out.println("The circumference of the rectangle is: " + circumference);
		System.out.println("The area of the rectangle is: " + area);
	}
}

// create testing class
