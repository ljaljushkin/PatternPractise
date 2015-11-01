package data_modification_listener;

public class ForecastDisplay implements DataListener, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Initiator weatherData;

    public ForecastDisplay(Initiator weatherData) {
        this.weatherData = weatherData;
        weatherData.registerListener(this);
    }

    @Override
    public void someoneUpdateData(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;

        display();
    }

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


}
