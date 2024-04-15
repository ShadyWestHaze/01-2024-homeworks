package src.main.java.io.codelex.oop.computers;

public class ComputerTest {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Intel i5", 8, "Integrated", "HP", "Pavilion", 5000);
        System.out.println("All laptop details:");
        System.out.println(myLaptop);

        System.out.println("\nProcessor of the laptop: " + myLaptop.getProcessor());
    }
}

