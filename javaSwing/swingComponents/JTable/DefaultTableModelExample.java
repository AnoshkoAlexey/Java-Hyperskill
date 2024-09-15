package javaSwing.swingComponents.JTable;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DefaultTableModelExample extends JFrame {

    public static void main(String[] args) {
        DefaultTableModelExample table = new DefaultTableModelExample();
        table.setVisible(true);
    }
    
    public DefaultTableModelExample() {
        super("JTable Default Model");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);

        Object[] columns = new Object[] {"Name", "Race"};
        Object[][] data = new Object[][] {
            {"Frodo", "Hobbit"},
            {"Legolas", "Elf"},
            {"Gimli", "Dwarf"}
        };

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);        
        for (Object[] row : data) {
            model.addRow(row);
        }

        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        this.add(sp);
    }
}
