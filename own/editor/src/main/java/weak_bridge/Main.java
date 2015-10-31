package weak_bridge;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        ShapeCollection shapeCollection = new ShapeCollection();
        Rectangle rectangle_prototype = new Rectangle();
        Circle circle_prototype = new Circle();
        DrawerDefault drawerDefault = new DrawerDefault();


        Rectangle r1 = (Rectangle) rectangle_prototype.clone();
        r1.initialize(0, 0, 10, 10);
        shapeCollection.add(r1);

        Circle c1 = (Circle) circle_prototype.clone();
        c1.initialize(0, 0, 10);
        shapeCollection.add(c1);

        for (Shape shape : shapeCollection.getShapes()) {
            shape.draw(drawerDefault);
        }
    }
}
