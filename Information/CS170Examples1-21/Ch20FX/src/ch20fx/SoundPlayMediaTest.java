package ch20fx;

//Demo: use Media and MediaPlayer in Java FX to play a sound in the specified location

import javafx.scene.media.*;
import javafx.stage.Stage;
import javafx.application.*;
import java.io.*;

public class SoundPlayMediaTest extends Application  {

	public static void main(String[] args) {
		Application.launch(args);				//execute
	}

	public void start(Stage stage) {		//start to run

		File file = new File("C:\\sound\\AlphabetSong.wav"); //file location
		Media media = new Media(file.toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		
		mediaPlayer.setCycleCount(10);		//play 10 times
		mediaPlayer.play();
	}

}
