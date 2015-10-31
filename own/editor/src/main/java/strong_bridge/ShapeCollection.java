package strong_bridge;

import java.util.ArrayList;
import java.util.Collection;

public class ShapeCollection {

    private Collection<Shape> data = new ArrayList<Shape>();

    public void add(Shape s) {
        data.add(s);
    }

    public void remove(Shape s) {
        data.remove(s);
    }

    Collection<Shape> getShapes() {
        return data;
    }
}

