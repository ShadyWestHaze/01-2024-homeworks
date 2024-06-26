package io.codelex.classesandobjects.practice;

import io.codelex.NoCodeWrittenException;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;


    public static void main(String[] args) {
        //fixme
        int energyDrinkers = (int) calculateEnergyDrinkers(NUMBERED_SURVEYED, PURCHASED_ENERGY_DRINKS);
        int preferCitrus = (int) calculatePreferCitrus(energyDrinkers, PREFER_CITRUS_DRINKS);
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        System.out.println(preferCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed, double energyDrinkers) {
        return numberSurveyed * energyDrinkers;
    }

    public static double calculatePreferCitrus(int numberSurveyed, double preferCitrus) {
        return numberSurveyed * preferCitrus;
    }
}
