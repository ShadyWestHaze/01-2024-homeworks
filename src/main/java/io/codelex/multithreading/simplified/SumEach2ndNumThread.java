package io.codelex.multithreading.simplified;

import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumEach2ndNumThread implements Runnable {

    private final List<Integer> numbers;
    private final int nthRange;

    public SumEach2ndNumThread(List<Integer> numbers, int nthRange) {
        this.numbers = numbers;
        this.nthRange = nthRange;
    }

    @Override
    public void run() {
        int sum = IntStream.range(0, numbers.size())
                .filter(n -> n % nthRange == 0)
                .mapToObj(numbers::get)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of every second number is: " + sum);
    }
}

