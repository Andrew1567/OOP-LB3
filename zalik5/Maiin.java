package zalik5;

public class Maiin {
    public static void main(String[] args) {

        Administrator admin = new Administrator();
        Catalog catalog = new Catalog();

        Product p1 = new Product(1, "Ноутбук", 30000);
        Product p2 = new Product(2, "Мишка", 500);

        catalog.addProduct(p1);
        catalog.addProduct(p2);

        Client client = new Client("Олексій");

        Order order = new Order(client);
        order.addProduct(p1);
        order.addProduct(p2);

        order.pay();

        if (!order.isPaid) {
            admin.addToBlacklist(client);
        }

        catalog.showProducts();
    }
}
