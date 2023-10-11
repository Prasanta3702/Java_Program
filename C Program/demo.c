
import javax.swing.*;

import java.awt.event.*;

import java.awt.*;

import javax.swing.border.*;

enum Operator {

    ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION, PERCENTAGE, NONE

}

public class demo implements ActionListener {

    JFrame frame = new JFrame("Calculator");

    GridBagConstraints gbc = new GridBagConstraints();

    JTextField display = new JTextField();

    JPanel keyPanel = new JPanel();

    JButton btnClear = new JButton("C");

    JButton btnPer = new JButton("%");

    JButton btnDiv = new JButton("/");

    JButton btnBack = new JButton("<");

    JButton btn7 = new JButton("7");

    JButton btn8 = new JButton("8");

    JButton btn9 = new JButton("9");

    JButton btnMul = new JButton("*");

    JButton btn4 = new JButton("4");

    JButton btn5 = new JButton("5");

    JButton btn6 = new JButton("6");

    JButton btnSub = new JButton("-");

    JButton btn1 = new JButton("1");

    JButton btn2 = new JButton("2");

    JButton btn3 = new JButton("3");

    JButton btnAdd = new JButton("+");

    JButton btn0 = new JButton("0");

    JButton btnDec = new JButton(".");

    JButton btnEqual = new JButton("=");

    JButton btnAS = new JButton("±");

    private long x = 0;

    private long x2 = 1;

    private long y = 0;

