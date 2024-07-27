package org.example;

import org.junit.Test;

import java.util.stream.IntStream;

public class StackTest {

    @Test
    public void test() {
        Stack s = new Stack();
        IntStream.range(0, 5).forEachOrdered(s::push);
        IntStream.range(0, 5).forEachOrdered(v -> {
            try {
                System.out.println(s.pop());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                throw new RuntimeException(e);
            }
        });
    }
}
