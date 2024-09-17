package javaSwing.dialogBoxes;

import javax.swing.*;

public class ConfirmDialogBox {

    public static void main(String[] args) {
        int optionIndex = JOptionPane.showConfirmDialog(
            null,
            "Are you sure?",
            "Your final choice",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE);
        
        if (optionIndex == JOptionPane.YES_OPTION) {
            System.out.println("The user pressed YES!");
        }
    }

}
