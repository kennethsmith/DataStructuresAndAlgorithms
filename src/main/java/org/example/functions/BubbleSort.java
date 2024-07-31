package org.example.functions;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;

public class BubbleSort implements Function<Integer[], Integer[]> {

    @Override
    public Integer[] apply(Integer[] i) {
        int[] ints = Arrays.stream(i).mapToInt(Integer::intValue).toArray();
        org.example.sort.BubbleSort b = new org.example.sort.BubbleSort(ints);
        return IntStream.of(b.sort()).boxed().toArray(Integer[]::new);
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
