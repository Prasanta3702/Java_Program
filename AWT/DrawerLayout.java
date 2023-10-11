import java.awt.*;
import java.awt.event.*;

public class DrawerLayout extends Frame {
    Button btn = new Button("≡");
    Frame f;

    public DrawerLayout() {
        setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        f = this;

        add(btn);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                f.add(new DrawerPanel());
                f.validate();
            }
        });

        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new DrawerLayout();
    }
}
class DrawerPanel extends Panel {
    public DrawerPanel() {
        setBackground(Color.lightGray);
        setPreferredSize(new Dimension(200, 300));
        setVisible(true);
    }
}