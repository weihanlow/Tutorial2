import shapes.Circle;
import shapes.Rect;
import shapes.Square;

import java.awt.*;
public class Drawing extends Canvas {
    Circle circle = new Circle(100, new Point(250, 250), Color.BLUE);
    Rect rect = new Rect(100, 200, new Point(0, 0), Color.GREEN);
    Square square = new Square(200, 200, new Point(300, 200), Color.RED);

    public void paint(Graphics g) {
        if (circle != null) {
            circle.draw(g);
        }
        if (rect != null) {
            rect.draw(g);
        }
        if (square != null) {
            square.draw(g);
        }
    }
}
