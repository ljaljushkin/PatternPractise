package strong_bridge;

import strong_bridge.drawer.ConsoleDrawer;
import strong_bridge.drawer.SwingDrawer;
import strong_bridge.shape.Circle;
import strong_bridge.shape.Rectangle;
import strong_bridge.shape.Shape;
import strong_bridge.shape.ShapeCollection;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        ShapeCollection shapeCollection = new ShapeCollection();

        ConsoleDrawer consoleDrawer = new ConsoleDrawer();
        SwingDrawer swingDrawer = new SwingDrawer();

        Rectangle rectangle_prototype = new Rectangle(swingDrawer);
        Circle circle_prototype = new Circle(swingDrawer);


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
