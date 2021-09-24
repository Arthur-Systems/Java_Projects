package Rectangle;
/*
Name: Haichuan Wei
Course: CS125
Lab #: Lab One
Submission Date: 9/23/21
Brief Description: This program take a number that is less then 10 from the user and convert it to a romain numeral.
*/
public class Rectangle { //start of class
	
	private double height, width; // defines height and width of the rectangle
	
	public void setWidth(double width) { //this method sets its width variable to the 
		this.width = width;
	}
	
	public void setHeight(double height) { 
		this.height = height;
	}

	public double getWidth() { // returns the width value
	
		return width;
	}

	public double getHeight() {// returns the height value
		return height;
	}

	public double getCircumference() { //returns the circumference by multiplying two to the sum of width and hight
		return 2 * (width + height);
	}

	public double getArea() { //returns the product of width and height
		return height * width;
	}
}//end of class

