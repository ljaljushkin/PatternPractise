package control_work_1;

public class PrinterDefault implements IPrinter {

    @Override
    public void print(String data) {
        System.out.print(data);
    }

    @Override
    public void print(char data) {
        System.out.print(data);
    }
}
