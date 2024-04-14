package io.codelex.arrays.practice;

public class Exercise3 {

    //TODO: Write a Java program to calculate the average value of array elements.
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Sum value of the array elements is : " + sum);
        System.out.printf("Average value of the array elements is :%.2f ", average);

    }
}
