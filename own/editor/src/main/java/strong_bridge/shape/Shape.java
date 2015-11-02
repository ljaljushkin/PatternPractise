package strong_bridge.shape;

import strong_bridge.drawer.IDrawer;

public abstract class Shape {

    private IDrawer drawer;

    public Shape(IDrawer drawer) {
        this.drawer = drawer;
    }

    protected abstract Shape clone(IDrawer drawer) throws CloneNotSupportedException;

    // factory method
    public Shape clone() throws CloneNotSupportedException {
        return clone(drawer);
    }

    public abstract void draw();

    protected void drawLine(int x1, int y1, int x2, int y2) {
        drawer.drawLine(x1, y1, x2, y2);
    }

    protected void drawEllipse(int x, int y, int r1, int r2) {
        drawer.drawEllipse(x, y, r1, r2);
    }

    protected void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        drawer.drawTriangle(x1, y1, x2, y2, x3, y3);
    }

    protected void drawRectangle(int x, int y, int w, int h) {
        drawer.drawRectangle(x, y, w, h);
    }

    public void setDrawer(IDrawer drawer) {
        this.drawer = drawer;
    }
}
