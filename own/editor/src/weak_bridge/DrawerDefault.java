package weak_bridge;

public class DrawerDefault implements IDrawer {

    public void drawLine(int x1, int y1, int x2, int y2) {
        System.out.println("DrawLine: (" + x1 + ":" + y1 + ")" + "(" + x2 + ":" + y2 + ")");
    }

    //TODO: Ellipse = complex shape!
    public void drawEllipse(int x, int y, int r1, int r2) {
        System.out.println("drawEllipse: (" + x + ":" + y + ")" + " r1=" + r1 + " r2=" + r2);
    }

    public void fillPoly() {

    }
}
