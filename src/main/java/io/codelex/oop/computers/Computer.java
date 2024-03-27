package src.main.java.io.codelex.oop.computers;

public abstract class Computer {
    private final String processor;
    private final int ram;
    private final String graphicsCard;
    private final String company;
    private final String model;

    public Computer(String processor, int ram, String graphicsCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram=" + ram +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
