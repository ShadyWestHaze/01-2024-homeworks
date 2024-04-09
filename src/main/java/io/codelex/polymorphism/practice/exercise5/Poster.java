package src.main.java.io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private final int numberOfPosters;
    private final int rate;

    public Poster(int fee, int numberOfPosters, int rate) {
        super(fee);
        this.numberOfPosters = numberOfPosters;
        this.rate = rate;
    }

    public int cost() {
        return super.cost() + rate * numberOfPosters;

    }

    public String toString() {
        return super.toString() + " Posters: Amount=" + numberOfPosters + " Per poster=" + rate;
    }
}
