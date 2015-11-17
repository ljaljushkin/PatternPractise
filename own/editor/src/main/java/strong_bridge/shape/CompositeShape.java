package strong_bridge.shape;

import strong_bridge.drawer.IDrawer;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape extends Shape {

    //Collection of child graphics.
    private List<Shape> shapesList = new ArrayList<Shape>();


    public CompositeShape(IDrawer drawer) {
        super(drawer);
    }

    @Override
    protected Shape clone(IDrawer drawer) throws CloneNotSupportedException {
        return new CompositeShape(drawer);
    }

    @Override
    public void draw() {
        for (Shape shape : shapesList) {
            shape.draw();
        }
    }

    public void add(Shape shape) {
        shapesList.add(shape);
    }

    public void remove(Shape shape) {
        shapesList.remove(shape);
    }
}
