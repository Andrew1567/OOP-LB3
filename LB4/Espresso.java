package LB4;


public class Espresso implements Drink {
    @Override
    public String getName() {
        return "Еспресо";
    }

    @Override
    public double getPrice() {
        return 30.0;
    }
}
