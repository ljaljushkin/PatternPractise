package java_listener;

public class Main {
    public static void main(String[] args) {

        Initiator initiator = new Initiator();
        Responder responder = new Responder();
        JubilantResponder jubilantResponder = new JubilantResponder();

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(initiator);
        ForecastDisplay forecastDisplay = new ForecastDisplay(initiator);

//        initiator.registerListener(responder);
//        initiator.registerListener(jubilantResponder);
//
//        initiator.sayHello();  // Prints "Hello!!!" and "Hello there..."
//        initiator.removeListener(responder);
//        initiator.sayHello();

        initiator.setMeasurements(80, 65, 30.4f);

        initiator.deleteObserver(statisticsDisplay);
        initiator.setMeasurements(82, 70, 29.2f);


    }
}
