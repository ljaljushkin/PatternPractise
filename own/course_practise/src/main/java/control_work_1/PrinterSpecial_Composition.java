package control_work_1;

public class PrinterSpecial_Composition implements IPrinter {

    final String CLASS_NAME = getClass().getSimpleName();

    IPrinter p = new PrinterDefault();

    @Override
    public void print(String data) {
        p.print(CLASS_NAME + ": (" + data + ")");
    }

    @Override
    public void print(char data) {
        p.print(CLASS_NAME + ":" + data);
    }
}
