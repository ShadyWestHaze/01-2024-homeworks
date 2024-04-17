package io.codelex.multithreading.simplified;

import java.util.List;

public class SumAllNumbersThread implements Runnable {

    private final List<Integer> numbers;

    public SumAllNumbersThread(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of all numbers: " + sum);
    }
}
