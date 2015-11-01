package java_listener;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private Initiator weatherData;

    public StatisticsDisplay(Initiator weatherData) {
        this.weatherData = weatherData;
//        weatherData.registerListener(this);
        weatherData.addObserver(this);
    }

    public void display() {
        System.out.println(this.getClass().getSimpleName() + "----> Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

//    @Override
//    public void someoneUpdateData(float temp, float humidity, float pressure) {
//        tempSum += temp;
//        numReadings++;
//
//        if (temp > maxTemp) {
//            maxTemp = temp;
//        }
//
//        if (temp < minTemp) {
//            minTemp = temp;
//        }
//
//        display();
//    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof Initiator) {
            float temp = ((Initiator) observable).getTemperature();
            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            display();
        }
    }
}
