
public abstract class AbstractFigure {

    public AbstractFigure() { }

    public abstract AbstractFigure clone() throws CloneNotSupportedException;

    abstract void draw(IPainter painter);
}
