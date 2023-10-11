import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class MainActivity implements ActionListener {

    JMenuBar menuBar = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu options = new JMenu("Options");
    JMenu help = new JMenu("Help");
    
    JMenuItem open = new JMenuItem("Open");
    JMenuItem close  = new JMenuItem("Close");
    JMenuItem save = new JMenuItem("Save");
    JMenuItem exit = new JMenuItem("Exit");

    JMenuItem about = new JMenuItem("About");

    GridBagConstraints c = new GridBagConstraints();
    GridBagConstraints c2 = new GridBagConstraints();

    JFrame frame = new JFrame();
    JPanel panel1 = new JPanel();

    JTextArea editor = new JTextArea();

    JButton newFile = new JButton("New File");
    JButton saveFile = new JButton("Save File");

    public MainActivity() {
        frame.setLayout(new GridBagLayout());
        frame.setLocationRelativeTo(null);
        frame.setSize(new Dimension(600, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setTitle("Notepad");
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);

        /*
         * Menu bar
         */

        file.add(open);
        file.add(close);
        file.add(save);
        file.add(exit);

        help.add(about);

        menuBar.add(file);
        menuBar.add(options);
        menuBar.add(help);

        /*
         * Register components to actionListener
         */
        open.addActionListener(this);
        close.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        panel1.setLayout(new GridBagLayout());

        JScrollPane jsp = new JScrollPane(panel1);

        c.weighty=1;
        c.weightx=1;
        c.fill = GridBagConstraints.BOTH;
        c.gridx=0;
        c.gridy=0;
        frame.add(jsp, c);

            editor.setFont(new Font("Consolas", Font.PLAIN, 18));

            c.insets = new Insets(5, 5, 5, 5);
            c.gridx=0;
            c.gridy=0;
            panel1.add(editor, c);

        frame.validate();
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
        if(e.getActionCommand().equals("Close")) {
            editor.setText(null);
        }
        if(e.getActionCommand().equals("Open")) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Open a file");
            int openIndex = fileChooser.showOpenDialog(fileChooser);

            if(openIndex == JFileChooser.APPROVE_OPTION) {
                File openFile = fileChooser.getSelectedFile();
                String location = openFile.getAbsolutePath();
                
                FileInputStream fin = null;
                int i;

                try {
                    fin = new FileInputStream(location);

                    do {
                        i = fin.read();
                        if(i != -1) {
                            editor.setText(editor.getText()+(char)i);
                        }
                    } while(i != -1);

                } catch(FileNotFoundException exception) {
                    JOptionPane.showConfirmDialog(fileChooser, "File Not Found");
                } catch(IOException exception2) {
                    JOptionPane.showMessageDialog(fileChooser, "File couldn't read");
                } finally {
                    try {
                        if(fin != null) {
                            fin.close();
                        }
                    } catch(IOException exception3) {
                        JOptionPane.showMessageDialog(fileChooser, "File couldn't close");
                    }
                }
            }
        }
        if(e.getActionCommand().equals("Save")) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save as specifies location");

            int saveIndex = fileChooser.showSaveDialog(fileChooser);

            if(saveIndex == JFileChooser.APPROVE_OPTION) {
                File saveLocation = fileChooser.getSelectedFile();
                String message = editor.getText();
                String location = saveLocation.getAbsolutePath();
        
                int i, j;
                FileOutputStream fout = null;

                try {
                    fout = new FileOutputStream(location, true);

                    for(i = 0; i < message.length(); i++) {
                        j = message.charAt(i);
                        fout.write(j);
                    }

                } catch(FileNotFoundException exception) {
                    JOptionPane.showMessageDialog(fileChooser, "File Not Found");
                } catch(IOException exception2) {
                    JOptionPane.showMessageDialog(fileChooser, "File couldn't write"); 
                } finally {
                    try {
                        if(fout != null) {
                            fout.close();
                        }
                    } catch(IOException exception3) {
                        JOptionPane.showMessageDialog(fileChooser, "File couldn't close");
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainActivity();
            }
        });
    }
}
