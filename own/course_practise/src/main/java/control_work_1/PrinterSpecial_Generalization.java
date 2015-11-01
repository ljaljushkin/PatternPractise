package control_work_1;

public class PrinterSpecial_Generalization extends PrinterDefault {

    @Override
    public void print(String data, IPrinter ignore) {
        super.print("(" + data + ")", this);
    }
}
