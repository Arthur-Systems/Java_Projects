package square;
/*
Name: Haichuan Wei
Course: CS125
Lab #: Lab Four
Submission Date: 11/18
Brief Description: This is the Exception class for NegativeDoubleException. This class is used to display the error message when the user input a negative number.

@function NegativeDoubleException: This is the constructor for the NegativeDoubleException class. It displays the error message when the user input a negative number.

*/
import javafx.scene.control.Alert;
public class NegativeDoubleException extends Exception { //start of NegativeDoubleException class
    public NegativeDoubleException() { //start of NegativeDoubleException constructor
        Alert alert = new Alert(Alert.AlertType.ERROR); // create alert
        alert.setTitle("Error"); // set title
        alert.setHeaderText("Negative number entered"); // set header text
        alert.setContentText("Please enter a positive number");// error message
        alert.showAndWait(); // show and wait for response
    } //end of NegativeDoubleException constructor
}//end of NegativeDoubleException class
