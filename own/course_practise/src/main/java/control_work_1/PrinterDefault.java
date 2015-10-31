package control_work_1;

public class PrinterDefault implements IPrinter {
//    final String CLASS_NAME = getClass().getSimpleName();

    @Override
    public void print(String data, IPrinter p) {
        System.out.println(/*CLASS_NAME + ": " + */p.getClass().getSimpleName() + ": " + data);
    }

    @Override
    public void print(char data, IPrinter p) {
        System.out.println(/*CLASS_NAME + ": " + */p.getClass().getSimpleName() + ": " + data);
    }
}
