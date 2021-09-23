package ch20fx;

//Demo: use of Java FX package to rotate rectangle using setRotate() method

import javafx.application.Application;		//import javafx packages
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class RotateRecDemoTest extends Application {
	Rectangle rec;
	Pane pane;
	Scene scene;

	public void start(Stage stage) {

		stage.setTitle("JavaFX rotating rectangle demo");			//title of the frame
		rec = new Rectangle(150, 130, 95, 120);						//create a rectangle
		rec.setFill(Color.RED);										//set color to RED

		RotateImage rotate = new RotateImage(rec, pane, scene, stage );

	}
	public static void main(String args) {				//main() method to test
		launch(args);									//execution point
	}
}
class RotateImage {
	int x = 380;						//x coordinate must update so it will display
	RotateImage(Node rec, Pane pane, Scene scene, Stage stage) {		//can be any shape rotation by using Node type
		for(int angle = 0; angle <=180; angle+=10) {
			rec.setRotate(angle);
			pane = new Pane(rec);
			x += 1;												//update x
			scene = new Scene(pane, x, 350);					//change the size of window for continue to display
			stage.setScene(scene);
			stage.show();

			try {
				Thread.sleep(500);			//delay for 0.5 second in rotation
			}
			catch (InterruptedException e) {
				System.out.println(e);
			 }
	    }
	}
  }