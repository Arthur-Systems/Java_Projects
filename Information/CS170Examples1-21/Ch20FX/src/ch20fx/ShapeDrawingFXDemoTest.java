package ch20fx;

//Demo: use of Java FX package to draw shapes and display the text in a window

import javafx.application.Application;		//import javafx packages
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class ShapeDrawingFXDemoTest extends Application {

	public void start(Stage stage) {
		Line line = new Line (10, 20, 120, 90);
		Circle circle = new Circle(320, 60, 55, Color.BLUE);
		Rectangle rec = new Rectangle(25, 130, 95, 120);
		rec.setFill(Color.RED);
		Polygon poly = new Polygon(320.0, 150.0, 420.0, 200.0, 320.0, 250.0, 220.0, 200.0, 320.0, 150.0);
		Text message = new Text(50, 300, "Line, circle, rectangle and polygon drawing use of Java FX");

		Pane pane = new Pane(line, circle, rec, poly, message);

		Scene scene = new Scene(pane, 430, 350);
		stage.setScene(scene);

		stage.setTitle("JavaFX drawing geom Demo");			//title of the frame
		stage.show();										//display it
	}
	public static void main(String args) {				//main() method to test
		launch(args);									//execution point
	}
}
