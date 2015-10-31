package control_work_1;

public class PrinterSpecial_Composition implements IPrinter {

//    final String CLASS_NAME = getClass().getSimpleName();

    IPrinter p = new PrinterDefault();

    @Override
    public void print(String data, IPrinter p) {
        p.print(/*CLASS_NAME + ": */"(" + data + ")", this);
    }

    @Override
    public void print(char data, IPrinter p) {
        p.print(/*CLASS_NAME + ":" + */data, this);
    }
}
