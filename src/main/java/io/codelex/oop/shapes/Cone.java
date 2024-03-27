package src.main.java.io.codelex.oop.shapes;

public class Cone extends _3DShape {
    private final double radius;
    private final double height;

    public Cone(double radius, double height) {
        super(0);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double getPerimeter() {
        throw new UnsupportedOperationException("Perimeter is not applicable to a cone.");
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}
