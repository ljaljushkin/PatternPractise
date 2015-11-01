package observer.data_modification_listener;

// An interface to be implemented by everyone interested in "updating data" events
public interface DataListener {
    void someoneUpdateData(float temp, float humidity, float pressure);
}
