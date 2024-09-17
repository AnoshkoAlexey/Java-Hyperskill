package javaSwing.layoutManagers;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample extends JFrame {

    public BorderLayoutExample() {
        super("Border Layout");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.add(new JButton("One"));
        panel.add(new JButton("Two"));
        add(panel, BorderLayout.NORTH);
        add(panel, BorderLayout.NORTH);
        add(new JButton("East"), BorderLayout.EAST);
        add(new JButton("South"), BorderLayout.SOUTH);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("Center"), BorderLayout.CENTER);
        
        setVisible(true);      
           
    }
    
    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
