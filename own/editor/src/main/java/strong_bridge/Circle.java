package strong_bridge;

public class Circle extends Shape {

    private int r;
    private int x;
    private int y;

    public Circle(IDrawer d) {
        super(d);
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
