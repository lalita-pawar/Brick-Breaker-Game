import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameWindow {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public void init(Stage primaryStage) {
        primaryStage.setTitle("Brick Breaker");
        Pane root = new Pane();
        Scene scene = new Scene(root, WIDTH, HEIGHT);

        // Add game elements to the root pane

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
