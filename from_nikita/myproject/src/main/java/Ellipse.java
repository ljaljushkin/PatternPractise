
public class Ellipse extends AbstractFigure{

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

    @Override
    public Ellipse clone()throws CloneNotSupportedException {
        return new Ellipse();
    }

    @Override
    void draw(IPainter painter) {
        painter.drawEllipse(x, y, rx, ry);
    };
}
