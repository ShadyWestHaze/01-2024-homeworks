package src.main.java.io.codelex.oop.shapes;

public abstract class Shape {
    private int numSides = 0;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
