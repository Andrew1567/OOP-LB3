package zalik5;

import java.util.ArrayList;

public class Catalog {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showProducts() {
        for (Product p : products) {
            System.out.println(p.id + " " + p.name + " " + p.price);
        }
    }
}
