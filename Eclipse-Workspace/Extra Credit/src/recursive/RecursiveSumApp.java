package recursive;

/*
Name: Haichuan Wei
Course: CS125
Lab #: EXTRA CREDIT
Submission Date: 12/2/21
Brief Description: The driver class for the recursive program. It tests the program by calling all the methods in the recursive class.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class RecursiveSumApp {// Start driver
	public static void main(String[] args) { // main method
		new Thread() {
			@Override
			public void run() {
				javafx.application.Application.launch(RecursiveSum.class);
			}
		}.start();
		RecursiveSum startUpTest = RecursiveSum.waitForStartUpTest();
		startUpTest.printSomething();
	} // end main
} // End driver