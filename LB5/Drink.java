package LB5;

public class Drink {
    private String name;
    private double price;
    private int portions;

    public Drink(String name, double price, int portions) {
        this.name = name;
        this.price = price;
        this.portions = portions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPortions() {
        return portions;
    }

    public void setPortions(int portions) {
        this.portions = portions;
    }

    public boolean sellPortion() {
        if (portions > 0) {
            portions--;
            return true;
        }
        return false;
    }
}
