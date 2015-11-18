package weak_bridge.drawer.console;

import javafx.scene.paint.Color;
import weak_bridge.drawer.IDrawer;

public class ConsoleDrawer implements IDrawer {

    public void drawLine(int x1, int y1, int x2, int y2) {
        System.out.println("DrawLine: (" + x1 + ":" + y1 + ")" + "(" + x2 + ":" + y2 + ")");
    }

    //TODO: Ellipse = complex shape!
    public void drawEllipse(int x, int y, int r1, int r2) {
        System.out.println("drawEllipse: (" + x + ":" + y + ")" + " r1=" + r1 + " r2=" + r2);
    }

    @Override
    public void drawRectangle(int x, int y, int width, int height) {
        System.out.println("drawRectangle: (" + x + ":" + y + ")" + " w=" + width + " h=" + height);
    }

    @Override
    public void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        System.out.println("drawTriangle: (" + x1 + ":" + y1 + ")" + "(" + x2 + ":" + y2 + ")" + "(" + x3 + ":" + y3 + ")");
    }

    public void fillPoly() {

    }

    @Override
    public void setBorderColor(Color color) {

    }

    @Override
    public Color getCurrentColor() {
        return Color.BLACK;
    }

    @Override
    public void setLineDashes(double... dashes) {

    }

}
