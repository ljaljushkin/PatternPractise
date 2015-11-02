
public class ConsolePainter implements IPainter {

    public void drawLine(int x1, int y1, int x2, int y2) {
        System.out.println("Line painted at : " + x1 + "," + y1 + " : " + x2 + "," + y2);
    }

    public void drawRectangle(int x, int y, int width, int height) {
        System.out.println("Rectangle painted at : " + x + "," + y + " with width " + width + " and height " + height);
    }

    public void drawEllipse(int x, int y, int rx, int ry) {
        System.out.println("Ellipse painted at : " + x + "," + y + " with rx " + rx + " and ry " + ry);
    }

    public void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        System.out.println("Rectangle painted at : " + x1 + "," + y1 + " : " + x2 + "," + y2 + " : " + x3 + "," + y3);
    }
}
