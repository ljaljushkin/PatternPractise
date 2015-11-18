import java.util.ArrayList;
import java.util.Collection;

public class FigureCollection implements IFigure {

    private Collection<IFigure> collection = new ArrayList<IFigure>();

    public void addFigure(IFigure figure) {
        collection.add(figure);
    }

    public void deleteFigure(IFigure figure) {
        collection.remove(figure);
    }

    public void deleteFigureByIndex(int index) {
        collection.remove(index);
    }

    Collection<IFigure> getFigureList() {
        return collection;
    }

    public FigureCollection clone() throws CloneNotSupportedException {
        return new FigureCollection();
    }

    public void draw(IPainter painter) {
        for (IFigure figure : collection) {
            figure.draw(painter);
        }
    }
}
