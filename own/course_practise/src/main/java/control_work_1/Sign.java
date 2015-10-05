package control_work_1;

public class Sign implements IPrintable {

    char data;

    @Override
    public void print(IPrinter printer) {
        printer.print(data);
    }

    public Sign(char data){
        this.data = data;
    }
}
