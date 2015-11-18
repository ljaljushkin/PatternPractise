public abstract class Decorator implements IFigure {

    protected IFigure figure;

    public Decorator(IFigure f) {
        figure = f;
    }

    public void draw(IPainter painter) {
        figure.draw(painter);
    }

    public abstract Decorator clone();
}
