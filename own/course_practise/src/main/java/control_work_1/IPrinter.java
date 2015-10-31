package control_work_1;

public interface IPrinter {
//    String class_name = null;

    void print(String data, IPrinter p);

    void print(char data, IPrinter p);
}
