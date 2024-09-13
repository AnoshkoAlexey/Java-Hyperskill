package javaSwing.theBasicWindowInSwing.swingComponents.introductionToSwingComponents;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloFrame extends JFrame{

    public HelloFrame() {
        super("Hello App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);

        JLabel nameLabel = new JLabel();
        nameLabel.setText("Your Name");
        nameLabel.setBounds(40, 20, 100, 30);
        add(nameLabel);
    }
    
    public static void main(String[] args) {
        new HelloFrame();
    }
}
