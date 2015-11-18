package weak_bridge.shape.decorator;

import weak_bridge.drawer.IDrawer;
import weak_bridge.shape.Shape;

public class DottedLineDecorator extends Decorator {

    private static final double[] DEFAULT_DASHES = new double[]{25d, 10d};
    private static final int SOLID_LINE = 0;

    public DottedLineDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw(IDrawer drawer) {
        drawer.setLineDashes(DEFAULT_DASHES);
        shape.draw(drawer);
        drawer.setLineDashes(SOLID_LINE);
    }

    @Override
    public Decorator clone() {
        return new DottedLineDecorator(shape);
    }
}
