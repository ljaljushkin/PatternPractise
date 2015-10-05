package strong_bridge;

public interface IDrawer {

    //TODO: only public methods
    //TODO: only straight line, what about curve?
    //TODO: int -> float -> double


    void drawLine(int x1, int y1, int x2, int y2);

    //TODO: Ellipse = complex shape!
    void drawEllipse(int x, int y, int r1, int r2);

    void fillPoly();
}
