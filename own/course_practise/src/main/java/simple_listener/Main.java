package simple_listener;

public class Main {
    public static void main(String[] args) {

        Initiator initiator = new Initiator();
        Responder responder = new Responder();
        JubilantResponder jubilantResponder = new JubilantResponder();

        initiator.addListener(responder);
        initiator.addListener(jubilantResponder);

        initiator.sayHello();  // Prints "Hello!!!" and "Hello there..."
    }
}
