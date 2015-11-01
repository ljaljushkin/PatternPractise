package strong_bridge.shape;

import strong_bridge.drawer.IDrawer;

public class Rectangle extends Shape {

    private int x, y, w, h; // x,t left down corner

    public Rectangle(IDrawer d) {
        super(d);
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        return new Rectangle(d);
    }

    public void initialize(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw() {
        super.drawLine(x, y, x + w, y);
        super.drawLine(x, y, x, y + h);
        super.drawLine(x, y + h, x + w, y + h);
        super.drawLine(x + w, y, x + w, y + h);
    }
}
