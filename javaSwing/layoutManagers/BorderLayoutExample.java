package javaSwing.layoutManagers;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    public BorderLayoutExample() {
        super("Border Layout");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());
        add(new JButton("North"), java.awt.BorderLayout.NORTH);
        add(new JButton("East"), java.awt.BorderLayout.EAST);
        add(new JButton("South"), java.awt.BorderLayout.SOUTH);
        add(new JButton("West"), java.awt.BorderLayout.WEST);
        add(new JButton("Center"), java.awt.BorderLayout.CENTER);
        
        setVisible(true);      
           
    }
    
    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
