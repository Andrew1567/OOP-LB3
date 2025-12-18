package zalik4;

public class Game {
    String title;
    String difficultyLevel;
    String helpSystem;
    String period;
    String startDate;
    String endDate;

    public Game(String title, String difficultyLevel, String helpSystem,
                String period, String startDate, String endDate) {
        this.title = title;
        this.difficultyLevel = difficultyLevel;
        this.helpSystem = helpSystem;
        this.period = period;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}
