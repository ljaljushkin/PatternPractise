package control_work_1;

public class Sign implements IPrintable {

    char data;

    public Sign(char data) {
        this.data = data;
    }

    @Override
    public void print(IPrinter printer) {
        printer.print(data, printer);
    }
}
