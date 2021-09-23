package ch20fx;

import javafx.scene.media.*;
import javafx.stage.Stage;
import javafx.application.*;
import java.io.*;

public class SoundPlayAudioClipTest extends Application  {

	public static void main(String[] args) {
		Application.launch(args);				//execute
	}

	public void start(Stage stage) {		//start to run

		File file = new File("C:\\sound\\AlphabetSong.wav"); //file location
		System.out.println("file: " + file);
		AudioClip myAudio = new AudioClip(file.toURI().toString());
		myAudio.setCycleCount(10);		//play 10 times
		myAudio.play();
	}

}
