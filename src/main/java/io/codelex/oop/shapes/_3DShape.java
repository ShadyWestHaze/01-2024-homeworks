package src.main.java.io.codelex.oop.shapes;

public abstract class _3DShape extends Shape {
    public _3DShape(int numSides) {
        super(numSides);
    }

    public abstract double calculateVolume();
}
