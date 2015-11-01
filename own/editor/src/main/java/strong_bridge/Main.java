package strong_bridge;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        ShapeCollection shapeCollection = new ShapeCollection();

        DrawerConsole drawerConsole = new DrawerConsole();
        DrawerGraphic drawerGraphic = new DrawerGraphic();

        Rectangle rectangle_prototype = new Rectangle(drawerGraphic);
        Circle circle_prototype = new Circle(drawerGraphic);


        Rectangle r1 = (Rectangle) rectangle_prototype.clone();
        r1.initialize(0, 0, 100, 100);
        shapeCollection.add(r1);

        Rectangle r2 = (Rectangle) rectangle_prototype.clone();
        r1.initialize(100, 100, 0, 100);
        shapeCollection.add(r2);

        Circle c1 = (Circle) circle_prototype.clone();
        c1.initialize(0, 100, 100);
        shapeCollection.add(c1);

        for (Shape shape : shapeCollection.getShapes()) {
            shape.draw();
        }
    }
}
