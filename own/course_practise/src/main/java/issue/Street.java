package issue;

import java.io.File;
import java.nio.file.InvalidPathException;
import java.util.HashMap;
import java.util.Map;

abstract class Street implements IStreet {

    HashMap<String, File> map;
    String base;

    public Street(String base) {
        map = new HashMap<String, File>();

        for (String houseName : getListOfHouseNames()) {
            File houseAddress = new File(base, houseName);
            map.put(houseName, houseAddress);
        }

        validate();
    }

    protected void validate() {
        for (Map.Entry<String, File> stringFileEntry : map.entrySet()) {
            File address = stringFileEntry.getValue();
            if (!address.exists()) {
                throw new InvalidPathException(address.getAbsolutePath(), "address isn't valid!");
            }
        }

    }

    HashMap<String, File> map() {
        return map;
    }

}
