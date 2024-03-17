package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n, mulipliedNr = 1;

        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (i = 1; i < n; i++) {
            mulipliedNr = mulipliedNr * n;
            System.out.println(mulipliedNr);
        }
    }

}
