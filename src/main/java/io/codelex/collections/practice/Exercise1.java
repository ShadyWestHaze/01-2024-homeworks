package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};
        String[] arrayOrigination = {"Germany", "Germany", "Japan", "Germany", "Germany", "Germany", "USA"};
        //todo - replace array with an ArrayList and print out the results
        ArrayList<String> carBrandsArrList = new ArrayList<>(List.of(array));
        System.out.println(carBrandsArrList);
        //todo - replace array with a HashSet and print out the results
        Set<String> carBrandsHashSet = new HashSet<>(List.of(array));
        System.out.println(carBrandsHashSet);
        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<String, String> carBrandsHashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            carBrandsHashMap.put(array[i], arrayOrigination[i]);
        }
        System.out.println(carBrandsHashMap);
    }
}
