package issue;

public class City {

    VerticalStreet verticalStreet;
    HorizontalStreet horizontalStreet;
    CircleStreet circleStreet;

    String[] type = {"european", "american"};

    public City(int flag, String type) {
        if (flag == 0) {
            createRedCity();
        } else if (flag == 1) {
            createBlueCity();
        }

    }

    private void createRedCity() {
        String base = "red";
        circleStreet = new CircleStreet(base);
        verticalStreet = new RedVerticalStreet(base);
        horizontalStreet = new RedHorizontalStreet(base);
    }

    private void createBlueCity() {
        String base = "blue";
        circleStreet = new CircleStreet(base);
        verticalStreet = new BlueVerticalStreet(base);
        horizontalStreet = new BlueHorizontalStreet(base);
    }

}
