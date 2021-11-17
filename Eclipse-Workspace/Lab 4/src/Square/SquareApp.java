package Square;
//import javaFX
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
	
	//design a SquareApp class using proper GUI component
	public static void main(String[] args) 
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		
		//create a GridPane
		GridPane gridPane = new GridPane();
		
		//create a VBox
		VBox vBox = new VBox();
		
		//create a HBox
		HBox hBox = new HBox();
		
		//create a Label
		Label label = new Label("Enter a number");
		
		//create a TextField
		TextField textField = new TextField();
		
		//create a Button
		Button button = new Button("Calculate");
		
		//add the label, textField and button to the HBox
		hBox.getChildren().addAll(label, textField, button);
		
		//add the HBox to the VBox
		vBox.getChildren().add(hBox);
		
		//add the VBox to the GridPane
		gridPane.add(vBox, 0, 0);
		
		//create a Scene
		Scene scene = new Scene(gridPane, 300, 200);
		
		//set the scene to the stage
		primaryStage.setScene(scene);
		
		//set the title to the stage
		primaryStage.setTitle("Square App");
		
		//show the stage
		primaryStage.show();

		






}
}
