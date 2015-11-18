package weak_bridge.shape.decorator;


import weak_bridge.drawer.IDrawer;
import weak_bridge.shape.Shape;

public abstract class Decorator extends Shape {

    protected Shape shape;

    public Decorator(Shape s) {
        shape = s;
    }

    public void draw(IDrawer drawer) {
        shape.draw(drawer);
    }

    public abstract Decorator clone();
}
