package javaSwing.dialogBoxes;

import javax.swing.JOptionPane;

public class DialogBox2 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(
            null,
            "Enter your name",
            "Input Box",
            JOptionPane.QUESTION_MESSAGE);
    }
}
