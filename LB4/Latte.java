package LB4;

public class Latte implements Drink {
    @Override
    public String getName() {
        return "Латте";
    }

    @Override
    public double getPrice() {
        return 45.0;
    }
}
