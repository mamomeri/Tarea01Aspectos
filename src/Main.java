import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;

public class Main extends Application {

	private VBox pane;

    @Override
    public void start(Stage primaryStage) {
        pane = new VBox();

        Button redButton = new Button("Red");
        redButton.setOnAction(e -> changeColor(Color.RED));
        pane.getChildren().add(redButton);

        Button greenButton = new Button("Green");
        greenButton.setOnAction(e -> changeColor(Color.GREEN));
        pane.getChildren().add(greenButton);

        Button blueButton = new Button("Blue");
        blueButton.setOnAction(e -> changeColor(Color.BLUE));
        pane.getChildren().add(blueButton);

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Color Changer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void changeColor(Color color) {
        pane.setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
        System.out.println("New background color: " + color);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
