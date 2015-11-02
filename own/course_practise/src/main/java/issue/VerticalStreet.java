package issue;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class VerticalStreet extends Street {

    public static final String V_HOME_1 = "vhome1";
    public static final String V_HOME_2 = "vhome2";

    public VerticalStreet(String base) {
        super(base);
    }


    @Override
    public List<String> getListOfHouseNames() {
        return new ArrayList<String>() {
            {
                add(V_HOME_1);
                add(V_HOME_2);
            }
        };
    }

    File home1_address() {
        return map.get(V_HOME_1);
    }

    File home2_address() {
        return map.get(V_HOME_2);
    }

    abstract File getRedHome_1(); // visitor
    двойная диспетчиризация
            многомерная
    реализуется с классическим
}
