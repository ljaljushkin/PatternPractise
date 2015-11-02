package issue;

import java.io.File;
import java.util.List;

public class RedVerticalStreet extends VerticalStreet {

    public static final String RED_V_HOME_1 = "rvhome1";
    public static final String RED_V_HOME_2 = "rvhome2";

    public RedVerticalStreet(String base) {
        super(base);
    }

    @Override
    public List<String> getListOfHouseNames() {
        List<String> baseList = super.getListOfHouseNames();
        baseList.add(RED_V_HOME_1);
        baseList.add(RED_V_HOME_2);

        return baseList;
    }

    @Override
    File getRedHome_1() {
        return map().get(RED_V_HOME_1);
    }

    File getRetroHome_2() {
        return map().get(RED_V_HOME_2);
    }


}
