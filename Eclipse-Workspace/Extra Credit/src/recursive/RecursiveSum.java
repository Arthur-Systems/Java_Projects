package recursive;

/*
Name: Haichuan Wei
Course: CS125
Lab #: EXTRA CREDIT
Submission Date: 12/2/21
Brief Description: This program is a recursive calculator. 
It uses JavaFX to create a GUI which allows the user to input a number and then the program will calculate the sum of the numbers from 1 to that number.
@function main: This is the main method.It launches the program.
@function start: This is the start method. It has all the startup code and is where the GUI is created.
*/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import java.util.concurrent.CountDownLatch;
import javafx.animation.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.image.*;
import javafx.scene.effect.*;
import javafx.scene.paint.*;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class RecursiveSum extends Application {
    public static final CountDownLatch latch = new CountDownLatch(1);
    public static RecursiveSum startUpTest = null;

    public static RecursiveSum waitForStartUpTest() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return startUpTest;
    }

    public static void setStartUpTest(RecursiveSum startUpTest0) {
        startUpTest = startUpTest0;
        latch.countDown();
    }

    public RecursiveSum() {
        setStartUpTest(this);
    }

    public void printSomething() {
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Recursive Sum");
        StackPane intro = new StackPane(); // new pane for intro
        StackPane main = new StackPane(); // new pane for main
        Scene introScene = new Scene(intro); // create scene
        primaryStage.setScene(introScene); // set scene
        intro.setPrefSize(500, 500);
        intro.setStyle("-fx-background-color: #5cd66e"); // background color
        Text introText = new Text(
                "Welcome to the Recursive App! This app will take in a number \n and returns the sum of all integers from one. \n \n"
                        + "Program Coded By" + " Haichuan Wei on "
                        + "12/2/2021\n \n"
                        + " Click the button to begin! ");// intro text
        introText.wrappingWidthProperty().bind(intro.widthProperty()); // word wrap based on window width
        introText.setFont(Font.font("Arial", FontWeight.BOLD, 20)); // font data
        introText.setFill(Color.BLACK); // font color
        introText.setTextAlignment(TextAlignment.CENTER); // font alignment
        intro.getChildren().add(introText); // add text to stack pane
        Button introButton = new Button("Start");// intro button
        introButton.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        introButton.setPrefSize(100, 50);
        introButton.setStyle("-fx-background-color: red"); // button color
        introButton.setTranslateY(125); // button position
        intro.getChildren().add(introButton); // add button to stack pane
        primaryStage.show(); // show scene
        introButton.setOnAction(e -> { // when button is clicked
            Scene mainScene = new Scene(main); // create scene
            primaryStage.setScene(mainScene); // set scene
        });
        main.setPrefSize(500, 500); // set size of main pane
        main.setStyle("-fx-background-color: #d6b65c"); // background color
        Text mainText = new Text("Please enter A number!");// intro text
        mainText.wrappingWidthProperty().bind(main.widthProperty()); // word wrap based on window width
        mainText.setFont(Font.font("Arial", FontWeight.BOLD, 20)); // font data
        mainText.setFill(Color.BLACK); // font color
        mainText.setTextAlignment(TextAlignment.CENTER); // font alignment
        mainText.setTranslateY(-100); // move up
        main.getChildren().add(mainText); // add text to stack pane
        TextField side = new TextField(); // create text field
        side.setPrefSize(100, 50); // set size
        side.setPromptText("Enter a number"); // set prompt text
        main.getChildren().add(side); // add text field to stack pane
        Button submit = new Button("Submit"); // submit button
        submit.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 15));
        submit.setPrefSize(100, 50);
        submit.setStyle("-fx-background-color: red"); // button color
        Text result = new Text(""); // create text
        submit.setOnAction(e -> {
            try { // try to parse the input
                int num = Integer.parseInt(side.getText()); // parse the input
                if (num < 0) { // if the input is negative
                    Alert alert = new Alert(Alert.AlertType.ERROR); // create alert
                    alert.setTitle("Error"); // set title
                    alert.setHeaderText("Error"); // set header
                    alert.setContentText("Please enter a positive number!"); // set content
                    alert.showAndWait(); // show alert
                } else { // if the input is positive and a number

                    // print out the sum of all integers from 1 to the input
                    for (int i = 1; i < num; i++) {
                        result.setText(result.getText() + i + " + ");
                        if (i == num - 1) {
                            result.setText(result.getText() + (i + 1) + " = " + ((((i + 1) * (i + 1)) + (i + 1)) / 2));
                        }
                        if (i == num) {
                            result.setText(i + " = " + i);
                        }
                    }
                    // set the result text
                    result.wrappingWidthProperty().bind(main.widthProperty()); // word wrap based on window width
                    result.setFont(Font.font("Arial", FontWeight.BOLD, 20)); // font data
                    result.setFill(Color.BLACK); // font color
                    result.setTextAlignment(TextAlignment.CENTER); // font alignment
                    result.setTranslateY(200); // move down
                    main.getChildren().add(result); // add text to stack pane
                    side.setEditable(false);// lock the text field
                    submit.setDisable(true); // disable the button
                }
            } catch (NumberFormatException e2) {
                Alert alert = new Alert(Alert.AlertType.ERROR);// create alert
                alert.setTitle("Error");// set title
                alert.setHeaderText("Invalid Input"); // set header text
                alert.setContentText("Please enter a number"); // error message
                alert.showAndWait(); // show and wait for response
                side.clear(); // clear the text field
            }
        });
        submit.setTranslateY(125); // button position
        submit.setTranslateX(-200); // button position
        main.getChildren().add(submit); // add button to stack pane
        primaryStage.show(); // show scene
        Button clear = new Button("Clear"); // clear button
        clear.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        clear.setPrefSize(100, 50);
        clear.setStyle("-fx-background-color: red"); // button color
        clear.setTranslateY(125); // button position
        clear.setOnAction(e -> {
            side.clear(); // clear text field
            result.setText(""); // clear text
            main.getChildren().remove(result);// clear the text
            side.setEditable(true); // unlock text field
            submit.setDisable(false); // re-enable button
        });
        Button quit = new Button("Quit"); // quit button
        quit.setFont(Font.font("Verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
        quit.setPrefSize(100, 50); // set size
        quit.setStyle("-fx-background-color: red"); // button color
        quit.setTranslateY(125); // button position
        quit.setTranslateX(200); // button position
        quit.setOnAction(e -> { // on click, quit the program
            System.exit(0); // quit program
        });
        main.getChildren().add(clear); // add button to stack pane
        main.getChildren().add(quit); // add button to stack pane
        primaryStage.show(); // show scene

    }

}
