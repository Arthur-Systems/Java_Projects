package square;

import javafx.scene.control.Alert;

public class NegativeDoubleException extends Exception {
    public NegativeDoubleException() {
        Alert alert = new Alert(Alert.AlertType.ERROR); // create alert
        alert.setTitle("Error"); // set title
        alert.setHeaderText("Negative number entered"); // set header text
        alert.setContentText("Please enter a positive number");// error message
        alert.showAndWait(); // show and wait for response
    }
}
