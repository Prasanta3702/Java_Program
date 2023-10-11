import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Demo {
    public Demo() {
        JFrame frame = new JFrame();
        frame.setLayout(new GridBagLayout());
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Prasanta");

        DefaultListModel<String> lm = new DefaultListModel<>();
        for(int i = 0; i < 20; i++) {
            lm.addElement("DefaultListModel with Prasanta");
        }
        JList<String> list = new JList<>(lm);

        JScrollPane jsp = new JScrollPane(list);

        GridBagConstraints c = new GridBagConstraints();
        c.weightx=1;
        c.weighty=1;
        c.fill=GridBagConstraints.BOTH;
        frame.add(jsp, c);
        frame.validate();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Demo();
            }
        });
    }
}