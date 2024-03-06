package io.codelex.arithmetic.practice;

// text print formating format() info https://www.developer.com/java/java-string-format-method/
public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        int lowerBound = 1;
        int upperBound = 100;
        double average;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
        }

        average = (double) sum / upperBound;

        //printf() = format()
        System.out.printf("The sum of %d to %d is %d%n", lowerBound, upperBound, sum);
        System.out.printf("The average is %.1f%n ", average);

    }
}