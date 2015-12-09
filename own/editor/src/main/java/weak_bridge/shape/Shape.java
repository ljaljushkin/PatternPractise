package weak_bridge.shape;

import weak_bridge.drawer.IDrawer;

import java.util.Comparator;

public abstract class Shape implements Cloneable {

    public abstract void draw(IDrawer d);

    public Shape clone() throws CloneNotSupportedException {

        Shape copy;
        copy = (Shape) super.clone();

        // deep clone member fields here TODO: example?

        return copy;
    }

    public abstract Double getArea();

    public abstract Double getPerimeter();

    public static class Comparators {

        public static Comparator<Shape> AREA = new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                return s1.getArea().compareTo(s2.getArea());
            }
        };

        public static Comparator<Shape> PERIMETER = new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                return s1.getPerimeter().compareTo(s2.getPerimeter());
            }
        };
    }
}
