package ch20fx;


//Demo: use of Java FX package to display images and the text in a window
//using control pane

import javafx.application.Application;		//import javafx packages
import javafx.stage.Stage;

import javafx.scene.text.Text;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.image.*;		//import Image and ImageView


public class ImageFXDemoTest extends Application {
	public void start(Stage stage) {
		Image image1 = new Image("file:flowers.gif");  //current location
		ImageView imageView1 = new ImageView(image1);
		Image image2 = new Image("file:C:\\NewJavaBook\\Ch20\\images\\JavaLogo.gif"); //other location
		ImageView imageView2 = new ImageView(image2);
		imageView2.setX(270);
		imageView2.setY(10);

		Text message = new Text(50, 230, "Display images use of Java FX");  

		Pane pane = new Pane(imageView1, imageView2, message); //load 3 objects to be displayed
		Scene scene = new Scene(pane, 480, 260);
		stage.setScene(scene);
		stage.setTitle("JavaFX display image Demo");			//title of the frame
		stage.show();											//display it
	}
	public static void main(String args) {				//main() method to test
		launch(args);									//execution point
	}
}