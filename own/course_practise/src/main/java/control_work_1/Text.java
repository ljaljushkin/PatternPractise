package control_work_1;

public class Text implements IPrintable {

    IPrintable[] data;

    public Text(IPrintable[] data) {
        this.data = data;
    }

    @Override
    public void print(IPrinter printer) {
        for (IPrintable element : data) {
            element.print(printer);
        }
    }
}
