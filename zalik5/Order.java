package zalik5;

import java.util.ArrayList;

public class Order {
    Client client;
    ArrayList<Product> items = new ArrayList<>();
    boolean isPaid;

    public Order(Client client) {
        this.client = client;
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public void pay() {
        isPaid = true;
    }
}
