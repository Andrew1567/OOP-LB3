package LB3;

public class ClockExt extends Clock {

    private int second;

    public ClockExt() {
    }

    public ClockExt(int hour, int minute, int second) {
        super(hour, minute);
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void nextSecond() {
        second++;
        if (second > 59) {
            second = 0;
            nextMinute();
        }
    }

    @Override
    public String toString() {
        return String.format("ClockExt{hour=%02d, minute=%02d, second=%02d}",
                getHour(), getMinute(), second);
    }
}
