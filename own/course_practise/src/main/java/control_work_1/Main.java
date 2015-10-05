package control_work_1;

public class Main {

    public static void main(String[] args) {

        Text text = new Text(
                new IPrintable[]{
                        new Word("We are testing"), new Sign(' '),
                        new Word("my"), new Sign(' '),
                        new Word("architecture"), new Sign('!')
                }
        );

        PrinterDefault printerDefault = new PrinterDefault();
        PrinterSpecial printerSpecial = new PrinterSpecial();

        text.print(printerDefault);
        text.print(printerSpecial);

        PrinterDelegateSpecial delegate = new PrinterDelegateSpecial();

        text.print(delegate);
        delegate.print(text);
    }
}
