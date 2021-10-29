/*
Name: Haichuan Wei
Course: CS125
Lab #: Lab Three
Submission Date: 10/29/2021
Brief Description: This file has all the methods for the Square class
*/

package Square;
import javax.swing.JOptionPane;
public class Square { //Square Class

    private double sideLength;
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }   
    public double getSideLength() {
        return sideLength;
    }
    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
    public double computePerimeter() {
        return 4*sideLength;
    }
    public double computeArea() {
        return sideLength*sideLength;
    }
    public void print() {
        JOptionPane.showMessageDialog(null, "The perimeter is " +computePerimeter());
		JOptionPane.showMessageDialog(null, "The area is " + computeArea());
		JOptionPane.showMessageDialog(null, "The length of the side is " + getSideLength());
    }


}//End of Square Class

    
