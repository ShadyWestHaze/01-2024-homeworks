package src.main.java.io.codelex.classesandobjects.practice.Points;

public class swapPoints {
    public static void main(String[] args) {
        Points p1 = new Points(5, 2);
        Points p2 = new Points(-3, 6);
        System.out.println("(" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("(" + p2.getX() + ", " + p2.getY() + ")");
        p1.swapPoints(p2);
        System.out.println("(" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("(" + p2.getX() + ", " + p2.getY() + ")");
    }
}