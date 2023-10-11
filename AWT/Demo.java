import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicScrollPaneUI;

public class Demo extends JFrame {

    myEditor editor;

    public Demo() {
        this.setSize(500, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.darkGray);

        editor = new myEditor();

        // this.add(editor, BorderLayout.CENTER);
        JTextField f = new JTextField();

        JScrollPane jsp = new JScrollPane(f);
        jsp.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                
            }
        });
        this.add(jsp, BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Demo().setVisible(true);
            }
        });
    }
}
class myEditor extends TextArea {
    public myEditor() {
        this.setBackground(Color.darkGray);
        this.setForeground(Color.white);
    }
}