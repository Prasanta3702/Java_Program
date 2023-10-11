import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Day {
    public static String Days(int d, int m, int y) {
        int j = d;
        switch(m-1) {
            case 11: j+= 30;
            case 10: j+= 31;
            case 9: j += 30;
            case 8: j += 31;
            case 7: j += 31;
            case 6: j += 30;
            case 5: j += 31;
            case 4: j += 30;
            case 3: j += 31;
            case 2: j += 28;
            case 1: j += 31;
        }
        if((y % 100 != 0 && y % 4 == 0) || (y % 4 == 0)) {
            if(m > 2) {
                j += 1;
            }
        }
        int f = (y-1) / 4;
        int h = (y-1) / 100;
        int fh = (y-1) / 400;
        int day = (y + j + f - h + fh) % 7;
        switch(day) {
            case 0: return "Saturday";
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
        }
        return null;
    }
}
public class find_Day implements ActionListener {

    JFrame frame = new JFrame("Find Day");
    JLabel label = new JLabel("Enter DOB: ");
    JTextField dd = new JTextField(2);
    JTextField mm = new JTextField(2);
    JTextField yy = new JTextField(4);
    JLabel day = new JLabel();

    find_Day() {
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(200, 100);
        frame.setVisible(true);

        yy.addActionListener(this);
        mm.addActionListener(this);
        dd.addActionListener(this);

        frame.add(label);
        frame.add(dd);
        frame.add(mm);
        frame.add(yy);
        frame.add(day);

        frame.validate();
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == yy || e.getSource() == mm || e.getSource() == dd) {
            int d = Integer.parseInt(dd.getText());
            int m = Integer.parseInt(mm.getText());
            int y = Integer.parseInt(yy.getText());
            String res = Day.Days(d, m, y);
            day.setText(res);
            frame.validate();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new find_Day();
            }
        });
    }
}
