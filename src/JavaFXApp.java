import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Welcome to JavaFX!");
        Button button = new Button("Click Me");
        button.setOnAction(e -> label.setText("Button Clicked!"));

        VBox root = new VBox(10, label, button);
        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("JavaFX Desktop App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
