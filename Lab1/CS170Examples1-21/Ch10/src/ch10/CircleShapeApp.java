package ch10;
//the driver class for CircleShapes using array and new enhanced for loop

public class CircleShapeApp{
	public static void main(String[] args) {
		//create a Shape array with 3 circles and 2 spheres
 		Shape[] shapes = {new Circle(10.02), new Circle(6.54), new Circle(0.69),
 				          new Sphere(67.23), new Sphere(1.28)};
 		double totalArea = 0.0;
 		double average = 0.0;

 		for(Shape shape : shapes)
 			shape.computeArea();		//compute area for each element

 		for(Shape shape : shapes)
 			totalArea += shape.getArea(); 	//compute the total areas
 		average = totalArea/shapes.length;	//compute the average

 		System.out.println("The total of the areas " + totalArea);
 		System.out.println("The average of the areas " + average);
 	}

}
