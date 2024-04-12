package io.codelex.oop.summary.LazyBox;

import java.util.function.Supplier;

public class LazyBox<T> {
    private final Supplier<T> supplier;
    private T object;

    public LazyBox(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T get() {
        if (object == null) {
            object = supplier.get();
            System.out.println("Value created");
        }
        return object;
    }
}
