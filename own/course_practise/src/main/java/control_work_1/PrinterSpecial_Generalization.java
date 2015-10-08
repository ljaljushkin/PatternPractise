package control_work_1;

public class PrinterSpecial_Generalization extends PrinterDefault {

    final String CLASS_NAME = getClass().getSimpleName();

    @Override
    public void print(String data) {
        System.out.println(CLASS_NAME + ": (" + data + ")");
    }
}
