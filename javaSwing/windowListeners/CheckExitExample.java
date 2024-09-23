package javaSwing.windowListeners;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CheckExitExample extends JFrame {

    private class CheckOnExit extends WindowAdapter {

        public void windowClosing(WindowEvent e) {
            ComfirmWindow confirmWindow = new ComfirmWindow();
            confirmWindow.setVisible(true);
        }
    }

    private class ComfirmWindow extends JFrame implements ActionListener {

        public ComfirmWindow() {
            setSize(250, 250);
            setLayout(new BorderLayout());
            JLabel confirmLabel = new JLabel("Are you sure you want to exit?", SwingConstants.CENTER);
            add(confirmLabel, BorderLayout.CENTER);

            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new FlowLayout());

            JButton exitButton = new JButton("Yes");
            exitButton.addActionListener(this);
            buttonPanel.add(exitButton);

            JButton cancelButton = new JButton("No");
            cancelButton.addActionListener(this);
            buttonPanel.add(cancelButton);

            add(buttonPanel, BorderLayout.SOUTH);
        }

        public void actionPerformed(ActionEvent e) {
            String action = e.getActionCommand();

            if (action.equals("Yes")) {
                System.exit(0);
            } else if (action.equals("No")) {
                dispose();
            }
        }
    }
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
