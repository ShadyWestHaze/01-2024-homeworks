package src.main.java.io.codelex.collections.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        List<Integer> digitList = new ArrayList<>();
        int sum = 0;
        while (userInput > 0) {
            digitList.add(userInput % 10);
            userInput = userInput / 10;
        }
        for (Integer integer : digitList) {
            sum += integer * integer;
        }
        if (sum % 10 == 1) {
            System.out.println("Int is happy");
        } else {
            System.out.println("Int is not happy");
        }


    }
}
