import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import java.io.*;

public class demo implements ActionListener {

    JFrame frame = new JFrame();
    GridBagConstraints c = new GridBagConstraints();
    JLabel fileName = new JLabel("File name");
    JTextField nameField = new JTextField(10);
    JButton btn = new JButton("Search");
    JLabel display = new JLabel();
    JScrollBar scrollBar = new JScrollBar();

    demo() {
        frame.setLayout(new GridBagLayout());
        frame.setSize(new Dimension(400, 300));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        c.insets = new Insets(5, 5, 5, 5);

        c.gridx=0;
        c.gridy=0;
        frame.add(fileName, c);
        c.gridx=1;
        c.gridy=0;
        frame.add(nameField, c);
        c.gridx=0;
        c.gridy=1;
        c.gridwidth=2;
        frame.add(btn, c);

        btn.addActionListener(this);
        nameField.addActionListener(this);
        frame.validate();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Search") || e.getSource() == nameField) {
            FileInputStream fin = null;
            int i;
            String str = "";
            String file = nameField.getText();
            file += ".txt";
            try {
                fin = new FileInputStream(file);

                do {
                    i = fin.read();
                    if(i != -1) { str += (char)i; }
                } while(i != -1);

                display.setText(str);

            } catch(FileNotFoundException exc) {
                JOptionPane.showMessageDialog(btn, "File Not Found");
            } catch(IOException exc2) {
                JOptionPane.showMessageDialog(btn, "Data couldn't read");
            } finally {
                try {
                    if(fin != null) {
                        fin.close();
                    }
                } catch(IOException exc3) {
                    JOptionPane.showMessageDialog(btn, "File couldn't close");
                }
            }
            scrollBar.add(display);
            c.gridx=0;
            c.gridy=2;
            frame.add(scrollBar, c);
            frame.validate();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new demo();
            }
        });
    }
}