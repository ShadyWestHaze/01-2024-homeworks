package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "src/main/resources/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(file);
        Scanner scanner = new Scanner(System.in);
        List<String> start = new ArrayList<>();
        List<String> end = new ArrayList<>();
        Set<String> listOfAllCities = new HashSet<>();
        List<String> listOfChosenRout = new ArrayList<>();
        for (String line : Files.readAllLines(path, charset)) {
            String[] parts = line.split("\\s*->\\s*");
            start.add(parts[0].trim());
            end.add(parts[1].trim());
            listOfAllCities.add(parts[0]);
            listOfAllCities.add(parts[1]);
            //System.out.println(parts[0] + " " + parts[1]);
        }

        System.out.println("\n" + listOfAllCities);
        System.out.println("Type in a city from above as your starting rout:");
        String startingCity = scanner.nextLine();
        String currentCity = startingCity;
        String nextCity;
        do {
            listOfChosenRout.add(currentCity);
            System.out.println("From " + currentCity + " you are able to fly to:");
            for (int i = 0; i < start.size(); i++) {
                if (start.get(i).equals(currentCity)) {
                    System.out.println(end.get(i));
                }
            }
            System.out.println("Choose a city you want to fly to:");
            nextCity = scanner.nextLine();
            currentCity = nextCity;
        } while (!nextCity.equals(startingCity));

        System.out.println("Your chosen rout will be:");
        for (int i = 0; i < listOfChosenRout.size(); i++) {
            if (i == listOfChosenRout.size() - 1) {
                System.out.print(listOfChosenRout.get(i) + "->" + startingCity);
            } else {
                System.out.print(listOfChosenRout.get(i) + "->");
            }
        }
    }
}
