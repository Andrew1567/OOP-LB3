package LB3;

public class Clock {

    private int hour;
    private int minute;

    public Clock() {
    }

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    //  перехід до наступної хвилини
    public void nextMinute() {
        minute++;
        // 59 хвилин - + 1 година

        if (minute > 59) {
            minute = 0;
            hour++;
        }
        // 23 години - 0
        if (hour > 23) {
            hour = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Clock{hour=%02d, minute=%02d}", hour, minute);
    }
}
