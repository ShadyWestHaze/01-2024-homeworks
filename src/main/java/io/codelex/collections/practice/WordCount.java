package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "src/main/resources/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        Files.readAllLines(path, charset);
        final Path path1 = Paths.get(file);
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;


        Files.lines(path1, charset).forEach(System.out::println);
        for (String line : Files.readAllLines(path1, charset)) {
            lineCount++;
            String[] words = line.split("\\s+");
            wordCount += words.length;
            charCount += line.length();


        }
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);
    }
}
