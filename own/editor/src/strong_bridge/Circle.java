package strong_bridge;

public class Circle extends Shape {

    private int r;
    private int x;
    private int y;

    public Circle(int r, int x, int y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void draw() {
        super.drawEllipse(x, y, r, r);
    }
}
