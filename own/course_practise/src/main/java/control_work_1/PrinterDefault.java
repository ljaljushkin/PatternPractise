package control_work_1;

public class PrinterDefault implements IPrinter {

    @Override
    public void print(String data, IPrinter p) {
        System.out.println(p.getClass().getSimpleName() + ": " + data);
    }

    @Override
    public void print(char data, IPrinter p) {
        System.out.println(p.getClass().getSimpleName() + ": " + data);
    }
}
