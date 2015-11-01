package observer.data_modification_listener;

public class StatisticsDisplay implements DataListener, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private Initiator weatherData;

    public StatisticsDisplay(Initiator weatherData) {
        this.weatherData = weatherData;
        weatherData.registerListener(this);
    }

    public void display() {
        System.out.println(this.getClass().getSimpleName() + "----> Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void someoneUpdateData(float temp, float humidity, float pressure) {
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
