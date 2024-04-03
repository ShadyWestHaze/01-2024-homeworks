package src.main.java.io.codelex.exceptions.practice;

public class Exercise4 {
    public static void main(String[] args) {
        testInput("25");
        testInput("-10");
        testInput("abc");
    }

    static void testInput(String input) {
        try {
            double d = getInput(input);
            double root = Math.sqrt(d);
            System.out.println("The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (NonPositiveNumberException e) {
            System.out.println("Result will be imaginary number:" + e.getMessage());
        }
    }

    static double getInput(String s) throws NonPositiveNumberException {
        double d = Double.parseDouble(s);
        // Throw an NonPositiveNumberException if d is less than 0
        if (d <= 0) {
            throw new NonPositiveNumberException("Number must be positive.");
        }
        return d;
    }
}


