public class Rectangle extends AbstractFigure {

    private int x, y, width, height;

    public Rectangle() {
        super();
    }

    public void init(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return new Rectangle();
    }

    @Override
    void draw(IPainter painter) {
        painter.drawRectangle(x, y, width, height);
    }

    ;
}