    Demo() {

        frame.setLayout(new GridBagLayout());

        frame.setSize(new Dimension(400, 500));

        frame.setLocation(550, 100);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setBackground(Color.DARK_GRAY);

        // button color

        Font f1 = new Font("Century", Font.BOLD, 24);

        btn0.setBackground(Color.LIGHT_GRAY);
        btn0.setForeground(Color.BLACK);
        btn0.addActionListener(this);
        btn0.setFont(f1);
        btn0.setBorder(new LineBorder(Color.GREEN));

        btn1.setBackground(Color.LIGHT_GRAY);
        btn1.setForeground(Color.BLACK);
        btn1.addActionListener(this);
        btn1.setFont(f1);
        btn1.setBorder(new LineBorder(Color.GREEN));

        btn2.setBackground(Color.LIGHT_GRAY);
        btn2.setForeground(Color.BLACK);
        btn2.addActionListener(this);
        btn2.setFont(f1);
        btn2.setBorder(new LineBorder(Color.GREEN));

        btn3.setBackground(Color.LIGHT_GRAY);
        btn3.setForeground(Color.BLACK);
        btn3.addActionListener(this);
        btn3.setFont(f1);
        btn3.setBorder(new LineBorder(Color.GREEN));

        btn4.setBackground(Color.LIGHT_GRAY);
        btn4.setForeground(Color.BLACK);
        btn4.addActionListener(this);
        btn4.setFont(f1);
        btn4.setBorder(new LineBorder(Color.GREEN));

        btn5.setBackground(Color.LIGHT_GRAY);
        btn5.setForeground(Color.BLACK);
        btn5.addActionListener(this);
        btn5.setFont(f1);
        btn5.setBorder(new LineBorder(Color.GREEN));

        btn6.setBackground(Color.LIGHT_GRAY);
        btn6.setForeground(Color.BLACK);
        btn6.addActionListener(this);
        btn6.setFont(f1);
        btn6.setBorder(new LineBorder(Color.GREEN));

        btn7.setBackground(Color.LIGHT_GRAY);
        btn7.setForeground(Color.BLACK);
        btn7.addActionListener(this);
        btn7.setFont(f1);
        btn7.setBorder(new LineBorder(Color.GREEN));

        btn8.setBackground(Color.LIGHT_GRAY);
        btn8.setForeground(Color.BLACK);
        btn8.addActionListener(this);
        btn8.setFont(f1);
        btn8.setBorder(new LineBorder(Color.GREEN));

        btn9.setBackground(Color.LIGHT_GRAY);
        btn9.setForeground(Color.BLACK);
        btn9.addActionListener(this);
        btn9.setFont(f1);
        btn9.setBorder(new LineBorder(Color.GREEN));

        btnDec.setBackground(Color.LIGHT_GRAY);
        btnDec.setForeground(Color.BLACK);
        btnDec.addActionListener(this);
        btnDec.setFont(f1);
        btnDec.setBorder(new LineBorder(Color.GREEN));

        btnAS.setBackground(Color.LIGHT_GRAY);
        btnAS.setForeground(Color.BLACK);
        btnAS.addActionListener(this);
        btnAS.setFont(f1);
        btnAS.setBorder(new LineBorder(Color.GREEN));

        btnClear.setBackground(Color.GRAY);
        btnClear.setForeground(Color.MAGENTA);
        btnClear.addActionListener(this);
        btnClear.setFont(f1);
        btnClear.setBorder(new LineBorder(Color.CYAN));

        btnPer.setBackground(Color.GRAY);
        btnPer.setForeground(Color.BLUE);
        btnPer.addActionListener(this);
        btnPer.setFont(f1);
        btnPer.setBorder(new LineBorder(Color.CYAN));

        btnDiv.setBackground(Color.GRAY);
        btnDiv.setForeground(Color.BLUE);
        btnDiv.addActionListener(this);
        btnDiv.setFont(f1);
        btnDiv.setBorder(new LineBorder(Color.CYAN));

        btnSub.setBackground(Color.GRAY);
        btnSub.setForeground(Color.BLUE);
        btnSub.addActionListener(this);
        btnSub.setFont(f1);
        btnSub.setBorder(new LineBorder(Color.CYAN));

        btnAdd.setBackground(Color.GRAY);
        btnAdd.setForeground(Color.BLUE);
        btnAdd.addActionListener(this);
        btnAdd.setFont(f1);
        btnAdd.setBorder(new LineBorder(Color.CYAN));

        btnMul.setBackground(Color.GRAY);
        btnMul.setForeground(Color.BLUE);
        btnMul.addActionListener(this);
        btnMul.setFont(f1);
        btnMul.setBorder(new LineBorder(Color.CYAN));

        btnBack.setBackground(Color.GRAY);
        btnBack.setForeground(Color.MAGENTA);
        btnBack.addActionListener(this);
        btnBack.setFont(f1);
        btnBack.setBorder(new LineBorder(Color.CYAN));

        btnEqual.setBackground(Color.GRAY);
        btnEqual.setForeground(Color.MAGENTA);
        btnEqual.addActionListener(this);
        btnEqual.setFont(f1);
        btnEqual.setBorder(new LineBorder(Color.CYAN));

        gbc.weightx = 1;
        gbc.weighty = 1;

        gbc.fill = GridBagConstraints.BOTH;

        gbc.insets = new Insets(30, 10, 30, 10);

        display.setBackground(Color.GRAY);

        display.setForeground(Color.BLACK);

        display.setMargin(new Insets(0, 10, 0, 10));
        display.setPreferredSize(new Dimension(200, 24));

        // display.setBorder(new LineBorder(Color.GREEN));

        // Border borderLine = BorderFactory.createLineBorder(Color.GREEN);

        // display.setBorder(borderLine);

        display.setHorizontalAlignment(SwingConstants.RIGHT);

        display.setFont(new Font("Arial", Font.BOLD, 34));

        gbc.gridx = 0;

        gbc.gridy = 0;

        gbc.ipady = 30;

        gbc.ipadx = 20;

        gbc.gridwidth = 4;

        frame.add(display, gbc);

        keyPanel.setBackground(Color.DARK_GRAY);

        keyPanel.setLayout(new GridBagLayout());

        gbc.insets = new Insets(0, 10, 10, 10);

        gbc.weighty = 1;

        gbc.fill = GridBagConstraints.BOTH;

        gbc.gridx = 0;

        gbc.gridy = 1;

        frame.add(keyPanel, gbc);

        gbc.insets = new Insets(2, 2, 2, 2);

        gbc.gridwidth = 1;

        gbc.ipady = 5;

        // row 1

        // clear

        gbc.gridx = 0;

        gbc.gridy = 0;

        keyPanel.add(btnClear, gbc);

        // percentage

        gbc.gridx = 1;

        gbc.gridy = 0;

        keyPanel.add(btnPer, gbc);

        // division

        gbc.gridx = 2;

        gbc.gridy = 0;

        keyPanel.add(btnDiv, gbc);

        // backspace

        gbc.gridx = 3;

        gbc.gridy = 0;

        keyPanel.add(btnBack, gbc);

        // row 2

        // 7

        gbc.gridx = 0;

        gbc.gridy = 1;

        keyPanel.add(btn7, gbc);

        // 8

        gbc.gridx = 1;

        gbc.gridy = 1;

        keyPanel.add(btn8, gbc);

        // 9

        gbc.gridx = 2;

        gbc.gridy = 1;

        keyPanel.add(btn9, gbc);

        // multiplication

        gbc.gridx = 3;

        gbc.gridy = 1;

        keyPanel.add(btnMul, gbc);

        // row 3

        // 4

        gbc.gridx = 0;

        gbc.gridy = 2;

        keyPanel.add(btn4, gbc);

        // 5

        gbc.gridx = 1;

        gbc.gridy = 2;

        keyPanel.add(btn5, gbc);

        // 6

        gbc.gridx = 2;

        gbc.gridy = 2;

        keyPanel.add(btn6, gbc);

        // subtraction

        gbc.gridx = 3;

        gbc.gridy = 2;

        keyPanel.add(btnSub, gbc);

        // 1

        gbc.gridx = 0;

        gbc.gridy = 3;

        keyPanel.add(btn1, gbc);

        // 2

        gbc.gridx = 1;

        gbc.gridy = 3;

        keyPanel.add(btn2, gbc);

        // 3

        gbc.gridx = 2;

        gbc.gridy = 3;

        keyPanel.add(btn3, gbc);

        // addition

        gbc.gridx = 3;

        gbc.gridy = 3;

        keyPanel.add(btnAdd, gbc);

        // Addition / subtraction

        gbc.gridx = 0;

        gbc.gridy = 4;

        keyPanel.add(btnAS, gbc);

        // 0

        gbc.gridx = 1;

        gbc.gridy = 4;

        keyPanel.add(btn0, gbc);

        // decimal

        gbc.gridx = 2;

        gbc.gridy = 4;

        keyPanel.add(btnDec, gbc);

        // equal

        gbc.gridx = 3;

        gbc.gridy = 4;

        keyPanel.add(btnEqual, gbc);

        gbc.gridwidth = 1;

        frame.pack();

        frame.setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent e) {

        Operator op = Operator.NONE;

        if (e.getSource().equals(btn0)) {

            display.setText(display.getText().concat("0"));

        }

        if (e.getSource().equals(btn1)) {

            display.setText(display.getText().concat("1"));

        }

        if (e.getSource().equals(btn2)) {

            display.setText(display.getText().concat("2"));

        }

        if (e.getSource().equals(btn3)) {

            display.setText(display.getText().concat("3"));

        }

        if (e.getSource().equals(btn4)) {

            display.setText(display.getText().concat("4"));

        }

        if (e.getSource().equals(btn5)) {

            display.setText(display.getText().concat("5"));

        }

        if (e.getSource().equals(btn6)) {

            display.setText(display.getText().concat("6"));

        }

        if (e.getSource().equals(btn7)) {

            display.setText(display.getText().concat("7"));

        }

        if (e.getSource().equals(btn8)) {

            display.setText(display.getText().concat("8"));

        }

        if (e.getSource().equals(btn9)) {

            display.setText(display.getText().concat("9"));

        }

        if (e.getSource().equals(btnDec)) {

            display.setText(display.getText().concat("."));

        }

        // clear

        if (e.getSource().equals(btnClear)) {

            display.setText(null);

        }

        // percentage

        if (e.getSource().equals(btnPer)) {

            display.setText(display.getText().concat("%"));

        }

        // division

        if (e.getSource().equals(btnDiv)) {

            display.setText(display.getText().concat("/"));

        }

        // back

        if (e.getSource().equals(btnBack)) {

            String msg = display.getText();

            String msg2 = "";

            for (int i = 0; i < msg.length() - 1; i++) {

                msg2 += msg.charAt(i);

            }

            display.setText(msg2);

        }

        // multiplication

        if (e.getSource().equals(btnMul)) {

            display.setText(display.getText().concat("*"));

        }

        // subtraction

        if (e.getSource().equals(btnSub)) {

            display.setText(display.getText().concat("-"));

        }

        // addition

        if (e.getSource().equals(btnAdd)) {

            display.setText(display.getText().concat("+"));

        }

        // equal

        if (e.getSource().equals(btnEqual)) {

            String msg = display.getText();

            String num = "";
            
            try {

                for (int i = 0; i < msg.length(); i++) {

                    if (msg.charAt(i) == '+') {

                        x += Long.parseLong(String.valueOf(num));
                        
                        num = "";

                        op = Operator.ADDITION;

                    }

                    else if (msg.charAt(i) == '-') {

                        x = Long.parseLong(String.valueOf(num));

                        num = "";

                        op = Operator.SUBTRACTION;

                    }

                    else if (msg.charAt(i) == '%') {

                        x %= Long.parseLong(String.valueOf(num));

                        num = "";

                        op = Operator.PERCENTAGE;

                    }

                    else if (msg.charAt(i) == '/') {

                        x /= Long.parseLong(String.valueOf(num));

                        num = "";

                        op = Operator.DIVISION;

                    }

                    else if (msg.charAt(i) == '*') {
                    
                        x2 *= Long.parseLong(String.valueOf(num));
                        x = x2;

                        num = "";

                        op = Operator.MULTIPLICATION;

                    }

                    else {

                        num += msg.charAt(i);

                    }

                }

                y = Long.parseLong(String.valueOf(num));
                long res;
                
                    switch (op) {

                        case ADDITION : res = x + y;
                            break;

                        case SUBTRACTION : res = x - y;
                            break;

                        case MULTIPLICATION : res = x * y;
                            break;

                        case DIVISION : res = x / y;
                            break;

                        case PERCENTAGE : res = x % y;
                            break;

                        default : res = 0;

                    };
            

                display.setText(String.valueOf(res));
                x = 0;
                x2 = 1;

            } catch (Exception exception) {
                display.setText("Error");
            }
        }

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override

            public void run() {

                new Demo();

            }

        });

    }

}
