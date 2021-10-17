/*
Name: Haichuan Wei
Course: CS125
Lab #: Lab Two
Submission Date: 10/14/2021
Brief Description:  This program was made to practice the use of overloading methods. The driver class passes hard coded data into the methods and prints out the results.
*/
package area;

public class Area { // operation area class

    int height, width;
    double radius;
    double Pi = Math.PI;

    public double circleArea(double radius) { // calculates the area of a circle
        return Pi * radius * radius;
    }

    public int rectangleArea(int height, int width) { // calculates the area of a rectangle
        return height * width;
    }

    public double cylinderArea(double radius, double height) { // calculates the area of a cylinder
        return Pi * radius * radius + 2 * Pi * radius * height;
    }

}// end of class