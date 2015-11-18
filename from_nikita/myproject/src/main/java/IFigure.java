
public interface IFigure {

    public IFigure clone() throws CloneNotSupportedException;

    void draw(IPainter painter);
}
