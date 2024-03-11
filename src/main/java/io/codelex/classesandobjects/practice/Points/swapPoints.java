package src.main.java.io.codelex.classesandobjects.practice.Points;

public class swapPoints {
    public static void main(String[] args) {
        Points p1 = new Points(5, 2);
        Points p2 = new Points(-3, 6);
        p1.swapPoints(p2);
        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }
}