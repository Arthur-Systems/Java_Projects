package ch10;
//the driver class for sorting using enhanced for loop

import java.util.Arrays;

public class CircleShapeApp3{
	public static void main(String[] args) {
		//create a Circle array with 3 circles and 2 spheres
 		Circle3[] shapes = {new Circle3(10.02), new Circle3(6.54), new Circle3(0.69),
 				          new Sphere(67.23), new Sphere(1.28)};
 		
 		for(Circle3 shape : shapes) 
 			shape.computeArea();		//compute area for each element	
 		Arrays.sort(shapes);
 		
 		for(Circle3 shape : shapes) 
 			System.out.println(shape);
 		
 		Sphere[] spheres = {new Sphere(98.23), new Sphere(6.56), new Sphere(10.88)};
 		for(Sphere sphere : spheres)
 		 sphere.computeVolume();
 		
 		Arrays.sort(spheres);
 		System.out.println("Sorted by volumes in spheres array: ");
 		for(Sphere sphere : spheres)
 			System.out.println(sphere.getVolume());
 	}
}
