package javaSwing.theBasicWindowInSwing.swingComponents.introductionToSwingComponents;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HelloFrame extends JFrame{

    public HelloFrame() {
        super("Hello App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel nameLabel = new JLabel();
        nameLabel.setText("Your Name");
        nameLabel.setBounds(40, 20, 100, 30);
        add(nameLabel);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(160, 20, 100, 30);
        add(nameTextField);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new HelloFrame();
    }


}
