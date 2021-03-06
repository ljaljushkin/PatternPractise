package weak_bridge.shape;

import weak_bridge.drawer.IDrawer;

public class Triangle extends Shape {

    private int x1, y1, x2, y2, x3, y3;

    public Triangle() {
        super();
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
    public Shape clone() throws CloneNotSupportedException {
        return new Triangle();
    }

    @Override
    public Double getArea() {
        return Math.abs(0.5 * ((x1 - x3) * (y2 - y3) - (y1 - y3) * (x2 - x3)));
    }

    @Override
    public Double getPerimeter() {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)) +
                Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3)) +
                Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
    }

    @Override
    public void draw(IDrawer d) {
        d.drawTriangle(x1, y1, x2, y2, x3, y3);
    }
}
