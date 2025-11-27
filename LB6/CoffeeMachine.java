package LB6;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {

    private List<Drink> drinks = new ArrayList<>();

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void showMenu() {
        System.out.println("Меню:");
        for (Drink d : drinks) {
            System.out.println("- " + d.getName() + " (" + d.getPrice() + " грн)");
        }
    }
}
