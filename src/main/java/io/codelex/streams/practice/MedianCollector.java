package io.codelex.streams.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class MedianCollector implements Collector<Double, List<Double>, Double> {


    @Override
    public Supplier<List<Double>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Double>, Double> accumulator() {
        return List::add;
    }

    @Override
    public BinaryOperator<List<Double>> combiner() {
        return (l1, l2) -> {
            l1.addAll(l2);
            return l1;
        };
    }

    @Override
    public Function<List<Double>, Double> finisher() {
        return list -> {
            Collections.sort(list);
            int size = list.size();
            if (size % 2 == 0) {
                int middleIndex = size / 2;
                return (list.get(middleIndex - 1) + list.get(middleIndex)) / 2.0;
            } else {
                return list.get(size / 2);
            }
        };
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.emptySet();
    }
}









