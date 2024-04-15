package src.main.java.io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer {
    private int battery;

    public Laptop(String processor, int ram, String graphicsCard, String company, String model, int battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Processor: " + getProcessor() +
                ", RAM: " + getRam() + "GB" +
                ", Graphics Card: " + getGraphicsCard() +
                ", Company: " + getCompany() +
                ", Model: " + getModel() +
                ", Battery: " + getBattery() + " mAh";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return battery == laptop.battery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }
}
