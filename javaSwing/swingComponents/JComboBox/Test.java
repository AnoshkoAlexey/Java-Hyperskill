package javaSwing.swingComponents.JComboBox;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class Test {

    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Corgi");
        comboBox.addItem("Dog");
        comboBox.addItem("Hound");
        comboBox.addItem("Lapdog");

        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        String[] dogsStr = {"Corgi", "Dog", "Hound", "Lapdog"};
        for (String dog: dogsStr) {
            comboBoxModel.addElement(dog);
        }
        JComboBox comboBox2 = new JComboBox(comboBoxModel);

        String[] dogsStr2 = {"Corgi", "Dog", "Hound", "Lapdog"};
        JComboBox comboBox3 = new JComboBox(dogsStr2);
        
    }
    
}
