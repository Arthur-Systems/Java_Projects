package square;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.animation.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.scene.effect.*;
import javafx.scene.paint.*;



public class squareapp extends Application {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	@Override
	public void start(Stage primaryStage)  {
		primaryStage.setTitle("Square"); // Set the title
		primaryStage.setWidth(800);
		primaryStage.setHeight(600); // set the size of the window
		StackPane intro = new StackPane(); //new pane for intro
		StackPane main = new StackPane(); //new pane for main
		Scene introScene = new Scene(intro); //create scene
		primaryStage.setScene(introScene); //set scene
		intro.setPrefSize(500, 500);
		intro.setStyle("-fx-background-color: #5cd66e"); // background color
		Text introText = new Text("Welcome to the Square App! This app will take in data and calculate it. \n \n"
				+ "Program Coded By" + " Haichuan Wei on " 
				+ "11/17/2021\n \n" 
				+ " Click the button to begin! ");//intro text
		introText.wrappingWidthProperty().bind(intro.widthProperty()); //word wrap based on window width
		introText.setFont(Font.font("Arial", FontWeight.BOLD, 20)); //font data
		introText.setFill(Color.BLACK); //font color
		introText.setTextAlignment(TextAlignment.CENTER); //font alignment
		intro.getChildren().add(introText); //add text to stack pane
		Button introButton = new Button("Start");//intro button
		introButton.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
		introButton.setPrefSize(100, 50);
		introButton.setStyle("-fx-background-color: red"); //button color
		introButton.setTranslateY(125); //button position
		intro.getChildren().add(introButton); //add button to stack pane
		primaryStage.show(); //show scene
		introButton.setOnAction(e -> { //when button is clicked
			Scene mainScene = new Scene(main); //create scene
			primaryStage.setScene(mainScene); //set scene
		});
		main.setPrefSize(500, 500);
		main.setStyle("-fx-background-color: #d6b65c"); // background color
		Text mainText = new Text("Okay! Please enter the side length you want to calculate!");//intro text
		mainText.wrappingWidthProperty().bind(main.widthProperty()); //word wrap based on window width
		mainText.setFont(Font.font("Arial", FontWeight.BOLD, 20)); //font data
		mainText.setFill(Color.BLACK); //font color
		mainText.setTextAlignment(TextAlignment.CENTER); //font alignment
		mainText.setTranslateY(-100); //move up
		main.getChildren().add(mainText); //add text to stack pane
		TextField side = new TextField(); //create text field
		side.setPrefSize(100, 50); //set size
		side.setPromptText("Enter a number"); //set prompt text
		main.getChildren().add(side); //add text field to stack pane
		Button submit = new Button("Submit"); //submit button
		submit.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
		submit.setPrefSize(100, 50);
		submit.setStyle("-fx-background-color: red"); //button color
		//on click, calculate the square
		Text result = new Text(""); //create text

		submit.setOnAction(e -> {
				try {
					int num = Integer.parseInt(side.getText());		
					if (num < 0) {
						throw new NegativeDoubleException();
					}
					else {
						int perimeter = 4 * num;
						int area = num * num;
						//change the contects of the text
						result.setText("The Perimeter is :"  + perimeter + "\n"+ "The Area is :" + area +"\n"+ "The Given Side Length is:" + num);
						main.getChildren().remove(result);
						result.wrappingWidthProperty().bind(main.widthProperty()); //word wrap based on window width
						result.setFont(Font.font("Arial", FontWeight.BOLD, 20)); //font data
						result.setFill(Color.BLACK); //font color
						result.setTextAlignment(TextAlignment.CENTER); //font alignment
						result.setTranslateY(50); //move up
						main.getChildren().add(result); //add text to stack pane
						side.setEditable(false);//lock the text field
						submit.setDisable(true); //disable the button
					}
				} 
				catch(NumberFormatException e2) {
					Alert alert = new Alert(Alert.AlertType.ERROR);
					alert.setTitle("Error");
					alert.setHeaderText("Invalid Input");
					alert.setContentText("Please enter a number");
					alert.showAndWait();
					side.clear();
				} catch (NegativeDoubleException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		);
	submit.setTranslateY(125); //button position
	submit.setTranslateX(-200); //button position
	main.getChildren().add(submit); //add button to stack pane
	primaryStage.show(); //show scene
	Button clear = new Button("Clear"); //clear button
	clear.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
	clear.setPrefSize(100, 50);
	clear.setStyle("-fx-background-color: red"); //button color
	clear.setTranslateY(125); //button position

	clear.setOnAction(e -> {
		side.clear(); //clear text field

		main.getChildren().remove(result);//clear the text
		
		side.setEditable(true); //unlock text field
		submit.setDisable(false); // re-enable button

	});
	Button quit = new Button("Quit"); //quit button
	quit.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
	quit.setPrefSize(100, 50);
	quit.setStyle("-fx-background-color: red"); //button color
	quit.setTranslateY(125); //button position
	quit.setTranslateX(200); //button position
	//on click, quit the program
	quit.setOnAction(e -> {
	System.exit(0); //quit program
	});

	main.getChildren().add(clear); //add button to stack pane
	main.getChildren().add(quit); //add button to stack pane
	primaryStage.show(); //show scene
	}
}

