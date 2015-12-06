package weak_bridge.registry;

import weak_bridge.shape.Shape;

import java.util.HashMap;

public class ShapeRegistry {
    private static ShapeRegistry instance = null;
    private HashMap<String, Shape> prototypes = new HashMap<>();

    private ShapeRegistry() {
    }

    public static ShapeRegistry getInstance() {
        if (instance == null) {
            instance = new ShapeRegistry();
        }
        return instance;
    }

    public void registerPrototype(String key, Shape value) {
        prototypes.put(key, value);
    }

    public Shape get(String key) throws CloneNotSupportedException {
        return prototypes.get(key).clone();
    }


}
