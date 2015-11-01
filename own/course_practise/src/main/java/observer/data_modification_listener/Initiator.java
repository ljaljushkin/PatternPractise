package observer.data_modification_listener;

import java.util.ArrayList;
import java.util.List;

// Someone who says "Hello"
// Someone who says update "Data"
class Initiator implements HelloSpeaker, DataUpdater {

    private List<HelloListener> helloListeners = new ArrayList<HelloListener>();
    private List<DataListener> dataListeners = new ArrayList<DataListener>();

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerListener(HelloListener toAdd) {
        helloListeners.add(toAdd);
    }

    @Override
    public void removeListener(HelloListener toRemove) {
        helloListeners.remove(toRemove);
    }

    @Override
    public void sayHello() {
        System.out.println(this.getClass().getSimpleName() + "----> Hello!!");

        // Notify everybody that may be interested.
        for (HelloListener hl : helloListeners)
            hl.someoneSaidHello();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        System.out.println(this.getClass().getSimpleName() + "----> Changed data! " + temperature + " - " + humidity + " - " + pressure);
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        updateData();
    }

    @Override
    public void registerListener(DataListener toAdd) {
        dataListeners.add(toAdd);
    }

    @Override
    public void removeListener(DataListener toRemove) {
        dataListeners.remove(toRemove);
    }

    @Override
    public void updateData() {
        for (DataListener listener : dataListeners) {
            listener.someoneUpdateData(temperature, humidity, pressure);
        }
    }
}