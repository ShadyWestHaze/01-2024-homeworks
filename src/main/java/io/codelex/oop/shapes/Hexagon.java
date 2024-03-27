package src.main.java.io.codelex.oop.shapes;

public class Hexagon extends Shape {
    private final double sideLength;

    public Hexagon(double sideLength) {
        super(6);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double getArea() {

        return (3 * Math.sqrt(3) * sideLength * sideLength) / 2;
    }

    @Override
    public double getPerimeter() {

        return 6 * sideLength;
    }
}
