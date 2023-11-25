import shapes.Circle;
import shapes.Shape;
import shapes.Rect;
import shapes.Square;

import java.awt.*;
import java.util.ArrayList;

public class Drawing extends Canvas {
    private final ArrayList<Shape> shapes = new ArrayList<>();
    public Drawing() {
    Circle circle = new Circle(100, new Point(250, 250), Color.BLUE);
    shapes.add(circle);
    Rect rect = new Rect(100, 200, new Point(0, 0), Color.GREEN);
    shapes.add(rect);
    Square square = new Square(200, 200, new Point(300, 200), Color.RED);
    shapes.add(square);

    }
    public void paint(Graphics g) {
        for (Shape shape : shapes){
            shape.draw(g);
        }
    }
}
