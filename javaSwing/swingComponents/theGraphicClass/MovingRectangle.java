package javaSwing.swingComponents.theGraphicClass;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class MovingRectangle extends JFrame implements MouseMotionListener {

    private int rectX = 50;
    private int rectY = 50;

    public static void main(String[] args) {
        MovingRectangle drawing = new MovingRectangle();
        drawing.setVisible(true);
    }

    public MovingRectangle() {
        super("Moving Rectangle");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        addMouseMotionListener(this);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(rectX, rectY, 50, 50);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        rectX = e.getX();
        rectY = e.getY();
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) { }
}
