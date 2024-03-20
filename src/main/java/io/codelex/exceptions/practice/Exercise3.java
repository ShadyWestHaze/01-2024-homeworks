package io.codelex.exceptions.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {
    public static void main(String[] args) {
        File testFile = new File("test.txt");
        try {
            FileWriter writer = new FileWriter(testFile);
            writer.write("Hello, World!\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        cat(testFile);
    }

    public static void cat(File file) {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
