package javaSwing.swingComponents.JTable;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class JTableExample3 extends JFrame {

    public static void main(String[] args) {
        JTableExample3 table = new JTableExample3();
        table.setVisible(true);
    }

    public JTableExample3() {
        super("JTable Example 3");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);

        TableModel tableModel = new MyTableModel();
        JTable table = new JTable(tableModel);

        // Add the TableModelListener
        tableModel.addTableModelListener(new CustomListener());
        
        JScrollPane sp = new JScrollPane(table);
        this.add(sp);

        tableModel.setValueAt("James", 0,0);
    }

    class CustomListener implements TableModelListener {
        @Override
        public void tableChanged(TableModelEvent e) {
            System.out.println("Table Updated!");
        }
    }
}
