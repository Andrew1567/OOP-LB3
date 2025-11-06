package LB5;

public class People {
    private String name;
    private double balance;

    public People(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean buyDrink(CoffeeMachine machine, String drinkName) {
        Drink drink = machine.findDrink(drinkName);
        if (drink != null && drink.getPortions() > 0 && balance >= drink.getPrice()) {
            balance -= drink.getPrice();
            drink.sellPortion();
            System.out.println(name + " купив " + drink.getName() + " за " + drink.getPrice() + " грн.");
            return true;
        } else {
            System.out.println(name + " не може купити " + drinkName + ".");
            return false;
        }
    }
}
