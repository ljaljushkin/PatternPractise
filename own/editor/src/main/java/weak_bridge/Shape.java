package weak_bridge;

public abstract class Shape implements Cloneable {

    abstract void draw(IDrawer d);

    protected Shape clone() throws CloneNotSupportedException {

        Shape copy;
        copy = (Shape) super.clone();

        // deep clone member fields here TODO: example?

        return copy;
    }
}
