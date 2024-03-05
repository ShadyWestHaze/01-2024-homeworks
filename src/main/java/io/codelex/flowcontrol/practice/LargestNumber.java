package io.codelex.flowcontrol.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestNumber {

    //TODO: Write a Java program to to find the largest of three numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largestNumber=0;
        ArrayList<Integer> largestNrList = new ArrayList<>();
        System.out.print("Input the 1st number: ");
        largestNrList.add(in.nextInt());

        System.out.print("Input the 2nd number: ");
        largestNrList.add(in.nextInt());

        System.out.print("Input the 3rd number: ");
        largestNrList.add(in.nextInt());
        for  (Integer i: largestNrList){
                if(i > largestNumber){
                    largestNumber = i;
                }
        }
        System.out.printf("%d is the largest number",largestNumber);
        /*
        todo - expected output:
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
         */
    }
}
