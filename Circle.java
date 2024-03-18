import javafx.scene.shape.Circle;

public class Ball extends Circle {
    private static final int RADIUS = 10;
    private double dx, dy; // Velocity components

    public Ball() {
        super(RADIUS);
        // Set ball properties, such as color, position, etc.
        dx = 1; // Initial x velocity
        dy = -1; // Initial y velocity
    }

}
