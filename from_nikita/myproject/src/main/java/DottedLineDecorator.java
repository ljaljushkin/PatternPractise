
public class DottedLineDecorator extends Decorator {

    public DottedLineDecorator(IFigure f) {
        super(f);
    }

    @Override
    public void draw(IPainter painter) {
        setStrokeLine(figure);
        figure.draw(painter);
    }

    @Override
    public DottedLineDecorator clone() {
        return new DottedLineDecorator(figure);
    }

    private void setStrokeLine(IFigure figure){
        System.out.println("Setting stroke line");
    }
}
