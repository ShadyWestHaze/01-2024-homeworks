package src.main.java.io.codelex.arrays.practice;

import java.util.ArrayList;

public class ChangeArray {
    public static void main(String[] args) {
        int min = 10;
        int max = 100;

        ArrayList<Integer> numbersArr1 = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            int randomNum = (int) (Math.random() * (max - min + 1)) + min;
            numbersArr1.add(randomNum);
        }
        ArrayList<Integer> numbersArr2 = new ArrayList<>(numbersArr1);
        numbersArr1.remove(numbersArr1.size() - 1);
        numbersArr1.add(-7);

        System.out.println(numbersArr1 + "\n" + numbersArr2);
    }
}
