package Rectangle;
/*Name: Haichuan Wei
Course: CS125
Lab #: Lab One
Submission Date: 9/23/21
Brief Description: This program will create a rectangle object and print out the area and perimeter of the rectangle.
*/
import java.util.Scanner;
public class RectangleApp { //driver class
    private static Scanner Input = new Scanner(System.in);
    public static void main(String[] args) { //main method
Rectangle rect1 = new Rectangle();
//User input height and width by using scanner
System.out.println("Enter the height of the rectangle : ");
rect1.setHeight(Input.nextDouble());
System.out.println("Enter the width of the rectangle: ");
rect1.setWidth(Input.nextDouble());
//display the area and circumference by calling the respective methods
System.out.println("The area of the rectangle is " + rect1.getArea());
System.out.println("The circumference of the rectangle is " + rect1.getCircumference());
}// end of main method
}// end of driver class

