package strong_bridge;

public abstract class Shape implements Cloneable {

    protected IDrawer d = null;

    public Shape(IDrawer d) {
        this.d = d;
    }

    protected Shape clone() throws CloneNotSupportedException {
        Shape copy;
        copy = (Shape) super.clone();

        // deep clone member fields here TODO: example?

        return copy;
    }

    abstract void draw();

    protected void drawLine(int x1, int y1, int x2, int y2) {
        d.drawLine(x1, y1, x2, y2);
    }

    protected void drawEllipse(int x, int y, int r1, int r2) {
        d.drawEllipse(x, y, r1, r2);
    }
}
