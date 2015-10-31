package strong_bridge;

public class Main {

    public static void main(String[] args) {

        DrawerDefault drawerDefault = new DrawerDefault();

        Rectangle rectangle = new Rectangle(drawerDefault, 0, 0, 10, 10);
        Circle circle = new Circle(drawerDefault, 0, 0, 10);

        rectangle.draw();
        circle.draw();
    }
}
