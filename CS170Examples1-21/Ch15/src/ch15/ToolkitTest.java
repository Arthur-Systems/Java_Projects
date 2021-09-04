package ch15;

//Demo:  Retrieve the local screen dimension using Toolkit, Dimension, GraphicsEnvironment,
//and Rectangle classes in java.awt package.

import java.awt.*;

public class ToolkitTest {
	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();

		System.out.println("My screen width: " + d.getWidth());
		System.out.println("My screen height: " + d.getHeight());

		GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();

		Rectangle rec = environment.getMaximumWindowBounds();
		System.out.println("Centered width: " + rec.getCenterX());
		System.out.println("Centered Height: " + rec.getCenterY());
		System.out.println("My Screen dimension: " + rec);
		
		Point point = environment.getCenterPoint();
		System.out.println("Center of screen: " + point);
		
		point = rec.getLocation();
		System.out.println("Location of my screen: " + point);
		
	}
}

