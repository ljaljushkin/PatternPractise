package control_work_1;

public class Word implements IPrintable {

    private String data;

    @Override
    public void print(IPrinter printer) {
        printer.print(data, printer);
    }

    public Word(String data) {
        this.data = data;
    }
}
