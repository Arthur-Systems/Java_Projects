//The driver class for CircleShapes

public class ShapeApp{

	public static void main(String[] args) {

 		Circle2 circle = new Circle2(12.98);
 		circle.computeArea();

 		System.out.println("Circle area: " + circle);

		Rectangle rec1 = new Rectangle(0, 0, 1, 1);
		rec1.computeArea();
		System.out.println("Rec1: " + rec1);
 	}

}
