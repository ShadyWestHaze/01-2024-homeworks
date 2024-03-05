package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    //TODO: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");



        if (in.hasNextLong()) {
            long n = in.nextLong();
            int devidedCount =0;
            long devisionRate = 10;


            if (n<0) {
                n *= -1;
            }

            if (n>= 10000000000L) {
                System.out.println("Number is greater or equals 10,000,000,000!");
            } else {
                /*
                int digits = 1;
                if () {
                    digits = 2;
                } else if (?) {
                    digits = 3;
                } else if (?) {
                    digits = 4;
                } else if (?) {
                    digits = 5;
                } else if (?) {
                    digits = 6;
                } else if (?) {
                    digits = 7;
                } else if (?) {
                    digits = 8;
                } else if (?) {
                    digits = 9;
                } else if (?) {
                    digits = 10;
                }
                */
                while (n >= 1) {

                    n /= devisionRate;
                    devidedCount++;
                }

                System.out.println("Number of digits in the number: " + devidedCount);

            }


        } else {
            System.out.println("The number is not a long");
        }

    }

}
