package ch20;

//package ch20;
//Demo:Draw shapes with colors and fill styles

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;

public class ShapesFrameApp {
	public static void main(String[] args) {
		new ShapesFrame();
	}
}

class ShapesFrame extends JFrame {
	public ShapesFrame() {
		setTitle("Draw Shapes");
		setSize(430, 200);
		
		JPanel panel = new ShapesPanel();  //Create object of the panel
		add(panel);
		
	    setVisible(true);
	}
}

class ShapesPanel extends JPanel {
	Shape shape; // Use Shape as reference
	JComboBox shapeComboBox, colorComboBox; // Declare the combo boxes
	JRadioButton drawButton, fillButton; // Declare the radio buttons
	boolean fill; // Filling status
	Color color; // Declare color

	public ShapesPanel() { // Constructor
		// Shape array
		String[] shapes = { "Line", "Rectangle", "Round Rectangle", "Ellipse",
				"Arc" };
		shapeComboBox = new JComboBox(shapes); // Create the combo box
		shapeComboBox.setSelectedItem("Rectangle");// Default as rectangle
		shape = new Rectangle2D.Double(100, 60, 200, 60);
		shapeComboBox.addItemListener(new ShapeEventHandler()); // Event
																// handling
		String[] colors = { "Black", "Red", "Blue", "Green", "yellow" }; // Color
																			// array
		colorComboBox = new JComboBox(colors); // Create the combo box
		colorComboBox.setSelectedItem("Black"); // Default color as black
		colorComboBox.addItemListener(new ColorEventHandler()); // Event
																// handling
		drawButton = new JRadioButton("not fill"); // Create radio button
		fillButton = new JRadioButton("fill");
		ButtonGroup drawGroup = new ButtonGroup(); // Create button group
		drawGroup.add(drawButton); // Add to the button group
		drawGroup.add(fillButton);
		drawButton.addItemListener(new DrawEventHandler()); // Event handling
		fillButton.addItemListener(new DrawEventHandler());
		JPanel northPanel = new JPanel(); // Panel for layout
		northPanel.add(shapeComboBox); // Set FlowLayout.CENTER
		northPanel.add(colorComboBox);
		northPanel.add(drawButton);
		northPanel.add(fillButton);
		setLayout(new BorderLayout()); // Position to the top
		add(northPanel, BorderLayout.NORTH);
	}

	public void paintComponent(Graphics g) { // Painting
		super.paintComponent(g);
		Graphics2D gg = (Graphics2D) g; // Cast
		gg.setColor(color); // Set color
		if (fill) // if it is filling ...
			gg.fill(shape); // Call the filling method
		else
			gg.draw(shape); // Else not filling

	}

	class ShapeEventHandler implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			String shapeString = (String) shapeComboBox.getSelectedItem();
			int x = 100, y = 60, w = 200, h = 60;
			if (shapeString.equals("Line"))
				shape = new Line2D.Double(x, y, w + 100, h + 100);
			else if (shapeString.equals("Rectangle"))
				shape = new Rectangle2D.Double(x, y, w, h);
			else if (shapeString.equals("Round Rectangle"))
				shape = new RoundRectangle2D.Double(x, y, w, h, 40, 40);
			else if (shapeString.equals("Ellipse"))
				shape = new Ellipse2D.Double(x, y, w, h);
			else if (shapeString.equals("Arc"))
				shape = new Arc2D.Double(x, y, w, h, 30, 210, Arc2D.CHORD);
			repaint();
		}
	}

	class ColorEventHandler implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			String colorString = (String) colorComboBox.getSelectedItem();
			if (colorString.equals("Black"))
				color = Color.black;
			else if (colorString.equals("Blue"))
				color = Color.blue;
			else if (colorString.equals("Red"))
				color = Color.red;
			else if (colorString.equals("Green"))
				color = Color.green;
			else if (colorString.equals("yellow"))
				color = Color.yellow;
			repaint();
		}
	}

	class DrawEventHandler implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (drawButton.isSelected())
				fill = false;
			else if (fillButton.isSelected())
				fill = true;
			repaint();
		}
	}
}
