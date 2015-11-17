package weak_bridge.drawer.javafx;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import weak_bridge.drawer.IDrawer;


public class JavaFXDrawer implements IDrawer {

    private Canvas canvas;
    private GraphicsContext graphicsContext;

    public JavaFXDrawer(Canvas canvas, GraphicsContext graphicsContext) {
        this.canvas = canvas;
        this.graphicsContext = graphicsContext;
    }

    public void clearCanvas() {
        graphicsContext.clearRect(0, 0, canvas.getHeight(), canvas.getWidth());
    }

    public void changeScale(double x, double y) {
        clearCanvas();
        graphicsContext.scale(x, y);
    }

    public void changeAlpha(double alpha) {
        clearCanvas();
        graphicsContext.setGlobalAlpha(alpha);
    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        graphicsContext.strokeLine(x1, y1, x2, y2);
    }

    public void drawRectangle(int x, int y, int width, int height) {
        graphicsContext.strokeRect(x, y, width, height);
    }

    public void drawEllipse(int x, int y, int rx, int ry) {
        graphicsContext.strokeOval(x, y, rx, ry);
    }

    @Override
    public void fillPoly() {

    }

    public void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        graphicsContext.strokeLine(x1, y1, x2, y2);
        graphicsContext.strokeLine(x2, y2, x3, y3);
        graphicsContext.strokeLine(x1, y1, x3, y3);
    }
}