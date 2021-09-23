package ch20fx;



/*
 *Alphabet Dropping Letter Game
 *GameApp.java
 *
 */
import javax.swing.*;
import javafx.stage.Stage;
import javafx.application.*;

public class GameApp extends Application {
	public static void main(String[] args) {
		Application.launch(args);				//execute
	}

	public void start(Stage stage) {		//start to run
		
		JFrame frame = new GameFrame();
		frame.setVisible(true);
	}
	
}