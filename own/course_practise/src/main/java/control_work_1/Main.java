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
        PrinterSpecial_Composition printerSpecial_composition = new PrinterSpecial_Composition();
        PrinterSpecial_Generalization printerSpecial_generalization= new PrinterSpecial_Generalization();

        text.print(printerDefault);
        text.print(printerSpecial_composition);
        text.print(printerSpecial_generalization);


        PrinterDelegateSpecial_Composition delegate_composition = new PrinterDelegateSpecial_Composition();

        text.print(delegate_composition);
        delegate_composition.print(text);


        PrinterDelegateSpecial_Generalization delegate_generalization = new PrinterDelegateSpecial_Generalization();

        text.print(delegate_generalization);
        delegate_generalization.print(text);

    }
}
