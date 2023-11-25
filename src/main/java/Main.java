import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        Drawing drawing = new Drawing();
        drawing.setSize(500, 500);
        drawing.setBackground(Color.white);

        frame.add(drawing);
    }
}