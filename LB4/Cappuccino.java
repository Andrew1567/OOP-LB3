package LB4;

public class Cappuccino implements Drink {
    @Override
    public String getName() {
        return "Капучино";
    }

    @Override
    public double getPrice() {
        return 40.0;
    }
}
