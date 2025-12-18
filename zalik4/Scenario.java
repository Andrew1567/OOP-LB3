package zalik4;

public class Scenario {
    Player player;
    Game game;
    int score;

    public Scenario(Player player, Game game, int score) {
        this.player = player;
        this.game = game;
        this.score = score;
    }

    public void showInfo() {
        System.out.println("Гравець: " + player.fullName);
        System.out.println("Вік: " + player.age);
        System.out.println("Хобі: " + player.hobby);
        System.out.println("Рівень достатку: " + player.wealthLevel);
        System.out.println("Гра: " + game.title);
        System.out.println("Складність: " + game.difficultyLevel);
        System.out.println("Ігровий період: " + game.period);
        System.out.println("Дата початку: " + game.startDate);
        System.out.println("Дата завершення: " + game.endDate);
        System.out.println("Результат (бали): " + score);
        System.out.println("----------------------------");
    }
}
