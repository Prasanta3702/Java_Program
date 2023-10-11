import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Menus implements ActionListener {
    JFrame frame = new JFrame();
    JMenuBar menuBar = new JMenuBar();
    JLabel lab = new JLabel("welcome");

    Menus() {
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        frame.setSize(new Dimension(500, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Menu Example");
        frame.setVisible(true);

        // create a file menu
        JMenu jmFile = new JMenu("File");
            JMenuItem open = new JMenuItem("Open");
            JMenuItem close = new JMenuItem("Close");
            JMenuItem save = new JMenuItem("Save");
            JMenuItem exit = new JMenuItem("Exit");
        jmFile.add(open);
        jmFile.add(close);
        jmFile.add(save);
        jmFile.add(exit);

        // create a options menu
        JMenu jmOptions = new JMenu("Options");
            // create colors menu
            JMenu colors = new JMenu("Colors");
                // create colors menuItem
                JMenuItem red = new JMenuItem("Red");
                JMenuItem green = new JMenuItem("Green");  
                JMenuItem blue = new JMenuItem("Blue");
                // add colors item to colors menu
                colors.add(red);
                colors.add(green);
                colors.add(blue);
            // add colors menu to options menu
            jmOptions.add(colors);

            // create a priority menu
            JMenu priority = new JMenu("Priority");
                // create the submenu of priority
                JMenuItem high = new JMenuItem("High");
                JMenuItem low = new JMenuItem("Low");
                // add submenu to priority menu
                priority.add(high);
                priority.add(low);
            // add priority to options menu
            jmOptions.add(priority);

            // create a reset menu item
            JMenuItem reset = new JMenuItem("Reset");
            // add to options menu
            jmOptions.add(reset);

        // creata help menu
        JMenu help = new JMenu("Help");
            // create submenu
            JMenuItem about = new JMenuItem("About");
            help.add(about);

        // file menu add to menubar
        menuBar.add(jmFile);
        // options menus add to menubar
        menuBar.add(jmOptions);
        // add help menu to menubar
        menuBar.add(help);

        // register action listener to the component
        exit.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        close.addActionListener(this);
        
        frame.add(lab);
        frame.setJMenuBar(menuBar);
        frame.validate();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Exit")) {
            System.exit(0); 
        }
        else if(e.getActionCommand().equals("Save")) {
            JFileChooser fileChooser = new JFileChooser();
            
            int userSelection = fileChooser.showSaveDialog(frame);

            if(userSelection == JFileChooser.APPROVE_OPTION) {
                File saveToFile = fileChooser.getSelectedFile();
                JOptionPane.showMessageDialog(frame, "Save as file: "+saveToFile.getAbsolutePath());
            }
        }
        else {
            lab.setText(e.getActionCommand()+"Selected");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Menus();
            }
        });
    }
}
