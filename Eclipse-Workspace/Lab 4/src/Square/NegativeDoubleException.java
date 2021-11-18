package square;

import javafx.scene.control.Alert;

public class NegativeDoubleException extends Exception {
    public NegativeDoubleException() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText("Negative number entered");
        alert.setContentText("Please enter a positive number");
        alert.showAndWait();
    }
}
