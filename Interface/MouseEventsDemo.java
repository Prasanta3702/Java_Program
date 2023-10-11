import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {
    
    String msg = "";
    int mouseX = 0, mouseY = 0; // coordinates of mouse

    public MouseEventsDemo() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
    }
    // handle the mouse click
    public void mouseClicked(MouseEvent me) {
        msg = msg + " -- click received";
        repaint();
    }
    // handle mouse entered
    public void mouseEntered(MouseEvent me) {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse Entered";
        repaint();
    }
    // Handle mouse exited
    public void mouseExited(MouseEvent me) {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse Exited";
        repaint();
    }
    // Handle button pressed
    public void mousePressed(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Button down";
        repaint();
    }
    // handle button released
    public void mouseReleased(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Button Released";
        repaint();
    }
    // Handle mouse dragged
    public void mouseDragged(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*"+" mouse at "+mouseX+", "+mouseY;
        repaint();
    }
    // Handle mouse moved
    public void mouseMoved(MouseEvent me) {
        msg = "Moving mouse at "+me.getX()+", "+ me.getY();
        repaint();
    }
    // display message in the window at the current x, y position
    public void paint(Graphics g) {
        g.drawString(msg, mouseX, mouseY);
    }
    public static void main(String[] args) {
        MouseEventsDemo appwin = new MouseEventsDemo();

        appwin.setSize(new Dimension(300, 300));
        appwin.setTitle("MouseeventDemo");
        appwin.setVisible(true);
    }
}
class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}