package LB3;

public class ClockExt2 extends ClockExt {

    private int millisecond;

    public ClockExt2() {
    }

    public ClockExt2(int hour, int minute, int second, int millisecond) {
        super(hour, minute, second);
        this.millisecond = millisecond;
    }

    public int getMillisecond() {
        return millisecond;
    }

    public void setMillisecond(int millisecond) {
        this.millisecond = millisecond;
    }

    public void nextMillisecond() {
        millisecond += 100; // крок таймера
        if (millisecond >= 1000) {
            millisecond = 0;
            nextSecond();
        }
    }

    @Override
    public String toString() {
        return String.format("Cekyndomer{hour=%02d, minute=%02d, second=%02d, millisecond=%03d}",
                getHour(), getMinute(), getSecond(), millisecond);
    }
}
