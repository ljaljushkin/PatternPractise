package weak_bridge.sort;

import weak_bridge.shape.Shape;

public class SortByPerimeter {
    public int compare(Shape s1, Shape s2) {
        return s1.getPerimeter().compareTo(s2.getPerimeter());
    }
}
