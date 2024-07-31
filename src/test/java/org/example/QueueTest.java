package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class QueueTest {

    @Test
    public void test() {
        Queue q = new Queue();
        IntStream.range(0,5).forEachOrdered(q::add);
        IntStream.range(0,5).forEachOrdered(i -> {
            try {
                Assertions.assertEquals(i, q.get());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }

    @Test
    public void testException() throws Exception {
        Queue q = new Queue();
        Exception thrown = assertThrows(
                Exception.class,
                q::get,
                "Expected q.get() to throw, but it didn't"
        );

        Assertions.assertTrue(thrown.getMessage().contains("Empty Queue!"));
    }
}
