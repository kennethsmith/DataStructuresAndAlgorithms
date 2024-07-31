package org.example.functions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void apply() {
        Integer[] e = {0,1,2,3,4,5,6,7,8};
        Integer[] i = {8,7,6,5,4,3,2,0,1};
        BubbleSort bs = new BubbleSort();
        assertArrayEquals(e, bs.apply(i));
    }

    @Test
    void compose() {
        Function<Integer[], Integer[]> multiply = (a) -> Arrays.stream(a).map(v -> v * 2).toArray(Integer[]::new);
        Integer[] e = {0,2,4,6,8,10,12,14,16};
        Integer[] i = {8,7,6,5,4,3,2,0,1};
        BubbleSort bs = new BubbleSort();
        assertArrayEquals(e, bs.compose(multiply).apply(i));
    }

    @Test
    void andThen() {
        Function<Integer[], Integer[]> add = (a) -> Arrays.stream(a).map(v -> v + 3).toArray(Integer[]::new);
        Integer[] e = {3,4,5,6,7,8,9,10,11};
        Integer[] i = {8,7,6,5,4,3,2,0,1};
        BubbleSort bs = new BubbleSort();
        assertArrayEquals(e, bs.andThen(add).apply(i));
    }
}