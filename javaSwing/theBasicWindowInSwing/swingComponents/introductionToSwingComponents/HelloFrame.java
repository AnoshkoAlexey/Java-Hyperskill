package javaSwing.theBasicWindowInSwing.swingComponents.introductionToSwingComponents;

import javax.swing.JFrame;

public class HelloFrame extends JFrame{

    public HelloFrame() {
        super("Hello App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new HelloFrame();
    }
}
