package observer.java_listener;

public interface HelloSpeaker {
    void registerListener(HelloListener toAdd);

    void removeListener(HelloListener toRemove);

    void sayHello();
}
