package java_listener;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

// Someone who says "Hello"
// Someone who says update "Data"
class Initiator extends Observable{

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    private float temperature;
    private float humidity;
    private float pressure;

//    @Override
//    public void sayHello() {
//        setChanged();
//        System.out.println(this.getClass().getSimpleName() + "----> Hello!!");
//        notifyObservers();
        // Notify everybody that may be interested.
//        for (HelloListener hl : helloListeners)
//            hl.someoneSaidHello();
//    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        System.out.println(this.getClass().getSimpleName() + "----> Changed data! " + temperature + " - " + humidity + " - " + pressure);
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
//        updateData();
    }

//    @Override
//    public void updateData() {
//        for (DataListener listener : dataListeners) {
//            listener.someoneUpdateData(temperature, humidity, pressure);
//        }
//    }

    public float getPressure() {
        return pressure;
    }
}