package zalik4;

import java.util.ArrayList;

public class Mains {
    public static void main(String[] args) {

        Player p1 = new Player("Іваненко Іван Іванович", 20, "Шутери", "Середній");
        Player p2 = new Player("Петренко Олена Сергіївна", 25, "Стратегії", "Високий");

        Game g1 = new Game("CS:GO", "Висока", "Є", "Весна 2024",
                "01.03.2024", "31.05.2024");
        Game g2 = new Game("Civilization VI", "Середня", "Є", "Зима 2024",
                "01.12.2024", "28.02.2025");

        Scenario s1 = new Scenario(p1, g1, 850);
        Scenario s2 = new Scenario(p2, g2, 920);

        ArrayList<Scenario> scenarios = new ArrayList<>();
        scenarios.add(s1);
        scenarios.add(s2);

        for (Scenario s : scenarios) {
            s.showInfo();
        }
    }
}
