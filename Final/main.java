
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;

public class main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // code a window application in which there is a label as "Please click on the
        // button..." and a button called Click Me . Display them at the center of the
        // window; or if you code in JavaFX (omit it if code in Swing), use VBox at 15
        // pixels of spacing, create a Scene with the VBox as its root node at
        // coordinator (450, 200).

        Label label = new Label("Please click on the button...");
        Button button = new Button("Click Me");
        VBox vbox = new VBox(15);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(label, button);
        button.setOnAction(new ButtonClickHandler());
        Scene scene = new Scene(vbox, 450, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private class ButtonClickHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            // new scene
            Stage stage = new Stage();
            Label label = new Label("Thank you for clicking me...");
            VBox vbox = new VBox(15);
            vbox.setAlignment(Pos.CENTER);
            vbox.getChildren().addAll(label);
            Scene scene = new Scene(vbox, 450, 200);
            stage.setScene(scene);
            stage.show();

        }
    }
}
