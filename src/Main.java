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


/*

Aquí están los pasos mencionados en el video para instalar JavaFX en Eclipse IDE:

1. Abre el servicio de Eclipse e ir a donde dice "Ayuda", luego haz clic en "Eclipse Marketplace".
2. Busca "fx" y haz clic en "Ir". Deberás instalar "e(fx)clipse", que es una biblioteca para JavaFX.
3. Acepta los términos y haz clic en "Finalizar". Cuando llegue al 53%, aparecerá una ventana emergente en la que tienes que seleccionar "Reiniciar ahora".
4. Ve a la página de descarga de JavaFX y descarga la versión que dice "Windows x64 SDK".
5. En Eclipse, ve a "Archivo" -> "Nuevo" -> "Proyecto JavaFX".
6. Pon el nombre del proyecto y asegúrate de que la casilla "Usar biblioteca JavaFX" esté marcada.
7. Una vez descargado el SDK de JavaFX, ve a donde se guardó, descomprímelo y copia todo su contenido.
8. En tu computadora, ve a la carpeta "Windows" y crea una nueva carpeta, por ejemplo, "JavaFX". Pega allí todo el contenido del SDK de JavaFX que copiaste.
9. Regresa a Eclipse y ve a "Windows" -> "Preferencias" -> "Java" -> "Build Path" -> "User Libraries". Haz clic en "Nuevo" y pon el nombre "JavaFX".
10. Haz clic en "Añadir archivos externos" y ve a la carpeta donde pegaste los archivos de JavaFX. Selecciona todos los archivos y haz clic en "Abrir".
11. Haz clic en "Aplicar y cerrar". Luego ve a "Proyecto" -> "Propiedades" -> "Java Build Path" -> "Libraries" y arrastra "JavaFX" a "Modulepath".
12. Haz clic en "Aplicar y cerrar". Luego ve a "Run" -> "Run Configurations" -> "Arguments" y en "VM arguments" pega el siguiente texto: `--module-path 'C:\JavaFX\lib' --add-modules javafx.controls,javafx.fxml`
13. Haz clic en "Aplicar" y "Cerrar". Ahora deberías poder ejecutar tu proyecto JavaFX sin errores.

Por favor, ten en cuenta que estos pasos pueden variar dependiendo de tu configuración específica y de la versión de las herramientas que estés utilizando.

Configuracion en RUN
--module-path 'C:\Users\DELL\Documents\javafx-sdk-17.0.7'
--add-modules javafx.controls,javafx.fxml
*/

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
