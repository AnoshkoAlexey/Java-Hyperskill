package javaSwing.swingComponents.JTable;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class JTableExample2 extends JFrame {

    public static void main(String[] args) {
        JTableExample2 table = new JTableExample2();
        table.setVisible(true);
    }

    public JTableExample2() {

        super("JTable example");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);

        MyTableModel tableModel = new MyTableModel();
        JTable table = new JTable(tableModel);

        TableColumn column = table.getColumnModel().getColumn(0);
        column.setPreferredWidth(200);

        JScrollPane sp = new JScrollPane(table);
        this.add(sp);
    }
}
