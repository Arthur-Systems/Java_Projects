//This file has all the methods for the Square class
package Square;
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


}//End of Square Class

    
