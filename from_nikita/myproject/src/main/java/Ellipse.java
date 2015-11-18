
public class Ellipse implements IFigure {

    private int x, y, rx, ry;

    public Ellipse() {
        super();
    }

    public void init(int x, int y, int rx, int ry) {
        this.x = x;
        this.y = y;
        this.rx = rx;
        this.ry = ry;
    }

    public Ellipse clone()throws CloneNotSupportedException {
        return new Ellipse();
    }

    public void draw(IPainter painter) {
        painter.drawEllipse(x, y, rx, ry);
    };
}
