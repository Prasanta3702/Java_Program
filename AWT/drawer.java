import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.imageio.*;

public class drawer extends Frame {
    GridBagConstraints c = new GridBagConstraints();
    Frame f;

    Panel drawerPanel = new Panel();
    Panel mainPanel = new Panel();

    Button drawerButton = new Button("≡");

    Image logoImage;
    List list = new List();

    public drawer() {
        setSize(new Dimension(800, 500));
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        f = this;

        /*
         * Constraints
         */
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;

        /*
         * Add drawer panel
         */
        drawerPanel.setLayout(new GridBagLayout());
        drawerPanel.setPreferredSize(new Dimension(220, 0));
        c.gridx = 0;
        c.gridy = 0;
        add(drawerPanel, c);

        /*
         * Component for drawer Panel
         */
        GridBagConstraints c2 = new GridBagConstraints();
        c2.weightx=1;
        c2.fill=GridBagConstraints.BOTH;
        c2.anchor = GridBagConstraints.PAGE_START;

        Panel logoPanel = new Panel();
        logoPanel.setLayout(new BorderLayout());
        logoPanel.setPreferredSize(new Dimension(0, 150));
        logoPanel.setBackground(Color.blue);

        /*
         * Add image into logo panel
         */
        ImageIcon icon = new ImageIcon("D:\\Background\\login.png");
        Image img = icon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        icon = new ImageIcon(img);
        JLabel imageIcon = new JLabel(icon);
        logoPanel.add(imageIcon, BorderLayout.CENTER);

        // name and detials 
        Panel namePanel = new Panel(new FlowLayout(FlowLayout.CENTER));
        namePanel.add(new Label("Prasanta Roy"));
        logoPanel.add(namePanel, BorderLayout.SOUTH);

        // add logo panel
        c.gridx=0;
        c.gridy=0;
        drawerPanel.add(logoPanel, c2);

        JPanel programPanel = new JPanel(new GridBagLayout());
        programPanel.setBackground(Color.cyan);
        c2.gridy=1;
        c2.weighty=1;
        drawerPanel.add(programPanel, c2);

        /*
         * List item
         */
        list.setFont(new Font("Consolas", Font.PLAIN, 16));
        list.add("Phone");
        list.add("Contact");
        list.add("Message");
        list.add("Security");

        /*
         * add list into program panel
         */
        c.weightx = 1;
        programPanel.add(list, c);
        c.weightx = 0;

        /*
         * Hide drawer panel
         */
        drawerPanel.setVisible(true);

        /*
         * add Main panel
         */
        mainPanel.setBackground(Color.gray);
        mainPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        c.weightx = 1;
        c.gridx = 1;
        add(mainPanel, c);
        /*
         * Button Edit
         */
        drawerButton.setPreferredSize(new Dimension(30, 30));
        drawerButton.setFont(new Font("Arial", Font.PLAIN, 15));
        // drawerButton.setBackground(Color.gray);
        // drawerButton.setForeground(Color.blue);

        /*
         * Component for Main panel
         */
        mainPanel.add(drawerButton);
        mainPanel.add(new Label("Prasanta Roy"), c);

        /*
         * Action Listener for drawer button
         */
        drawerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(drawerPanel.isShowing()) {
                    drawerPanel.setVisible(false);
                }
                else {
                    drawerPanel.setVisible(true);
                }
                f.validate();
            }
        });

         /*
         * Add Item Listener in list item
         */
        list.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                if(list.getSelectedItem().equals("Phone")) {
                    mainPanel.setBackground(Color.green);
                    f.validate();
                }
                else if(list.getSelectedItem().equals("Contact")) {
                    mainPanel.setBackground(Color.cyan);
                    f.validate();
                }
                else if(list.getSelectedItem().equals("Message")) {
                    mainPanel.setBackground(Color.pink);
                    f.validate();
                }
                else if(list.getSelectedItem().equals("Security")) {
                    mainPanel.setBackground(Color.orange);
                    f.validate();
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new drawer();
    }
}