package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void testException() throws Exception {
        Stack s = new Stack();
        Exception thrown = assertThrows(
                Exception.class,
                s::pop,
                "Expected s.pop() to throw, but it didn't"
        );

        Assertions.assertTrue(thrown.getMessage().contains("Empty Stack!"));
    }
}
