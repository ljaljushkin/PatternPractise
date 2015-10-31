package weak_bridge;

public class Circle extends Shape {

    private int x, y, r;

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public void draw(IDrawer d) {
        d.drawEllipse(x, y, r, r);
    }
}
