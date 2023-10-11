import java.awt.*;
import java.awt.event.*;
class MouseEventDemo extends Frame implements MouseListener {
    String msg = "";
    int x = 0;
    int y = 0;

    public MouseEventDemo() {
        addWindowListener(new CloseWindow());
    }
    public static void main(String[] args) {
        MouseEventDemo ob = new MouseEventDemo();
        ob.setSize(500, 300);
        ob.setLocationRelativeTo(null);
        ob.setVisible(true);
        ob.setTitle("Mouse event");
    }
    @Override
    public void mouseClicked(MouseEvent me) {
        x = 100;
        y = 100;
        msg += "--Mouse Clicked";
        repaint();
    }
    @Override
    public void mouseEntered(MouseEvent me) {
        x = 100;
        y = 100;
        msg = "Mouse Entered";
        repaint();
    }
    @Override
    public void mouseExited(MouseEvent me) {
        x = 100;
        y = 100;
        msg = "Mouse Exited";
        repaint();
    }
    @Override
    public void mousePressed(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        msg = "Mouse pressed at "+x+" x "+y;
        repaint();
    }
    @Override
    public void mouseReleased(MouseEvent me) {
        x = me.getX();
        y = me.getY();
        msg = "Mouse released at "+x+" x "+y;
        repaint();
    }
    @Override
    public void paint(Graphics g) {
        g.drawString(msg, x, y);
    }
}
class CloseWindow extends WindowAdapter {
    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}