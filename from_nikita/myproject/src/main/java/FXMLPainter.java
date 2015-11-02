import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLPainter implements IPainter, Initializable {

    @FXML
    private Canvas canvas;

    private GraphicsContext gc;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.BLACK);
        System.out.println("color set to black");
        gc.fillRect(50, 50, 100, 100);
        System.out.println("draw rectangle");
    }

    public void changeScale(double x, double y) {

    }

    public void changeAlpha(double alpha) {

    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        //gc.strokeLine(x1, y1, x2, y2);
        System.out.println("Line painted at : " + x1 + "," + y1 + " : " + x2 + "," + y2);
    }

    public void drawRectangle(int x, int y, int width, int height) {
        //gc.strokeRect(x, y, width, height);
        System.out.println("Rectangle painted at : " + x + "," + y + " with width " + width + " and height " + height);
    }

    public void drawEllipse(int x, int y, int rx, int ry) {
        System.out.println("Ellipse painted at : " + x + "," + y + " with rx " + rx + " and ry " + ry);
    }

    public void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        System.out.println("Rectangle painted at : " + x1 + "," + y1 + " : " + x2 + "," + y2 + " : " + x3 + "," + y3);
    }
}
