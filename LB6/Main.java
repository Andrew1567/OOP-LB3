package LB6;

import LB6.Ingredient;
import LB6.IngredientFactory;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Flyweight для інгредієнтів ===");

        Ingredient sugar1 = IngredientFactory.getIngredient("Цукор");
        Ingredient sugar2 = IngredientFactory.getIngredient("Цукор");
        Ingredient milk  = IngredientFactory.getIngredient("Молоко");

        System.out.println("Sugar об'єкти однакові? " + (sugar1 == sugar2));
        System.out.println("Розмір пулу інгредієнтів: " + IngredientFactory.getPoolSize());


        CoffeeMachine machine = new CoffeeMachine();

        Drink espresso = new Drink(
                "Еспресо",
                30,
                Arrays.asList(
                        IngredientFactory.getIngredient("Кава")
                )
        );

        Drink latte = new Drink(
                "Латте",
                45,
                Arrays.asList(
                        IngredientFactory.getIngredient("Кава"),
                        IngredientFactory.getIngredient("Молоко")
                )
        );

        machine.addDrink(espresso);
        machine.addDrink(latte);

        System.out.println("\n=== Меню кавомашини ===");
        machine.showMenu();

        System.out.println("\n=== Рецепти ===");
        espresso.showRecipe();
        latte.showRecipe();
    }
}
