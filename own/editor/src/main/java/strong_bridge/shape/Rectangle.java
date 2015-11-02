package strong_bridge.shape;

import strong_bridge.drawer.IDrawer;

public class Rectangle extends Shape {

    private int x, y, w, h; // x,t left down corner

    public Rectangle(IDrawer drawer) {
        super(drawer);
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        return new Rectangle(drawer);
    }

    public void initialize(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public void draw() {
        super.drawRectangle(x, y, w, h);
    }
}
