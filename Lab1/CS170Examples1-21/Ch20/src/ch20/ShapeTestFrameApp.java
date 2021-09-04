package ch20;

//Demo: Test shapes in Graphics2D

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

class ShapeTestFrame extends JFrame {
	public ShapeTestFrame() {
		setTitle("Draw Graphics2D");
		setSize(230, 200);
	    setVisible(true);
	}
	public void paint(Graphics g) {  //It will be automatically called when the object of ShapeTestFrame is created
		Graphics2D gg = (Graphics2D) g;  //Cast to Graphics2D
		Shape e = new Ellipse2D.Double(30, 50, 150, 100);

		gg.setPaint(new GradientPaint(30, 15, Color.red, 80, 65, Color.yellow,
				true));
		gg.fill(e);
		gg.setPaint(Color.BLUE);
		gg.setStroke(new BasicStroke(6.0f));

		gg.draw(new Rectangle2D.Double(20, 40, 170, 125));
	}
}

public class ShapeTestFrameApp {
	public static void main(String[] args) {
		new ShapeTestFrame();
	}
}
