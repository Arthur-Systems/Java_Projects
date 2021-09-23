//the driver class for CircleShapes

public class CircleShapeApp {

	public static void main(String[] args)  {
		Circle circle = new Circle(1);
 		circle.computeArea();
 		System.out.println("Circle area: " + circle.getArea());
 		
 		Sphere sphere = new Sphere(1);
 		sphere.computeArea();
 		System.out.println("Sphere area: " + sphere.getArea());
 		
 		try {
 			Circle otherCircle = (Circle) circle.clone();
 			otherCircle.setRadius(100);
 			otherCircle.computeArea();
 			System.out.println("Other circle area: " + otherCircle.getArea());
 			
 			Sphere otherSphere = (Sphere) sphere.clone();
 			otherSphere.setRadius(10);
 			otherSphere.computeArea();
 			System.out.println("Other Sphere area: " + otherSphere.getArea());
 			
 		}
 		catch (CloneNotSupportedException e) {
 			System.out.println(e);
 		}
 	}

}
