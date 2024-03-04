package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name, eyes, teeth, hair;
        int age;
        double heightInches, weightPounds;

        name = "Zed A. Shaw";
        age = 35;
        heightInches = 74;  // inches
        weightPounds = 180; // lbs
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        double heightCentimeters = heightInches * 2.54;
        double weightKilos = weightPounds * 0.453592;

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + String.format("%.2f", heightCentimeters) + " centimeters tall.");
        System.out.println("He's " + String.format("%.2f", weightKilos) + " kilograms heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + String.format("%.2f", heightCentimeters)+ ", and " + String.format("%.2f", weightKilos)+ " I get " + (age + heightCentimeters + weightKilos) + ".");
    }
}