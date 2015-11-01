package weak_bridge.shape;

import weak_bridge.drawer.IDrawer;

public abstract class Shape implements Cloneable {

    public abstract void draw(IDrawer d);

    public Shape clone() throws CloneNotSupportedException {

        Shape copy;
        copy = (Shape) super.clone();

        // deep clone member fields here TODO: example?

        return copy;
    }
}
