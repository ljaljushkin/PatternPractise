package strong_bridge.shape;

import strong_bridge.drawer.IDrawer;

public class Triangle extends Shape {

    private int x1, y1, x2, y2, x3, y3;

    public Triangle(IDrawer d) {
        super(d);
    }

    public void initialize(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public Shape clone(IDrawer drawer) throws CloneNotSupportedException {
        return new Triangle(drawer);
    }

    @Override
    public void draw() {
        super.drawTriangle(x1, y1, x2, y2, x3, y3);
    }
}
