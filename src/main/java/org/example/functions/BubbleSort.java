package org.example.functions;

import java.util.function.Function;

public class BubbleSort implements Function<Integer[], Integer[]> {

    @Override
    public Integer[] apply(Integer[] integers) {
        return new Integer[0];
    }

    @Override
    public <V> Function<V, Integer[]> compose(Function<? super V, ? extends Integer[]> before) {
        return Function.super.compose(before);
    }

    @Override
    public <V> Function<Integer[], V> andThen(Function<? super Integer[], ? extends V> after) {
        return Function.super.andThen(after);
    }
}
