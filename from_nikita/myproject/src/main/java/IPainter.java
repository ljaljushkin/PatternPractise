
public interface IPainter {

    void changeScale(double x, double y);

    void changeAlpha(double alpha);

    void drawLine(int x1, int y1, int x2, int y2);

    void drawRectangle(int x, int y, int width, int height);

    void drawEllipse(int x, int y, int rx, int ry);

    void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3);
}
