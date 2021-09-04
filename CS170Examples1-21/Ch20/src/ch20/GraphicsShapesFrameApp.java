package ch20;

//Demo: Shapes in Graphics class

import java.awt.*;
import javax.swing.*;

class GraphicsShapesFrame extends JFrame {
		public GraphicsShapesFrame() {
			setTitle("Draw Graphics");
			setSize(400, 200);
			setVisible(true);
		
		}
		public void paint(Graphics g) { //It will be automatically called when the object of GraphicsShapesFrame is  created
		
			g.drawLine(100, 40, 30, 80);
			g.drawRect(120, 40, 70, 50);
			g.drawRoundRect(210, 40, 70, 50, 30, 30);
			g.drawOval(300, 40, 70, 50);
			g.drawArc(30, 100, 70, 50, 30, 120);
			int[] xPoints = { 120, 155, 190 };
			int[] yPoints = { 140, 100, 140 };
			Polygon triangle = new Polygon(xPoints, yPoints, 3);
			g.drawPolygon(triangle);
		}
}

public class GraphicsShapesFrameApp {
	public static void main(String[] args) {
		new GraphicsShapesFrame();
	}
}