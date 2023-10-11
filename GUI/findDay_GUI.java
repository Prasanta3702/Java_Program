import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class FindDay {
    String Day(int d, int m, int y) {
        int j = d;
        switch(m-1) {
            case 11: j += 30;
            case 10: j += 31;
            case 9:  j += 30;
            case 8:  j += 31;
            case 7:  j += 31;
            case 6:  j += 30;
            case 5:  j += 31;
            case 4:  j += 30;
            case 3:  j += 31;
            case 2:  j += 28;
            case 1:  j += 31;
        }
        if((y % 100 != 0 && y % 4 == 0) || (y % 400 == 0)) {
            if(m > 2) j += 1;
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
public class findDay_GUI implements ActionListener {

    JFrame frame = new JFrame();
    JLabel label1 = new JLabel("Enter Date: ");
    JTextField field1 = new JTextField(10);
    JButton btn = new JButton("Search");
    JLabel result = new JLabel();

    FindDay ob = new FindDay();

    public findDay_GUI() {
        frame.setTitle("Find Day");
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        frame.setSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        btn.addActionListener(this);
        field1.addActionListener(this);

        frame.add(label1);
        frame.add(field1);
        frame.add(btn);
        frame.add(result);

        frame.validate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Search") || e.getSource() == field1) {

            try {
                String str = field1.getText();
                int d = 0, m = 0, y = 0;

                char[] arr = new char[10];
                arr = str.toCharArray();

                String res = "";
                res += arr[0];
                res += arr[1];
                d = Integer.parseInt(res);

                res = "";
                res += arr[3];
                res += arr[4];
                m = Integer.parseInt(res);

                res = "";
                res += arr[6];
                res += arr[7];
                res += arr[8];
                res += arr[9];
                y = Integer.parseInt(res);

                String day = ob.Day(d, m, y);

                result.setText(day);

            } catch (NumberFormatException exc) {
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new findDay_GUI();
            }
        });
    }
}
