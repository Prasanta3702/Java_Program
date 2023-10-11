import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class logoDesign {
    
    JFrame frame = new JFrame();
    GridBagConstraints c = new GridBagConstraints();
    GridBagLayout g = new GridBagLayout();

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();

    public logoDesign() {

        frame.setLayout(g);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);

        // panel1.setBackground(Color.BLUE);
        // panel2.setBackground(Color.ORANGE);

        frame.add(panel1);
        frame.add(panel2);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new logoDesign();
    }
}
