package control_work_1;

public class PrinterSpecial extends PrinterDefault {
    @Override
    public void print(String data) {
        System.out.print("(" + data + ")");
    }

//    @Override
//    public void print(char data) {
//        System.out.print("(" + data + ")");
//    }
}
