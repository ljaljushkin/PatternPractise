package weak_bridge.sort;

public class Context<T extends Strategy> {
    private T strategy;

    public void Operation() {
        strategy.doAlgorithm();
    }
}