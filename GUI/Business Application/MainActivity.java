import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DesignView extends JFrame {
    public DesignView(String title) {
        this.setTitle(title);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class MainActivity {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DesignView().setVisible(true);
            }
        });
}
}
