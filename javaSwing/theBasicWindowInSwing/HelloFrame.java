package javaSwing.theBasicWindowInSwing;

import javax.swing.*;

public class HelloFrame extends JFrame {

    public HelloFrame() {
        super("My First Swing App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        Runnable initFrame = new Runnable() {
            @Override
            public void run() {
                new HelloFrame();
            }
        };
        SwingUtilities.invokeAndWait(initFrame);
    }
}