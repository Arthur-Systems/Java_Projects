package ch20fx;

//Demo: use of javafx package to display a window

import javafx.application.Application;					//import javafx packages
import javafx.stage.Stage;

public class SimpleFXFrameTest extends Application {   //must inherit abstract class Application 

	public void start (Stage stage) {					//must implement this abstract method; start to run 
		stage.setTitle("JavaFX winodw Demo");			//title of the frame
		stage.show();									//display it
	}
	public static void main(String args) {				//main() method to test
		launch(args);									//execution point
	}
}

