package shapes;

import java.awt.*;

public class Shape {
    protected final Point position;
    protected final Color color;

    public Shape(Point position, Color color) {
        this.position = position;
        this.color = color;
    }
}
