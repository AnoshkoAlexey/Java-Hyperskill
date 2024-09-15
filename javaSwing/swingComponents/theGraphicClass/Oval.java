package javaSwing.swingComponents.theGraphicClass;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Oval extends JFrame {

    public static void main(String[] args) {
        Oval drawing = new Oval();
        drawing.setVisible(true);
    }

    public Oval() {
        super("Oval Picture");

        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillOval(250, 250, 50, 50);
    }
    
}
