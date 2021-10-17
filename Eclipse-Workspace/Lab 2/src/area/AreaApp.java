/*
Name: Haichuan Wei
Course: CS125
Lab #: Lab Two
Submission Date: 10/14/2021
Brief Description:  The driver class calls the operation class and prints the result.

*/
package area;

public class AreaApp { // driver application
	public static void main(String[] args) { // start of main function
		Area a1 = new Area(); // create a new area object
		System.out.println("Area of a circle with radius 5 is " + a1.circleArea(5)); // data is hard coded
		System.out.println("Area of a circle with radius 5 is " + a1.circleArea(5));

		System.out.println("Area of a rectangle with length 10 and width 5 is " + a1.rectangleArea(10, 5));
		System.out.println("Area of a rectangle with length 6 and width 13 is " + a1.rectangleArea(6, 13));

		System.out.println("Area of a cylinder with radius 5 and height 3 is " + a1.cylinderArea(5, 3));
		System.out.println("Area of a cylinder with radius 2 and height 6 is " + a1.cylinderArea(2, 6));

	}// end of main function

}// end of driver application
