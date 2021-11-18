package square;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class SquareApp extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		// Create a label and a text field
		Label label = new Label("Enter a number:");
		TextField textField = new TextField();
		textField.setPrefColumnCount(10);

		// Create a button
		Button button = new Button("Calculate");

		// Create a grid pane
		GridPane gridPane = new GridPane();
		gridPane.add(label, 0, 0);
		gridPane.add(textField, 1, 0);
		gridPane.add(button, 1, 1);

		// Create a horizontal box
		HBox hBox = new HBox();
		hBox.getChildren().add(gridPane);

		// Create a vertical box
		VBox vBox = new VBox();
		vBox.getChildren().add(hBox);

		// Create a scene
		Scene scene = new Scene(vBox);

		// Add a handler to the button
		button.setOnAction(e -> {
			// Get the number from the text field
			int number = Integer.parseInt(textField.getText());

			// Calculate the square
			int square = number * number;

			// Display the square
			label.setText("The square of " + number + " is " + square);
		});

		// Add a handler to the window
		primaryStage.setOnCloseRequest(e -> {
			System.exit(0);
		});

		// Set the scene
		primaryStage.setScene(scene);

		// Display the window
		primaryStage.show();
	}
		






}

