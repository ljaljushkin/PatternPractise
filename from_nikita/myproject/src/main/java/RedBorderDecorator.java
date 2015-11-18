
public class RedBorderDecorator extends Decorator {

    public RedBorderDecorator(IFigure f) {
        super(f);
    }

    @Override
    public void draw(IPainter painter) {
        painter.setBorderColor("Red");
        figure.draw(painter);
    }

    @Override
    public RedBorderDecorator clone() {
        return new RedBorderDecorator(figure);
    }

}

