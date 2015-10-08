package strong_bridge;

public abstract class Shape {

    //TODO: not able to make it private!
    private IDrawer d = null;

    public Shape(IDrawer d) {
        this.d = d;
    }

    abstract void draw();

    //TODO: not able to make it protected!
    protected void drawLine(int x1, int y1, int x2, int y2) {
        d.drawLine(x1, y1, x2, y2);
    }

    protected void drawEllipse(int x, int y, int r1, int r2) {
        d.drawEllipse(x, y, r1, r2);
    }
}
