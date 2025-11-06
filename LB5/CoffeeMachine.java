package LB5;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private List<Drink> drinks;

    public CoffeeMachine() {
        drinks = new ArrayList<>();
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }


    public Drink findDrink(String name) {
        for (Drink d : drinks) {
            if (d.getName().equalsIgnoreCase(name)) {
                return d;
            }
        }
        return null;
    }

    public void showMenu() {
        System.out.println("Меню кавомашини:");
        for (Drink d : drinks) {
            System.out.println("- " + d.getName() + " — " + d.getPrice() + " грн (" + d.getPortions() + " порцій)");
        }
    }
}
