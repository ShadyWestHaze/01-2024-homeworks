package io.codelex.JavaAdvancedTest.Exercise4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseFile {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\Sir Shady\\IdeaProjects\\01-2024-homeworks\\src\\main\\java\\io\\codelex\\JavaAdvancedTest\\Exercise4\\NormalText";
        String outputFile = "C:\\Users\\Sir Shady\\IdeaProjects\\01-2024-homeworks\\src\\main\\java\\io\\codelex\\JavaAdvancedTest\\Exercise4\\ReversedFile";

        reverseFile(inputFile, outputFile);
    }

    public static void reverseFile(String inputFile, String outputFile) {
        List<String> listOfLines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                Collections.reverse(Arrays.asList(words));
                String reversedLine = String.join(" ", words);
                listOfLines.add(reversedLine);
            }
            Collections.reverse(listOfLines);
        } catch (IOException e) {
            System.err.println("Error with " + e.getMessage());
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (String reversedLine : listOfLines) {
                writer.write(reversedLine);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error with " + e.getMessage());
        }
    }
}

