package weak_bridge.shape.decorator;

import javafx.scene.paint.Color;
import weak_bridge.drawer.IDrawer;
import weak_bridge.shape.Shape;

public class ColorBorderDecorator extends Decorator {
    private Color color = Color.BLACK;

    public ColorBorderDecorator(Shape shape, Color color) {
        super(shape);
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw(IDrawer drawer) {
        Color previousColor = drawer.getCurrentColor();
        drawer.setBorderColor(color);
        shape.draw(drawer);
        drawer.setBorderColor(previousColor);
    }

    @Override
    public Decorator clone() {
        return new ColorBorderDecorator(shape, color);
    }
}

