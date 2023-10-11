import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class button extends JButton {
    public button(String name) {
        super(name);
    }
    @Override
    public void paintComponent(Graphics g) {
        g.drawOval(5, 5, 50, 20);
    }
}
public class btnDesign extends JFrame {

    public btnDesign() {
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Button Design");
        getContentPane().setBackground(Color.darkGray);
        initializeComponent();
    }

    public void initializeComponent() {
        button btn = new button("Clear");
        this.add(btn);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new btnDesign().setVisible(true);
            }
        });
    }
}