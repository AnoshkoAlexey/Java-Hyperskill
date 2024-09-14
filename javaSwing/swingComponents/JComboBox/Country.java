package javaSwing.swingComponents.JComboBox;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Country {
    private final static String[] COUNTRIES = 
        {"Ethiopia", "Turkey", "Greece", "Iraq", "Serbia", "Colombia"};
    
    public void start() {
        JFrame frame = createFrame();
        JComboBox<String> comboBox = createComboBox();

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Combobox value was changed");
            }
        });

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
