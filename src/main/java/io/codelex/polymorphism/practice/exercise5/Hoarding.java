package src.main.java.io.codelex.polymorphism.practice.exercise5;

class Hoarding extends Advert {
    private final int rate;
    //per day
    private final int numDays;

    public Hoarding(int fee, int numberOfDays, int rate) {
        super(fee);
        numDays = numberOfDays;
        this.rate = rate;
    }

    public int cost() {
        return super.cost() + rate * numDays;
    }


    public String toString() {
        return super.toString() + " Hoarding: Days=" + numDays + " Rate=" + rate;
    }
}