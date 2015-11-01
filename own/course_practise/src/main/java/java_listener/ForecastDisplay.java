package java_listener;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Initiator weatherData;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

//    public ForecastDisplay(Initiator weatherData) {
//        this.weatherData = weatherData;
//        weatherData.registerListener(this);
//    }



    public void display() {
        System.out.print(this.getClass().getSimpleName() + "-----> Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }


    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof Initiator) {
            Initiator weatherData = (Initiator)observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
//    @Override
//    public void someoneUpdateData(float temp, float humidity, float pressure) {
//        lastPressure = currentPressure;
//        currentPressure = pressure;
//
//        display();
//    }
}
