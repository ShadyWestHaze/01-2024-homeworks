package io.codelex.multithreading.simplified;

import java.util.List;
import java.util.OptionalDouble;

public class AvrageNumberThread implements Runnable {
    public List<Integer> numbers;

    public AvrageNumberThread(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        double averageNum = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElseThrow();

        int averageInt = (int) averageNum;
        System.out.println("Average number is: " + averageInt);
    }
}
