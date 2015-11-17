package weak_bridge.shape;

import weak_bridge.drawer.IDrawer;

public class Circle extends Shape {

    private int x, y, r;

    public Circle() {
        super();
    }

    public void initialize(int r, int x, int y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public void draw(IDrawer d) {
        d.drawEllipse(x, y, r, r);
    }
}
