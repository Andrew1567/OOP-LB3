package LB6;

import java.util.HashMap;
import java.util.Map;

public class IngredientFactory {

    private static final Map<String, Ingredient> pool = new HashMap<>();

    public static Ingredient getIngredient(String name) {

        Ingredient ingr = pool.get(name);

        if (ingr == null) {
            ingr = new Ingredient(name);
            pool.put(name, ingr);
        }

        return ingr;
    }

    public static int getPoolSize() {
        return pool.size();
    }
}
