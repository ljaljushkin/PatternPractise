package control_work_1;

public interface IPrinter {
    void print(String data, IPrinter p);

    void print(char data, IPrinter p);
}
