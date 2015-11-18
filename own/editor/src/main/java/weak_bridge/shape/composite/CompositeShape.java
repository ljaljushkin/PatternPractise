package weak_bridge.shape.composite;

import weak_bridge.drawer.IDrawer;
import weak_bridge.shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape extends Shape {
    private List<Shape> shapesList = new ArrayList<Shape>();

    public CompositeShape() {
        super();
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        return new CompositeShape();
    }

    public void add(Shape shape) {
        shapesList.add(shape);
    }

    public void remove(Shape shape) {
        shapesList.remove(shape);
    }

    @Override
    public void draw(IDrawer d) {
        for (Shape shape : shapesList) {
            shape.draw(d);
        }
    }
}
