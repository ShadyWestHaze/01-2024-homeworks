package io.codelex.JavaAdvancedTest.Exercise5;

import java.util.List;
import java.util.function.Predicate;

public class PartOf {
    public static <T> double partOf(List<T> list, Predicate<T> condition) {
        long countSatisfyingCondition = list.stream()
                .filter(condition)
                .count();
        return (double) countSatisfyingCondition / list.size();
    }
}
