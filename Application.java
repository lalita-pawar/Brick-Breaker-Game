import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        GameWindow gameWindow = new GameWindow();
        gameWindow.init(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
