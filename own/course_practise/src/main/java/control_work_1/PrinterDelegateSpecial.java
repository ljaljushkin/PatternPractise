package control_work_1;

public class PrinterDelegateSpecial extends PrinterSpecial implements IPrinterDelegate {
    @Override
    public void print(IPrintable printable) {
        printable.print(this);
    }
}
