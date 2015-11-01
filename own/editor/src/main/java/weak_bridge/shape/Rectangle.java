package weak_bridge.shape;

import weak_bridge.drawer.IDrawer;

public class Rectangle extends Shape {

    private int x;
    private int y;
    private int w;
    private int h; // x,t left down corner

    public Rectangle() {
        super();
    }

    public void initialize(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw(IDrawer d) {
        d.drawLine(x, y, x + w, y);
        d.drawLine(x, y, x, y + h);
        d.drawLine(x, y + h, x + w, y + h);
        d.drawLine(x + w, y, x + w, y + h);
    }
}
