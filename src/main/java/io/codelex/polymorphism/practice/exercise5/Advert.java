package src.main.java.io.codelex.polymorphism.practice.exercise5;

public class Advert {
    protected int fee;

    public Advert() {
        fee = 0;
    }

    public Advert(int fee) {
        this.fee = fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int cost() {
        return fee;
    }

    public String toString() {
        return "\nAdvert: Fee=" + fee;
    }
}
