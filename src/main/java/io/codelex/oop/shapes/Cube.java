package src.main.java.io.codelex.oop.shapes;

public class Cube extends _3DShape {
    private final double sideLength;

    public Cube(double sideLength) {
        super(0);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Perimeter is not applicable to a cube.");
    }

    @Override
    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }
}
