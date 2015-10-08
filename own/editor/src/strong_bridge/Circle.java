package strong_bridge;

public class Circle extends Shape {

    private int r;
    private int x;
    private int y;

    public Circle(IDrawer d, int r, int x, int y) {
        super(d);
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public void draw() {
        super.drawEllipse(x, y, r, r);
    }
}
