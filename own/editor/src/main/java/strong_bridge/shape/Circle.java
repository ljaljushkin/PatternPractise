package strong_bridge.shape;

import strong_bridge.drawer.IDrawer;

public class Circle extends Shape {

    private int r;
    private int x;
    private int y;

    public Circle(IDrawer drawer) {
        super(drawer);
    }

    @Override
    protected Shape clone(IDrawer drawer) throws CloneNotSupportedException {
        return new Circle(drawer);
    }

    public void initialize(int r, int x, int y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public void draw() {
        super.drawEllipse(x, y, r, r);
    }
}
