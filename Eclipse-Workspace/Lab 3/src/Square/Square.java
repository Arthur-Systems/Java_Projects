package Square;
import java.util.*;
import javax.swing.JOptionPane;
public class Square {
//Code a Square class with all necessary constructor and methods that will accept the sideLength as data entry and compute the perimeter and area of the square respectively using two different methods called compoute Perimeter and computeArea.
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
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side length of the square: ");
        double sideLength = input.nextDouble();
        Square square = new Square(sideLength);
        System.out.println("The perimeter of the square is: " + square.computePerimeter());
        System.out.println("The area of the square is: " + square.computeArea());
        input.close();
    }







}

    
