//the driver class for circle shapes

public class CircleShapeApp{

	public static void main(String[] args) {
 		Circle circle = new Circle(12.98);
 		Sphere sphere = new Sphere(25.55);

 		Shape shape = circle;

 		shape.computeArea();
 		System.out.println("circle area: " + shape.getArea());
 		shape.computeVolume();
 		System.out.println("circle volume: " + shape.getVolume());

		shape = sphere;
 		shape.computeArea();
 		System.out.println("Sphere area: " + shape.getArea());
 		shape.computeVolume();
 		System.out.println("Sphere volume: " + shape.getVolume());
 	}

}
