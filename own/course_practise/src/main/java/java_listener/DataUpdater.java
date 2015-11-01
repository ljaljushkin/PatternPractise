package java_listener;

public interface DataUpdater {
    void registerListener(DataListener toAdd);

    void removeListener(DataListener toRemove);

    void updateData();
}
