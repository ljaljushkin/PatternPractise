package strong_bridge.shape;

import strong_bridge.drawer.IDrawer;

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

    public Collection<Shape> getShapes() {
        return data;
    }

    public void redraw() {
        for (Shape shape : data) {
            shape.draw();
        }
    }

    public void changeDrawer(IDrawer d) {
        for (Shape shape : data) {
            shape.setDrawer(d);
        }
    }
}

