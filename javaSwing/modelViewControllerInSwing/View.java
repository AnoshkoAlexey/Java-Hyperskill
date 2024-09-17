package javaSwing.modelViewControllerInSwing;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class View {
    private JFrame frame;
    private JLabel label;
    private JButton button;

    public View() {
        frame = new JFrame("View");
        label = new JLabel();
        button = new JButton("Button");
        frame.getContentPane().setLayout(new BorderLayout());
        // closes on exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // window size
        frame.setSize(500, 500);
        label.setText("1");
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.getContentPane().add(button, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
    
    public void setText(String str) {
        label.setText(str);
    }

    public JButton getButton() {
        return button;
    }
}
