package javaSwing.swingComponents.JMenu;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuExample extends JFrame {
    public MenuExample() {
        super("Menu Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(fileMenu);

        JMenu newMenu = new JMenu("New");
        JMenuItem textFileMenuItem = new JMenuItem("Text File");
        JMenuItem imgFileMenuItem = new JMenuItem("Image File");
        JMenuItem folderMenuItem = new JMenuItem("Folder");

        newMenu.add(textFileMenuItem);
        newMenu.add(imgFileMenuItem);
        newMenu.add(folderMenuItem);
        
        fileMenu.add(newMenu);

        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem closeMenuItem = new JMenuItem("Close");
        JMenuItem closeAllMenuItem = new JMenuItem("Close All");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        fileMenu.add(openMenuItem);
        fileMenu.add(closeMenuItem);
        fileMenu.add(closeAllMenuItem);

        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        exitMenuItem.addActionListener(event -> System.exit(0));

        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuExample();
    }
    
}
