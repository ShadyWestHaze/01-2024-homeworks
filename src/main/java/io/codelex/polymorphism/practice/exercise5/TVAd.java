package src.main.java.io.codelex.polymorphism.practice.exercise5;

public class TVAd extends Advert {
    private final int sec;
    private final int rate;
    private final boolean peak;

    public TVAd(int fee, int rate, int length, boolean peakTime) {
        super(fee);
        this.rate = rate;
        this.sec = length;
        this.peak = peakTime;
    }

    public int cost() {
        return super.cost() + sec * (peak ? rate * 2 : rate);
    }

    public String toString() {
        return super.toString()
                + " TV ad: length= " + sec + " secs."
                + " Rate=" + (peak ? rate * 2 : rate);
    }
}
