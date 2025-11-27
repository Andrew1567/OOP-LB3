package LB6;

import LB6.Ingredient;
import java.util.List;

public class Drink {

    private String name;
    private double price;
    private List<Ingredient> ingredients;

    public Drink(String name, double price, List<Ingredient> ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public List<Ingredient> getIngredients() { return ingredients; }

    public void showRecipe() {
        System.out.print(name + " містить: ");
        ingredients.forEach(i -> System.out.print(i.getName() + " "));
        System.out.println();
    }
}
