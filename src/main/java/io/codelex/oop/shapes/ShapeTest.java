package src.main.java.io.codelex.oop.shapes;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 4.0);

        System.out.println("Rectangle:");
        System.out.printf("Number of sides: %d\n", rectangle.getNumSides());
        System.out.printf("Width: %.2f cm\n", rectangle.getWidth());
        System.out.printf("Height: %.2f cm\n", rectangle.getHeight());
        System.out.printf("Area: %.2f cm\u00B2\n", rectangle.getArea());
        System.out.printf("Perimeter: %.2f cm\n", rectangle.getPerimeter());

        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println("\nTriangle:");
        System.out.printf("Number of sides: %d\n", triangle.getNumSides());
        System.out.printf("Side 1: %.2f cm\n", triangle.getSide1());
        System.out.printf("Side 2: %.2f cm\n", triangle.getSide2());
        System.out.printf("Side 3: %.2f cm\n", triangle.getSide3());
        System.out.printf("Area: %.2f cm\u00B2\n", triangle.getArea());
        System.out.printf("Perimeter: %.2f cm\n", triangle.getPerimeter());

        Hexagon hexagon = new Hexagon(6.0);

        System.out.println("\nHexagon:");
        System.out.printf("Number of sides: %d\n", hexagon.getNumSides());
        System.out.printf("Side Length: %.2f cm\n", hexagon.getSideLength());
        System.out.printf("Area: %.2f cm\u00B2\n", hexagon.getArea());
        System.out.printf("Perimeter: %.2f cm\n", hexagon.getPerimeter());

        Cone cone = new Cone(3.0, 4.0);

        System.out.println("\nCone:");
        System.out.printf("Radius: %.2f cm\n", cone.getRadius());
        System.out.printf("Height: %.2f cm\n", cone.getHeight());
        System.out.printf("Area: %.2f cm\u00B2\n", cone.getArea());
        System.out.printf("Volume: %.2f cm\u00B3\n", cone.calculateVolume());


        Cube cube = new Cube(3.0);

        System.out.println("\nCube:");
        System.out.printf("Side Length: %.2f cm\n", cube.getSideLength());
        System.out.printf("Area: %.2f cm\u00B2\n", cube.getArea());
        System.out.printf("Volume: %.2f cm\u00B3\n", cube.calculateVolume());
    }
}
