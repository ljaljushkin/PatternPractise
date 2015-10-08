package control_work_1;

public class PrinterDefault implements IPrinter {
    final String CLASS_NAME = getClass().getSimpleName();

    @Override
    public void print(String data) {
        System.out.println(CLASS_NAME + ": " + data);
    }

    @Override
    public void print(char data) {
        System.out.println(CLASS_NAME + ": " + data);
    }
}