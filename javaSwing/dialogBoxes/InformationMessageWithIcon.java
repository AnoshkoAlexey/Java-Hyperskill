package javaSwing.dialogBoxes;

import javax.swing.*;

public class InformationMessageWithIcon {

    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("javaSwing/dialogBoxes/Hi.jpg");
        JOptionPane.showMessageDialog(
            null,
            "Welcome",
            "Display image",
            JOptionPane.INFORMATION_MESSAGE,
            icon);
    }
}
