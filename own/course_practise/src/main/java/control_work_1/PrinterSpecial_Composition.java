package control_work_1;

public class PrinterSpecial_Composition implements IPrinter {

    IPrinter p = new PrinterDefault();

    @Override
    public void print(String data, IPrinter ignore) {
        this.p.print("(" + data + ")", this);
    }

    @Override
    public void print(char data, IPrinter p) {
        this.p.print(data, this);
    }
}
