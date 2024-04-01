package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/*
00-09:
10-19: *
20-29: *
30-39: **
40-49: *
50-59: *****
60-69: *******
70-79: *****************
80-89: ******
90-99: **********
  100: *
* */
public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "src/main/resources/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        String[] scoresList = scores.split("\\s+");
        ArrayList<String> marksList = new ArrayList<>(Arrays.asList("00-09:", "10-:19", "20-29:", "30-39:", "40-49:",
                "50-59:", "60-69:", "70-79:", "80-89:", "90-99:", "  100:"));
        int[] markFrequency = new int[11];
        for (int i = 0; i < scoresList.length; i++) {
            int score = Integer.parseInt(scoresList[i]);
            if (score < 10) {
                markFrequency[0]++;
            } else if (score < 20) {
                markFrequency[1]++;
            } else if (score < 30) {
                markFrequency[2]++;
            } else if (score < 40) {
                markFrequency[3]++;
            } else if (score < 50) {
                markFrequency[4]++;
            } else if (score < 60) {
                markFrequency[5]++;
            } else if (score < 70) {
                markFrequency[6]++;
            } else if (score < 80) {
                markFrequency[7]++;
            } else if (score < 90) {
                markFrequency[8]++;
            } else if (score < 100) {
                markFrequency[9]++;
            } else {
                markFrequency[10]++;
            }
        }

        for (int i = 0; i < marksList.size(); i++) {
            System.out.println(marksList.get(i) + " " + "*".repeat(Math.max(0, markFrequency[i])));
        }
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(file);

        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
