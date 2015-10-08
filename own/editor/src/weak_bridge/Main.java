package weak_bridge;

public class Main {

    public static void main(String[] args) {

        DrawerDefault drawerDefault = new DrawerDefault();

        Rectangle rectangle = new Rectangle(0, 0, 10, 10);
        Circle circle = new Circle(0, 0, 10);

        rectangle.draw(drawerDefault);
        circle.draw(drawerDefault);
    }
}
