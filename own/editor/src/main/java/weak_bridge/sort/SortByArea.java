package weak_bridge.sort;

import weak_bridge.shape.Shape;

import java.util.Comparator;


public class SortByArea implements Comparator<Shape> {

    @Override
    public int compare(Shape s1, Shape s2) {
        return s1.getArea().compareTo(s2.getArea());
    }

}
