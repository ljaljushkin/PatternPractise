package strong_bridge;

public abstract class Shape {

    //TODO: not able to make it private!
    IDrawer d = null;

    abstract void draw();

    //TODO: not able to make it protected!
    void drawLine(int x1, int y1, int x2, int y2) {
        d.drawLine(x1, y1, x2, y2);
    }

    void drawEllipse(int x, int y, int r1, int r2) {
        d.drawLine(x, y, r1, r2);
    }
}
