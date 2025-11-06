package LB5;


public class Admin {
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    public void refillDrink(Drink drink, int addedPortions) {
        drink.setPortions(drink.getPortions() + addedPortions);
        System.out.println("Адміністратор " + name + " поповнив " +
                drink.getName() + " на " + addedPortions + " порцій.");
    }

    public void refillIngredient(Ingredient ingredient, int addedQuantity) {
        ingredient.setQuantity(ingredient.getQuantity() + addedQuantity);
        System.out.println("Адміністратор " + name + " додав " +
                ingredient.getName() + " на " + addedQuantity + " одиниць.");
    }
}
