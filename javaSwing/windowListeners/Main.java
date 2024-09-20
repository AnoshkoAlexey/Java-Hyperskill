package javaSwing.windowListeners;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        CheckExitExample demoWindow = new CheckExitExample();
        demoWindow.setVisible(true);
    }

    public CheckExitExample() {
        setSize(300, 300);
        setTitle("Window Listener");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new CheckOnExit());
    }
}
