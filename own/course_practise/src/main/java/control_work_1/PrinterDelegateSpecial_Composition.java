package control_work_1;

public class PrinterDelegateSpecial_Composition extends PrinterSpecial_Composition implements IPrinterDelegate {

    @Override
    public void print(IPrintable printable) {
        printable.print(this);
    }
}
