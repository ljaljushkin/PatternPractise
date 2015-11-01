package data_modification_listener;

public interface HelloSpeaker {
    void registerListener(HelloListener toAdd);

    void removeListener(HelloListener toRemove);

    void sayHello();
}
