import java.awt.*;
import java.awt.event.*;

public class label extends Frame {
    Label one, two, three;

    public label() {
        setSize(200, 100);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        one = new Label("One");
        two = new Label("Two");
        three = new Label("Three");

        add(one);
        add(two);
        add(three);
    }
    public static void main(String[] args) {
        new label();
    }
}