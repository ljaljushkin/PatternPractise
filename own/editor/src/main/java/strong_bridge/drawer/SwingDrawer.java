package strong_bridge.drawer;

import javax.swing.*;
import java.awt.*;

public class SwingDrawer implements IDrawer {

    JFrame frame;
    ShapePanel shapePanel;

    public SwingDrawer() {
        frame = new JFrame("Hello World Swing Example");
        frame.setSize(500, 500);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        shapePanel = new ShapePanel();
        frame.getContentPane().add(shapePanel);

        Graphics graphics = shapePanel.getGraphics();
        graphics.drawLine(0, 0, 100, 100);
        graphics.drawArc(100, 100, 50, 50, 0, 360);
        shapePanel.paintComponent(graphics);

        frame.validate(); // because you added panel after setVisible was called
        frame.repaint();
    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        System.out.println("!!DrawLine: (" + x1 + ":" + y1 + ")" + "(" + x2 + ":" + y2 + ")");

        Graphics graphics = shapePanel.getGraphics();
        graphics.drawLine(x1, y1, x2, y2);

        shapePanel.paintComponent(graphics);
        shapePanel.revalidate();
        shapePanel.repaint();

        frame.validate(); // because you added panel after setVisible was called
        frame.repaint();
    }

    //TODO: Ellipse = complex shape!
    public void drawEllipse(int x, int y, int r1, int r2) {
        System.out.println("drawEllipse: (" + x + ":" + y + ")" + " r1=" + r1 + " r2=" + r2);
    }

    public void fillPoly() {
    }

}
