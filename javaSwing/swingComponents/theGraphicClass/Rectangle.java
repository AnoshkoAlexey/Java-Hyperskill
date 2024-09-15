package javaSwing.swingComponents.theGraphicClass;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Rectangle extends JFrame {

    private boolean drawShape;

    private class ShapeAction implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            drawShape = true;
            repaint();
        }
    }

    public static void main(String[] args) {
        Rectangle drawing = new Rectangle();
        drawing.setVisible(true);
    }

    public Rectangle() {
        super("Rectangle Picture");
        setSize(500, 500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.white);

        JButton shapeButton = new JButton("Click for a square");
        shapeButton.addActionListener(new ShapeAction());
        add(shapeButton, BorderLayout.SOUTH);

        drawShape = false;
    }
    
    public void paint(Graphics g) {
        super.paint(g);

        if (drawShape) {
            g.drawRect(250, 250, 100, 100);
        }
    }

}

