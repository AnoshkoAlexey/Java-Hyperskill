package javaSwing.swingComponents.JComboBox;

import java.awt.*;
import javax.swing.*;

public class Country {
    private final static String[] COUNTRIES = 
        {"Ethiopia", "Turkey", "Greece", "Iraq", "Serbia", "Colombia"};
    
    public void start() {
        JFrame frame = createFrame();
        JComboBox<String> comboBox = createComboBox();
        frame.add(comboBox);
        frame.setVisible(true);
    }
    
    private JFrame createFrame() {
        JFrame frame = new JFrame("Country");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        return frame;
    }
    
    private JComboBox<String> createComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(COUNTRIES);
        JComboBox<String> comboBox = new JComboBox<>(model);
        comboBox.setSelectedIndex(0); // choose the default option
        return comboBox;
    }
}
