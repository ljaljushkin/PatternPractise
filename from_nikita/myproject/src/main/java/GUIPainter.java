import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class GUIPainter implements IPainter {

    private Canvas canvas;

    private GraphicsContext graphicsContext;

    public GUIPainter(Canvas canvas) { graphicsContext = canvas.getGraphicsContext2D(); }

    public Canvas getCanvas() { return canvas; }

    public void clearCanvas() {
        graphicsContext.clearRect(0, 0, 512, 400);
    }

    public void changeScale(double x, double y, FigureCollection collection) {
        clearCanvas();
        graphicsContext.scale(x, y);
        collection.draw(this);
    }

    public void changeAlpha(double alpha, FigureCollection collection) {
        clearCanvas();
        graphicsContext.setGlobalAlpha(alpha);
        collection.draw(this);
    }

    public void setBorderColor(String color) {
        try {
            graphicsContext.setStroke(Paint.valueOf(color));

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Paint.valueOf(color));
    }

    public void draw(IFigure figure) {
        figure.draw(this);
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

    public void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        graphicsContext.strokeLine(x1, y1, x2, y2);
        graphicsContext.strokeLine(x2, y2, x3, y3);
        graphicsContext.strokeLine(x1, y1, x3, y3);
    }
}