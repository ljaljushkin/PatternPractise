import java.util.ArrayList;
import java.util.Collection;

public class FigureCollection {

    Collection<AbstractFigure> collection = new ArrayList<AbstractFigure>();

    public void addFigure(AbstractFigure figure) {
        collection.add(figure);
    }

    public void deleteFigure(AbstractFigure figure) {
        collection.remove(figure);
    }

    public void deleteFigureByIndex(int index) {
        collection.remove(index);
    }

    Collection<AbstractFigure> getFigureList() {
        return collection;
    }

    public void redrawCollection(IPainter painter) {
        for (AbstractFigure figure : collection) {
            figure.draw(painter);
        }
    }
}
