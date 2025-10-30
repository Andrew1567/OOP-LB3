package LB4;

import java.util.*;

public class CoffeeMachine {
    public static void main(String[] args) {
        // Створюємо колекцію напоїв
        List<Drink> drinks = new ArrayList<>();
        drinks.add(new Espresso());
        drinks.add(new Latte());
        drinks.add(new Cappuccino());

        // Виводимо інформацію про напої
        System.out.println("Меню кавомашини:");
        for (Drink d : drinks) {
            System.out.println("- " + d.getName() + " — " + d.getPrice() + " грн");
        }
    }
}
