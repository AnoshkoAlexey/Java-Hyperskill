package javaSwing.swingComponents.JTable;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample extends JFrame {
    public static void main(String[] args) {
        JTableExample table = new JTableExample();
        table.setVisible(true);
    }

    public JTableExample() {
        super("JTable Example");

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);

        MyTableModel tableModel = new MyTableModel();
        JTable table = new JTable(tableModel);

        JScrollPane sp = new JScrollPane(table);
        this.add(sp);
    }
    
}
