
import java.util.Scanner;

public class Rectangle {
	private static Scanner Input = new Scanner(System.in);
	public double height, width, circumference, area;

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.getInput();
		r.calculate();
		r.display();
	}
	
	public void getInput() {
		System.out.println("Enter the height of the rectangle: ");
		height = Input.nextDouble();
		System.out.println("Enter the width of the rectangle: ");
		width = Input.nextDouble();
	}

	public double calculate() {
		circumference = (height + width) * 2;
		area = height * width;
		return area;
	}

	public void display() {
		System.out.println("The circumference of the rectangle is: " + circumference);
		System.out.println("The area of the rectangle is: " + area);
	}
}

// create testing class
