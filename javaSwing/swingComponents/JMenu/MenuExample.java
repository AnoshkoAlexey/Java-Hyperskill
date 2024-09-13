package javaSwing.swingComponents.JMenu;

import javax.swing.JFrame;

public class MenuExample extends JFrame {
    public MenuExample() {
        super("Menu Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuExample();
    }
    
}
