package src.main.java.io.codelex.arithmetic.practice;

public class Product1ToN {
    public static void main(String[] args) {
        int currentNum = 1;
        int lowestNum = 1;
        int highestNum = 10;



    for(int i = lowestNum; i <= highestNum; i++){
        currentNum *= i;

    }

       System.out.printf("The product of integers from %d to %d is %d%n", lowestNum, highestNum, currentNum);

    }
}
