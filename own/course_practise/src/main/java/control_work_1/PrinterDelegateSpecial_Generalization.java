package control_work_1;

public class PrinterDelegateSpecial_Generalization extends PrinterSpecial_Generalization implements IPrinterDelegate {

    @Override
    public void print(IPrintable printable) {
        printable.print(this);
    }
}
