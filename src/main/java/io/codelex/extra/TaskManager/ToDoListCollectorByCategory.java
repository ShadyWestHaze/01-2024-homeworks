package io.codelex.extra.TaskManager;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class ToDoListCollectorByCategory implements Collector<Task,
        Map<Category, List<Task>>,
        Map<Category, List<Task>>> {
    @Override
    public Supplier<Map<Category, List<Task>>> supplier() {
        return HashMap::new;
    }

    @Override
    public BiConsumer<Map<Category, List<Task>>, Task> accumulator() {
        return (map, task) -> map.computeIfAbsent(task.getCategory(), k -> new ArrayList<>()).add(task);
    }

    @Override
    public BinaryOperator<Map<Category, List<Task>>> combiner() {
        return (map1, map2) -> {
            map2.forEach((category, tasks) -> map1.merge(category, tasks, (list1, list2) -> {
                list1.addAll(list2);
                return list1;
            }));
            return map1;
        };
    }

    @Override
    public Function<Map<Category, List<Task>>, Map<Category, List<Task>>> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.emptySet();
    }
}
