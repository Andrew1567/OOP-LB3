package LB5;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();

        // Додаємо напої
        Drink espresso = new Drink("Еспресо", 30.0, 3);
        Drink latte = new Drink("Латте", 45.0, 2);
        Drink cappuccino = new Drink("Капучино", 40.0, 1);

        machine.addDrink(espresso);
        machine.addDrink(latte);
        machine.addDrink(cappuccino);

        machine.showMenu();

        // Створюємо людей і адміністратора
        People andrii = new People("Андрій", 100.0);
        Admin admin = new Admin("Олексій");

        // Купівля напоїв
        andrii.buyDrink(machine, "Латте");
        andrii.buyDrink(machine, "Капучино");

        // Поповнення кавомашини
        admin.refillDrink(cappuccino, 5);

        machine.showMenu();
    }
}