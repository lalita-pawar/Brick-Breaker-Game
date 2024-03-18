import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Brick extends Rectangle1 {
    private static final int WIDTH = 60;
    private static final int HEIGHT = 20;

    public Brick() {
        super(WIDTH, HEIGHT);
        setFill(Color.BLUE); // Example color
       
    }
}
